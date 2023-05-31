package Entidad;

import Enumeraciones.ConsumoEner;
import Servicios.InterServicio;

public class Lavadora extends Electrodomestico implements InterServicio {
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
    public ConsumoEner comprobarConsumoEnergetico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarConsumoEnergetico'");
    }

    @Override
    public String comprobarColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarColor'");
    }

    @Override
    public Electrodomestico crearElectrodomestico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearElectrodomestico'");
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'precioFinal'");
    }

    @Override
    public void mostrarObjeto() {
       
        throw new UnsupportedOperationException("Unimplemented method 'mostrarObjeto'");
    }

    

    
}
