package Main;

import Entidad.Lavadora;
import Servicios.LavadoraSevicio;

public class App {
    public static void main(String[] args) throws Exception {
    
LavadoraSevicio l1 = new LavadoraSevicio();
Lavadora lavadora = l1.crearLavadora();

System.out.println(lavadora);







    }
}
