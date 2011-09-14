package es.ceu.mpII.swing.models;

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class ModeloArbolFicheros implements TreeModel {

    protected File root;

    public ModeloArbolFicheros(File root) {
        this.root = root;
    }

    public Object getRoot() {
        return root;
    }

    public boolean isLeaf(Object node) {
        return ((File) node).isFile();
    }

    public int getChildCount(Object parent) {
        String[] children = childOf(parent);
        if (children == null) {
            return 0;
        }
        return children.length;
    }

    public Object getChild(Object parent, int index) {
        String[] children = childOf(parent);;
        if ((children == null) || (index >= children.length)) {
            return null;
        }

        return new File((File) parent, children[index]) {
            @Override
            public String toString() {
                int numeroHijos = 0;
                if (this.list() != null) {
                    numeroHijos = this.list().length;
                }
                return this.getName() + "hijos:" + numeroHijos;
            }
        };
    }

    public int getIndexOfChild(Object parent, Object child) {
        String[] children = childOf(parent);
        if (children == null) {
            return -1;
        }
        String childname = ((File) child).getName();
        for (int i = 0; i < children.length; i++) {
            if (childname.equals(children[i])) {
                return i;
            }
        }
        return -1;
    }

    private String[] childOf(Object parent) {
        return ((File) parent).list(new FilenameFilter() {
            public boolean accept(File file, String fileName) {
                return !fileName.startsWith(".");
            }
        });
    }

    // estos tres metodos no son necesarios en un árbol de solo lectura
    public void valueForPathChanged(TreePath path, Object newvalue) {
    }

    public void addTreeModelListener(TreeModelListener l) {
    }

    public void removeTreeModelListener(TreeModelListener l) {
    }
}

