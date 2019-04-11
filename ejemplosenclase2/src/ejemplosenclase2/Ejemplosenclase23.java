/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosenclase2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplosenclase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dejar espacio antes de poner comentarios
       
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();  
            
        System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
            
        System.out.println("Ingrese su edad");
            edad= entrada.nextInt();
            entrada.nextLine(); // Reinicio del Buffer /de entrada
        System.out.println("Ingrese su ciudad de origen");
            ciudad= entrada.nextLine();
       
       /*
                System.out.println("Su nombres son: "+nombre+
                        "\n\n\tSus apellidos son: "+apellido+", edad: "+edad+ 
                        "\n Su ciudad de origen es: "+ciudad);
       */
               System.out.printf("Su nombre es: %s \n\n\t Su apellido es: %s , edad: %s \nCiudad: %s"
                       ,nombre,apellido,edad,ciudad);
    }
    
}
