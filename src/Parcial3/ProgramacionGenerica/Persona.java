/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial3.ProgramacionGenerica;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre, edad, sexo;
    
    public Persona(String nombre, String edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    public Persona(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(String edad){
        this.edad=edad;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
}
