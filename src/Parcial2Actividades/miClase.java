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
 class miClase {

    
    static int contador=0;
    
    public miClase(){
        contador += 1;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new miClase();
        new miClase();
        new miClase();
        System.out.println("El numero de clases son: " + contador);
    }    
}
