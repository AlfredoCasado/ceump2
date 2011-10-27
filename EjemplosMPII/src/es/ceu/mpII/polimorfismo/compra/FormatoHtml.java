package es.ceu.mpII.polimorfismo.compra;

class FormatoHtml implements Formato {

    private String html;

    public void EscribirNombre(String nombre) {
       html="<p>" + nombre + "</p><table>";
    }

    public void EscribirLinea(LineaDeCompra linea) {
       html+="<tr>";
       html+=  "<td>" + linea.nombreProducto() + "</td>";
       html+=  "<td>" + linea.precioProducto() + "</td>";
       html+=  "<td>" + linea.numeroUnidades() + "</td>";
       html+=  "<td>" + linea.total() + "</td>";
       html+="</tr>";
    }

    public void escribirTotal(int total) {
       html+="<tr>";
       html+=  "<td>" + total + "</td>";
       html+="</tr>";
    }

    public String comoCadena() {
        return html+"</table>";
    }


}
