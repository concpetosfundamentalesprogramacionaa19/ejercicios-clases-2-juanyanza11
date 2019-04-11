/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioClase;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mieejercicio {
    
     public static void main(String[] args) {

         String nombre;
         String apellido;
         String pais;
         String ciudad;
         int nota1;
         int nota2;
         int edad;
         double promedio;
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Ingrese sus nombres");
         nombre = entrada.nextLine();
         
         System.out.println("Ingrese sus apellidos");
         apellido = entrada.nextLine();
         
         System.out.println("Ingrese su edad");
         edad = entrada.nextInt();
         entrada.nextLine();
         
         System.out.println("Ingrese su ciudad");
         ciudad=entrada.nextLine();
         
         System.out.println("Ingrese su País");
         pais=entrada.nextLine();
         
         System.out.println("Ingrese su nota 1");
         nota1= entrada.nextInt();
         
         System.out.println("Ingrese su nota 2");
         nota2= entrada.nextInt();
         
         promedio=(nota1+nota2)/2;
         
         System.out.printf("Sus nombres y apellidos:"
                 + " %s %s \nEdad: %s \nPais: %s \nNotas: %s , %s \nPromedio: %s"
                 ,nombre,apellido,edad,pais,nota1,nota2,promedio);
         
         
    }

}