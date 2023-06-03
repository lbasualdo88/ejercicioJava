package Entidad;

import Enumeraciones.ConsumoEner;

public class Televisor extends Electrodomestico {
    private Integer resolucion;
    private boolean sintonizador;
    
    public Televisor(double precio, String color, ConsumoEner consumo, double peso, Integer resolucion, boolean sintonizador ) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    public Televisor() {
    }
    public Integer getResolucion() {
        return resolucion;
    }
    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }
    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    @Override
    public String toString() {
        return "Televisor [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso +
        ", resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
    }

    
}
