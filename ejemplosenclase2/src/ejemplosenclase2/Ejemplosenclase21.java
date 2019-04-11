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
public class Ejemplosenclase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dejar espacio antes de poner comentarios
       
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();  
        System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
       
       
                System.out.println ("Su nombres son: "+nombre+"\n\n\t"
                        +"Su apellido son: "+apellido);
       
               
    }
    
}
