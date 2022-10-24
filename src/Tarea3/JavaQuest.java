package Tarea3;
import GraphGenerator.GraphGenerator;
import java.util.Scanner;
public class JavaQuest {
    public static void main(String[] argv){
    Scanner reader = new Scanner(System.in);
    System.out.println("HISTORIA QUE AUN NO CREO!!!");
    System.out.println("Dame tu nombre porfis:");
    String nombre = reader.nextLine();
    
    Jugador principal = new Jugador(nombre, 500, 20, 20, 5, 1);

    System.out.println("Ingresa el largo de la historia!!:");
    int profundidad = reader.nextInt();
        
    
    
    reader.close();
    }
}