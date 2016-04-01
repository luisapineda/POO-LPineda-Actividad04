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
public class IMC {
    //atributos
    private static float peso, altura;
    private static double IMC;
    private static String nombre;
    
    public IMC(){
    }
    
    public static void obtenerIMC(){
    JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de IMC, podras calcularlo y saber cual es tu estado de salud actual");
    nombre=JOptionPane.showInputDialog(null, "Ingresa tu nombre", "Ejemplo: Luisa");
    peso=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu peso en kilogramos", "Ejemplo: 63"));
    JOptionPane.showConfirmDialog(null, "¿Tu peso es: " + peso + "?", "Confirmacion de entrada", 0, 2);
    altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu altura en metros", "Ejemplo: 1.23"));
    JOptionPane.showConfirmDialog(null, "¿Tu altura es: " + altura + "?", "Confirmacion de entrada", 0, 2);
    IMC= peso/Math.pow(altura,2);
    String texto="";
        if (IMC<18){ texto=", usted posee un peso bajo";}
        if (IMC>=18 && IMC<25){ texto=", usted posee un peso normal";}
        if (IMC>=25 && IMC<27){ texto=", usted posee un sobrepeso";}
        if (IMC>=27){ texto=", usted posee obesidad";}
    JOptionPane.showMessageDialog(null, nombre+ ", tu IMC es " + IMC + texto);
    JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora. Coma frutas y verduras");
    }
    
    public double getIMC(){
        return this.IMC;
    }
    public String getNombre(){
        return this.nombre;
    }
    public float getPeso(){
        return this.peso;
    }
    public float getAltura(){
        return this.altura;
    }
}

