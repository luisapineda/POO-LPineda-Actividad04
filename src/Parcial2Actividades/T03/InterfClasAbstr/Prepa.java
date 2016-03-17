/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades.T03.InterfClasAbstr;

/**
 *
 * @author usuario
 */
public abstract class Prepa extends Deportistas {
    protected int año; 
    protected String plan; 

    /**
     * Constructor
     * @param nombre -
     * @param deporte -
     * @param sexo -
     * @param experiencia -
     * @param año de prepa
     * @param plan multicultural o bilingue
     */
    public Prepa(String nombre, int deporte, char sexo, boolean experiencia, int año, String plan) {
        super(nombre, deporte, sexo, experiencia);
        this.año=año;
        this.plan=plan;
    }
    /**
     * Otorga un punto extra en determinada materia a los alumnos que participan en olimpiatec
     * @param materia
     * @return 
     */
    public String puntoExtra(String materia){
        return "Tienes un punto extra en " + materia;
    }
    /**
     * Regresa el año
     * @return 
     */
    public int getAño(){
        return this.año;
    }
    /**
     * Regresa el plan
     * @return 
     */
    public String getPlan(){
        return this.plan;
    }
}

