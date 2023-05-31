package Servicios;

import java.util.Scanner;
import Servicios.ElectServicio;
import Entidad.Lavadora;
import Entidad.Electrodomestico;

public class LavadoraSevicio{
    
    
    Scanner leer = new Scanner(System.in);
    
    
    ElectServicio e1 = new ElectServicio(); 
    public Lavadora crearLavadora() {
        
        Lavadora lava = (Lavadora) crearElectrodomestico();
        crearElectrodomestico();
        System.out.println(lava.getPrecio());
        System.out.println(lava.getColor());
        
        lava = new Lavadora();
        System.out.println(lava);
        return lava;
    }
    public void mostrarLavadora() {
    }
    public void precioFinal() {

    } 
}

/*
 * public Lavadora crearLavadora() {
        ServicioElectrodomestico servicioElectrodomestico = new ServicioElectrodomestico();
        servicioElectrodomestico.crearElectrodomestico();
        
        // Obtener los datos ingresados en el servicio de Electrodomestico
        String color = servicioElectrodomestico.getColor();
        char consumoEnergetico = servicioElectrodomestico.getConsumoEnergetico();
        double peso = servicioElectrodomestico.getPeso();
        
        // Crear el objeto Lavadora con los datos obtenidos
        Lavadora lavadora = new Lavadora(color, consumoEnergetico, peso);
        
        // Resto del código para configurar la Lavadora si es necesario
        
        return lavadora;
    }
}
 */