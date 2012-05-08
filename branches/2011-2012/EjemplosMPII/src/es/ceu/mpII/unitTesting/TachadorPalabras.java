package es.ceu.mpII.unitTesting;

public class TachadorPalabras {

    String tachar(String cadenaATachar, String...palabrasATachar) { 
        for (String palabraATachar : palabrasATachar) {
            cadenaATachar = cadenaATachar.replace(palabraATachar, tantasXComoLetrasTenga(palabraATachar));
        }
        return cadenaATachar;
        
    }
    
    String tantasXComoLetrasTenga(String palabra) {
        String tachon = "";
        for(int i=0; i<palabra.length(); i++) {
            tachon+="x";
        }
        return tachon;
    }
    
    
    
    
    
    
}
