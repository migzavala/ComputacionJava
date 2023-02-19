package com.mycompany.act5java;

import java.util.Scanner;

public class Act5Java {
    
    
    public void separador(){
       
        System.out.println("=========================================================");
        
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        // El objeto no hace nada, solo es para que el metodo separador funcione.
        Act5Java objeto = new Act5Java();
        
         objeto.separador();
        
        System.out.print("Dar el primer numero: ");
             int x = leer.nextInt();
        
        System.out.print("Dar el primer numero: ");
                int y = leer.nextInt();
                
        objeto.separador();

                
        // Suma
        int suma = x + y;
        System.out.println("La suma de los numeros es: " +suma+ ".");
        
        //Resta
        int resta = x - y;
        System.out.println("La resta de los numeros es: " +resta+ ".");
        
        //Multiplicacion
        int mult = x * y;
        System.out.println("La multiplicacion de los numeros es: " +mult+ ".");
        
        //Division
        float div = x / y;
         System.out.println("La division de los numeros es: " +div+ ".");
        
        //Mod
        float mod = x % y;
        System.out.println("El modulo de los numeros es: " +mod+ ".");
        
         objeto.separador();
        
    }
}
