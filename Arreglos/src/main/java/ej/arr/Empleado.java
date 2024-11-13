
package ej.arr;

public class Empleado {
    
    private String codigo;
    private String nombre;
    private String departamento;
    private int anio;
    private float[] ventas = new float[12];
    
    public Empleado() {
        super();
    }

    public Empleado(String codigo, String nombre, String departamento, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getVentas(int mes) {
        return ventas[mes-1];
    }

    public void setVentas(float venta, int mes) {
        ventas[mes-1] = venta;
    }
    
    public String getDatos() {
        String datos = "Mes         Venta\n" +
                       "-----------------\n";
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != 0) {
                datos = datos + (i+1) + "         " +
                    ventas[i] + "$\n";
            }
        }
        return "Codigo: " + codigo
               + "\nNombre: " + nombre
               + "\nDepartamento: " + departamento
               + "\nAnio: " + anio
               + "\n" + datos;
    }
    
}
