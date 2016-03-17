/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades.T03.InterfClasAbstr;
import java.util.Random;

/**
 *
 * @author usuario
 */
public abstract class Deportistas implements Acciones {
    protected String nombre;
    protected int deporte; //1 es tochito, 2 es volleyball, 3 es basket, 4 es fut
    protected char sexo; 
    protected boolean experiencia; //participación en Olimpiatec previamente
    
    static int contparticip=0;
    static int contarjuegos=0;
    /**
     * Constructor que inicializa a un deportista
     * @param nombre String con el nombre del participante
     * @param deporte int con deporte en el que juega
     * @param sexo M o F acorde a su sexo
     * @param experiencia Si tiene o no experiencia previa en Olimpiatec
     */
    public Deportistas(String nombre, int deporte, char sexo, boolean experiencia){
        this.nombre=nombre;
        this.deporte=deporte;
        this.sexo=sexo;
        this.experiencia=experiencia;
        contparticip+=1;
    }
    /**
     * Regresa el nombre
     * @return String nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Regresa el deporte
     * @return String con el nombre
     */
    public String getDeporte(){
        String y="Deporte no válido";
        switch (this.deporte){
            case 1: y="Tochito"; break;
            case 2: y="Volleyball"; break;
            case 3: y="Basketball"; break;
            case 4: y="Futbol"; break;
        }
        return y;
    }
    /**
     * Regresa el sexo
     * @return char con m o f
     */
    public char getSexo(){
        return this.sexo;
    }
    /**
     * Regresa si tiene experiencia o no en Olimpiatec
     * @return boolean con si tiene o no 
     */
    public boolean getExperiencia(){
        return this.experiencia;
    }
    
    @Override
    public String jugar(boolean victoria){
        contarjuegos+=1;
        if (victoria == true){
            return "Victoria! Juego terminado";
        } else {
            return "Animo, la victoria esta por venir";
        }
    }
    
    @Override
    public boolean equipoInicia(){
        Random r=new Random(2);
        int x=r.nextInt();
        if (x==0){
            return false;
        } else {
            return true;
        }
    } 
    
    
}

