package Servicios;

import java.util.Scanner;

import Entidad.Televisor;
import Entidad.Electrodomestico;
import Enumeraciones.ConsumoEner;

public class TelevisorServicio implements ElectServicio{

    Scanner leer = new Scanner(System.in);
    
    public Televisor crearTelevisor() {
        Televisor t1;
        Electrodomestico e3 = crearElectrodomestico();
        
        System.out.println("------------------");
        System.out.println("Ingrese resolucion");
        System.out.println("------------------");
        Integer resolucion = leer.nextInt();
        System.out.println("------------------");
        System.out.println("Tiene sintonizador?");
        System.out.println("------------------");
        System.out.println("1-si");
        System.out.println("2-no");
        int opcion = leer.nextInt();
        boolean sintonizador;
        if (opcion == 1) {
            sintonizador = true;  
        } else {
            sintonizador = false;
        }
        precioFinal(e3, e3.getPeso(), e3.getPrecio());
        t1 = new Televisor(e3.getPrecio(), e3.getColor(), e3.getConsumo(), e3.getPeso(), resolucion, sintonizador);
        return t1;
    }
    public void precioTelevisorFinal(Televisor t1) {
        if (t1.getResolucion() > 40 ) {
            t1.setPrecio(t1.getPrecio() + (t1.getPrecio() * 0.3));
        }
        if (t1.isSintonizador()) {
            t1.setPrecio(t1.getPrecio() + 500);
        }
    }
    
    @Override
    public ConsumoEner comprobarConsumoEnergetico(Electrodomestico e1, String consumo) {
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
        double precio = 1000;
        e1.setPrecio(precio);
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
    public void precioFinal(Electrodomestico e3, double peso, double precio) {

////////Precio por Peso////////////
        if (e3.getPeso() <= 19 ) {
            e3.setPrecio(e3.getPrecio() + 100);
        } else if (e3.getPeso() > 19 && e3.getPeso() <= 49) {
            e3.setPrecio(e3.getPrecio() + 500);
        } else if (e3.getPeso() > 50 && e3.getPeso() <= 79) {
            e3.setPrecio(e3.getPrecio() + 800);
        } else {
            e3.setPrecio(e3.getPrecio() + 1000);
        }
////////Precio por Consumo///////////
         int opcion = 0;
        ConsumoEner [] enums = ConsumoEner.values();
    for (int i = 0; i < enums.length; i++) {
        if (e3.getConsumo().equals(enums[i])) {
             opcion = i+1;
        }
    } 
        switch (opcion) {
            case 1:
            e3.setPrecio(e3.getPrecio() + 1000);          
            break;
            case 2:
            e3.setPrecio(e3.getPrecio() + 800);
            break;
            case 3:
            e3.setPrecio(e3.getPrecio() + 600);
            break;
            case 4:
            e3.setPrecio(e3.getPrecio() + 500);
            break;
            case 5:
            e3.setPrecio(e3.getPrecio() + 300);
            break;
            case 6:
            e3.setPrecio(e3.getPrecio() + 100);
            break;
        } 
    }
}
