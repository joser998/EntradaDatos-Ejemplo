package test;
import java.util.*;
public class EntradaDatos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String captura = null;
        
        System.out.print("Introduce un dato: ");
        captura = sc.nextLine();
        
        while(!"salir".equals(captura)){
            System.out.println("El dato es: "+captura);
            captura = sc.nextLine();
        }
    }
}