package Entidad;

import Enumeraciones.ConsumoEner;


public class Lavadora extends Electrodomestico {
    private String carga;

    public Lavadora(double precio, String color, ConsumoEner consumo, String carga, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora [carga=" + carga + "]";
    }

 

   

    
}
