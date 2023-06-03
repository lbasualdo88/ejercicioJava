package Entidad;

import Enumeraciones.ConsumoEner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected ConsumoEner consumo;
    protected double peso;

    public Electrodomestico() {
    
    }
    public Electrodomestico(double precio, String color, ConsumoEner consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public ConsumoEner getConsumo() {
        return consumo;
    }
    public void setConsumo(ConsumoEner consumo) {
        this.consumo = consumo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
                + "]";
    }
}