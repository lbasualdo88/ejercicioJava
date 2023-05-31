package Servicios;

import java.util.Scanner;

import Entidad.Electrodomestico;
import Enumeraciones.ConsumoEner;

public interface InterServicio {
    static Scanner leer = new Scanner(System.in);
    Electrodomestico e1 = new Electrodomestico();
   
       public ConsumoEner comprobarConsumoEnergetico() {
           String consumo = leer.next();
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
   
       public String comprobarColor() {
           String color =  leer.next();
           if (color.equalsIgnoreCase("negro")  || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
               e1.setColor(color);         
              } else {
               color = "blanco";
               e1.setColor(color);       
              }
           return color;
           }  
       public Electrodomestico crearElectrodomestico() {
           System.out.println("------------------------------");
           System.out.println("Se le asigna por defecto 1000$");
           double precio = 1000;
           System.out.println("----------------------------------");
           System.out.println("Ingrese color del electrodomestico");
           System.out.println("----------------------------------");
           String color =  comprobarColor();
           System.out.println("-----------------------");
           System.out.println("Ingrese tipo de consumo");
           System.out.println("-----------------------");
           ConsumoEner consumo = comprobarConsumoEnergetico();    
           System.out.println("------------------------------------");
           System.out.println("Ingrese el peso del Electrodomestico"); 
           System.out.println("------------------------------------");
           double peso = leer.nextDouble();
           e1 = new Electrodomestico(precio, color, consumo, peso);
    return e1;
   }
       
       public void precioFinal() {
           if (e1.getPeso() <= 19 ) {
               e1.setPrecio(e1.getPrecio() + 100);
           } else if (e1.getPeso() > 19 && e1.getPeso() <= 49) {
               e1.setPrecio(e1.getPrecio() + 500);
           } else if (e1.getPeso() > 50 && e1.getPeso() <= 79) {
               e1.setPrecio(e1.getPrecio() + 800);
           } else {
               e1.setPrecio(e1.getPrecio() + 1000);
           }
   
            int opcion = 0;
           ConsumoEner [] enums = ConsumoEner.values();
       for (int i = 0; i < enums.length; i++) {
           if (e1.getConsumo().equals(enums[i])) {
                opcion = i+1;
           }
       } 
           switch (opcion) {
               case 1:
               e1.setPrecio(e1.getPrecio() + 1000);          
               break;
               case 2:
               e1.setPrecio(e1.getPrecio() + 800);
               break;
               case 3:
               e1.setPrecio(e1.getPrecio() + 600);
               break;
               case 4:
               e1.setPrecio(e1.getPrecio() + 500);
               break;
               case 5:
               e1.setPrecio(e1.getPrecio() + 300);
               break;
               case 6:
               e1.setPrecio(e1.getPrecio() + 100);
               break;
           } 
       }
       public void mostrarObjeto() {
           System.out.println(e1);
       }
   
   }
   

