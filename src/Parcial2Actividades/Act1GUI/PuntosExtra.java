/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades.Act1GUI;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class PuntosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IMC persona= new IMC();
        IMC.obtenerIMC();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("IMC: "+persona.getIMC());
        System.out.println("Peso: "+persona.getPeso()+"kg");
        System.out.println("Altura: "+persona.getAltura()+"m");
    }
    
}
