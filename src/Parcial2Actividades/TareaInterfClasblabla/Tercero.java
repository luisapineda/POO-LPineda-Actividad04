/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades.TareaInterfClasblabla;

/**
 *
 * @author usuario
 */
public class Tercero extends Prepa {
    
    public Tercero(String nombre, int deporte, char sexo, boolean experiencia, int año, String plan) {
        super(nombre, deporte, sexo, experiencia, año, plan);
    }
    
    public String victorParaGrad(String disciplina, int lugar){
        return "Alumno ganador en la disciplina de " + disciplina + "Con el lugar numero" + lugar;
    }
}
