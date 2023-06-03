package Main;

import Entidad.Lavadora;
import Entidad.Televisor;
import Servicios.LavadoraSevicio;
import Servicios.TelevisorServicio;

public class App {
    public static void main(String[] args) throws Exception {
    
LavadoraSevicio l1 = new LavadoraSevicio();
Lavadora lavadora = l1.crearLavadora();
l1.precioLavadoraFinal(lavadora);
TelevisorServicio t1 = new TelevisorServicio();
Televisor televisor = t1.crearTelevisor();
t1.precioTelevisorFinal(televisor);

System.out.println("**************");
System.out.println("El precio final de la lavadora es: "+lavadora.getPrecio());
System.out.println("**************");


System.out.println("**************");
System.out.println("El precio final del televisor es: "+televisor.getPrecio());
System.out.println("**************");

    }
}
