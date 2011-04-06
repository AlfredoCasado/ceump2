package es.ceu.mpII.gestor.alumnos.infraestructura;

import es.ceu.mpII.gestor.alumnos.modelo.Alumno;
import es.ceu.mpII.gestor.alumnos.modelo.MecanismoDeNotificacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RepositorioDeAlumnosEnBaseDeDatos implements RepositorioAlumnos {
    
    private final ProveedorDeConexionesABaseDeDatos proveedorConexiones;

    public RepositorioDeAlumnosEnBaseDeDatos(ProveedorDeConexionesABaseDeDatos proveedorConexiones) {
        this.proveedorConexiones = proveedorConexiones;
    }
    
    public Alumno[] dameTodosLosAlumnos() {
        Connection connection = null;
        ResultSet result = null;
        try {
            Set<Alumno> alumnos = new TreeSet();
            
            connection = proveedorConexiones.obtenerLaConexion();
            result = ejecutarConsultaParaObtenerTodosLosAlumnos(connection);
            
            while(result.next()) {
                Alumno alumnoLeido = leerAlumno(result);
                alumnos.add(alumnoLeido);
            }
            
            return alumnos.toArray(new Alumno[0]);
            
        } catch (SQLException ex) {
            throw new RuntimeException("error de acceso a la base de datos", ex);
        } finally {
            cerrarRecursosDeBaseDeDatos(connection, result);
        }
    }

    private void cerrarRecursosDeBaseDeDatos(Connection connection, ResultSet result) {
        try {
            if (connection != null) connection.close();
            if (result != null) result.close();
        } catch (SQLException ex) {}
    }

    private ResultSet ejecutarConsultaParaObtenerTodosLosAlumnos(Connection connection) throws SQLException {
        Statement queryTodosLosAlumnos = connection.createStatement();
        ResultSet result = queryTodosLosAlumnos.executeQuery("SELECT * FROM alumno");
        return result;
    }

    private Alumno leerAlumno(ResultSet result) throws SQLException {
        
        final String nombre = result.getString("Nombre");
        final int nota = result.getInt("NotaMedia");
        final String mecanismoNotificacion = result.getString("MecanismoNotificacion");
        final String Direccion = result.getString("Direccion");
        MecanismoDeNotificacion notificacion = null;
        if ("sms".equals(mecanismoNotificacion)) {
             notificacion = MecanismoDeNotificacion.SMS;
        } else {
             notificacion = MecanismoDeNotificacion.MAIL;
        }
        Alumno alumnoLeido = new Alumno(nombre, nota,notificacion, Direccion);
        return alumnoLeido;
        
    }

    public void crear(Alumno alumno) {
        Connection connection = null;
        ResultSet result = null;
        try {
            connection = proveedorConexiones.obtenerLaConexion();
            PreparedStatement queryInsercionAlumno = connection.prepareStatement("INSERT INTO Alumno (Nombre,NotaMedia,MecanismoNotificacion,Direccion) VALUES(?,?,?,?)");
            queryInsercionAlumno.setString(1, alumno.nombre());
            queryInsercionAlumno.setInt(2, alumno.notaMedia());
            queryInsercionAlumno.setString(3, alumno.dimeTuTipoDeNotificacion().toString());
            queryInsercionAlumno.setString(4, alumno.direccion());
            queryInsercionAlumno.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("error creando alumno", ex);
        } finally {
            cerrarRecursosDeBaseDeDatos(connection, result);
        }
    }

 }
