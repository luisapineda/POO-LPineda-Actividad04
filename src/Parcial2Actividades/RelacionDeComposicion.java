/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades;

/**
 *
 * @author usuario
 */
public class RelacionDeComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefono starTac=new Telefono(); 
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        
        starTac.setTeclado();
        
        for (int i = 0; i < 5; i++) { //cambiar a 5 para las últimas dos renglones
            for (int j = 0; j < 3; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        
              //no marca error sin constructor para objeto telefono
    }
    
}
