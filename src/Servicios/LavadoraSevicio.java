package Servicios;

import java.util.Scanner;

import Entidad.Lavadora;
import Enumeraciones.ConsumoEner;
import Entidad.Electrodomestico;

public class LavadoraSevicio implements ElectServicio{
    
    
    Scanner leer = new Scanner(System.in);

    
    
    public Lavadora crearLavadora() {
        

        
        Electrodomestico e2 = crearElectrodomestico();
        precioFinal(e2, e2.getPeso(), e2.getPrecio());
        
        System.out.println("-------------");
        System.out.println("Ingrese Carga");
        System.out.println("-------------");
        int carga = leer.nextInt();
        
        return new Lavadora(e2.getPrecio(), e2.getColor(), e2.getConsumo(), e2.getPeso(), carga);
    }

    public void mostrarLavadora() {
    }
    public void precioLavadoraFinal() {
    }

    @Override
    public ConsumoEner comprobarConsumoEnergetico(Electrodomestico e1, String consumo) {
            //String consumo = leer.next();
        ConsumoEner [] enums = ConsumoEner.values();
    for (int i = 0; i < enums.length; i++) {
        if (enums[i].toString().equals(consumo)) {
            e1.setConsumo(enums[i]);     
            break; 
          } else {
            e1.setConsumo(enums[5]);
          }
        }
          return e1.getConsumo();
    }

    @Override
    public String comprobarColor( Electrodomestico e1, String color ) {
       // String color =  leer.next();
        if (color.equalsIgnoreCase("negro")  || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            e1.setColor(color);         
           } else {
            color = "blanco";
            e1.setColor(color);       
           }
           return color;
    }

    @Override
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e1 = new Electrodomestico();
        System.out.println("------------------------------");
        System.out.println("Se le asigna por defecto 1000$");
        System.out.println("----------------------------------");
        System.out.println("Ingrese color del electrodomestico");
        System.out.println("----------------------------------");
        String color =  leer.next();
        comprobarColor(e1, color);
        System.out.println("-----------------------");
        System.out.println("Ingrese tipo de consumo");
        System.out.println("-----------------------");
        String consumo = leer.next();
        comprobarConsumoEnergetico(e1, consumo);    
        System.out.println("------------------------------------");
        System.out.println("Ingrese el peso del Electrodomestico"); 
        System.out.println("------------------------------------");
        double peso = leer.nextDouble();
        e1.setPeso(peso);
        
 return e1;
    }
    @Override
    public void precioFinal(Electrodomestico e2, double peso, double precio) {
        if (e2.getPeso() <= 19 ) {
            e2.setPrecio(e2.getPrecio() + 100);
        } else if (e2.getPeso() > 19 && e2.getPeso() <= 49) {
            e2.setPrecio(e2.getPrecio() + 500);
        } else if (e2.getPeso() > 50 && e2.getPeso() <= 79) {
            e2.setPrecio(e2.getPrecio() + 800);
        } else {
            e2.setPrecio(e2.getPrecio() + 1000);
        }

         int opcion = 0;
        ConsumoEner [] enums = ConsumoEner.values();
    for (int i = 0; i < enums.length; i++) {
        if (e2.getConsumo().equals(enums[i])) {
             opcion = i+1;
        }
    } 
        switch (opcion) {
            case 1:
            e2.setPrecio(e2.getPrecio() + 1000);          
            break;
            case 2:
            e2.setPrecio(e2.getPrecio() + 800);
            break;
            case 3:
            e2.setPrecio(e2.getPrecio() + 600);
            break;
            case 4:
            e2.setPrecio(e2.getPrecio() + 500);
            break;
            case 5:
            e2.setPrecio(e2.getPrecio() + 300);
            break;
            case 6:
            e2.setPrecio(e2.getPrecio() + 100);
            break;
        } 
    }

    @Override
    public void mostrarObjeto(Electrodomestico e2) {
        System.out.println(e2);
    } 
}

