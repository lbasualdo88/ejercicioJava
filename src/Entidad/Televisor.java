package Entidad;

import Enumeraciones.ConsumoEner;

public class Televisor extends Electrodomestico {
    private Integer resolucion;
    private boolean sintonizador;
    
    public Televisor(Integer precio, String color, ConsumoEner consumo, Integer resolucion, boolean sintonizador, Integer peso) {
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

    
}
