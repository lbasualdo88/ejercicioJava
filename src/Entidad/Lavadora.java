package Entidad;

import Enumeraciones.ConsumoEner;


public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(double precio, String color, ConsumoEner consumo, double peso, int carga ) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso +
        ", carga=" + carga + "]";
    }

 

   

    
}
