package Servicios;
import Entidad.Electrodomestico;
import Enumeraciones.ConsumoEner;

public interface ElectServicio {
    
    

    public abstract ConsumoEner comprobarConsumoEnergetico(Electrodomestico e1, String consumo);   
    public abstract String comprobarColor(Electrodomestico e1, String color);         
    public abstract Electrodomestico crearElectrodomestico();       
    public abstract void precioFinal(Electrodomestico e1, double peso, double precio);    
    
    
    
    
    
    
    
    public abstract void mostrarObjeto(Electrodomestico e1);       
    
}
