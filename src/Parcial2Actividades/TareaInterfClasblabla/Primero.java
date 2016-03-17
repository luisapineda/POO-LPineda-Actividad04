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
public class Primero extends Prepa{
    protected String actsemsal;
    /**
     * Constructor
     * @param nombre
     * @param deporte
     * @param sexo
     * @param experiencia
     * @param año
     * @param plan
     * @param actsemsal Descripción de la actividad que llevará a cabo el alumno en las semana de la salud
     */
    public Primero(String nombre, int deporte, char sexo, boolean experiencia, int año, String plan, String actsemsal) {
        super(nombre, deporte, sexo, experiencia, año, plan);
        this.actsemsal=actsemsal;
    }
    /**
     * Regresa la descripción de la actividad
     * @return String 
     */
    public String getAct(){
        return this.actsemsal;
    }
    /**
     * Regresa la calificacion del alumno en la semana de la salud. 50% de desempeño y 50% de asistencias. Puntos en base 100
     * @param desempeño
     * @param asistencias
     * @return 
     */
    public double CalifiSemanaSalud(int desempeño, int asistencias){
        double c;
        c=(desempeño * .5)+ (asistencias*.5);
        return c;
    }
    
}
