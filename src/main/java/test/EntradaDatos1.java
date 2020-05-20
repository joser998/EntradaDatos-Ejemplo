package test;
import java.io.*;
public class EntradaDatos1 {
    public static void main(String[] args) {
        /* Diferentes tipos de Clases para la captura de datos */
        InputStreamReader input = new InputStreamReader(System.in); //--Lee solamente de caracter en caracter.
        BufferedReader brInput = new BufferedReader(input); //--Podemos Leer lineas completas
        
        String captura;
        
        //Con este tipo de lectura es necesario hacer un bloque Try-Catch
        System.out.print("Introduce un dato: ");
        try {
            captura = brInput.readLine();
            System.out.println("Dato Introducido: "+captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}