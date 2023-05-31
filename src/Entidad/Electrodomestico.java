package Entidad;

import java.util.Scanner;

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
    /* 
/*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible. 
public void comprobarConsumoEnergetico(String consumo) {
    ConsumoEner [] enums = ConsumoEner.values();
    for (int i = 0; i < enums.length; i++) {
        if (enums[i].toString().equals(consumo)) {
            this.consumo = enums[i];
            System.out.println(consumo);
            //System.out.println(enums[i]);
            break;
          } else {
            this.consumo = enums[5];
            System.out.println(enums[5]);
            break;
          }
    }
    /* 
    for (ConsumoEner aux : enums) {
      if (aux.values().toString().equals(consumo)) {
        this.consumo = aux;
        System.out.println(aux);
        break;
      } else {
        this.consumo = aux.F;
        System.out.println(aux.F);
      }
      //System.out.println(aux);
       }
       */
    

/*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible. 
public void comprobarColor(String color) {
   
   if (color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
    this.color = color;
   } else {
    this.color = "blanco";
   }
}
/*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000. 
Scanner leer = new Scanner(System.in);
public void crearElectrodomestico() {
  this.precio=1000;
  System.out.println("Elija color");
  String color = leer.next();
  comprobarColor(color.toLowerCase());
  System.out.println("Elija tipo de consumo");
  String consumo = leer.next();
  comprobarConsumoEnergetico(consumo);

}

/*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios: 
public void precioFinal() {

}

}

*/