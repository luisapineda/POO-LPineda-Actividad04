/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RelacionDeComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Telefono starTac=new Telefono(); 
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        
        System.out.println("Teclado del teléfono: ");
        starTac.setTeclado();
        for (int i = 0; i < 5; i++) { //cambiar a 5 para las últimas dos renglones
            for (int j = 0; j < 3; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        } //no marca error sin constructor para objeto telefono
        System.out.println("");
        
        System.out.println(Telefono.nuevoContacto("Luisa Pineda", "luisafernanda1997@hotmail.com", "8331551685"));
        System.out.println(Telefono.nuevoContacto("Daniel Chaverri", "danxmoxito@hotmail.com", "8331234567"));
        System.out.println(Telefono.nuevoContacto("Ernesto Ramirez", "erspanda@hotmail.com", "83311111111"));
        
        System.out.println(Telefono.desplegarLista());
       
        
        System.out.println(" \n¿Que numero de contacto desea buscar?");
        int r=entrada.nextInt();
        if (Telefono.busqueda(r)==null){
            System.out.println("No se encontro dicho contacto");
        } else { 
           System.out.println(Telefono.busqueda(r).nombre + " " + Telefono.busqueda(r).correo + " " + Telefono.busqueda(r).telefono);
        }
        
        System.out.print("Contacto número 0: ");
        System.out.println(Telefono.busqueda(0).nombre + " " + Telefono.busqueda(0).correo + " " + Telefono.busqueda(0).telefono );
        
        
        
        
    }
    
}
