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
public class Licenciatura extends Deportistas{
    protected String carrera;
    protected int unidades;
    protected boolean voto;
    
    static int votos;
    /**
     * Constructor que inicializa un alumno deportista de ingenieria
     * @param nombre -
     * @param deporte -
     * @param sexo -
     * @param experiencia - 
     * @param carrera Ambito de ingenieria
     * @param unidades Unidades cursadas al momento
     */
    public Licenciatura(String nombre, int deporte, char sexo, boolean experiencia, String carrera, int unidades) {
        super(nombre, deporte, sexo, experiencia);
        this.carrera=carrera;
        this.unidades=unidades;
        this.voto=false;
    }
    /**
     * Regresa la carrera en la que se encuentra el alumno de Ingenieria
     * @return string con carrera
     */
    public String getCarrera(){
        return this.carrera;
    }
    /**
     * Regresa unidades cursadas al momento
     * @return int con unidades
     */
    public int getUnidades(){
        return this.unidades;
    }
    /**
     * Registra si el alumno ya voto, si ya voto y quiere volver a registrarlo no se dara seguimiento
     * @return 
     */
    public String votarPorSoc(){
        if (voto==false){
            this.voto=true;
            return "Voto registrado. Gracias por votar";
        } else {
            return "Ya habias realizado tu voto";
        }
    }
    
    
}
