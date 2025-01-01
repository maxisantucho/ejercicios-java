
package proyecto;

public class Estante {
    
    private int idEstante;
    private String nombreProducto;
    private boolean estado;

    public Estante(int idEstante, String nombreProducto, boolean estado) {
        this.idEstante = idEstante;
        this.nombreProducto = nombreProducto;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "{'idEstante':'" + idEstante + "', 'productoAsignado':'" + nombreProducto + "', 'estado':'ocupado'}";
    }
    
}
