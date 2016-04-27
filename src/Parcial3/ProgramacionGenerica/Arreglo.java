/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial3.ProgramacionGenerica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Arreglo <T>  {
    List<T> lista= new ArrayList<T>();
    
    public Arreglo(){  
        
    }
    
    public String almacenarPrimerDisponible(T t){
        /*for (int i=0; i<100; i++){
            if (this.lista.get(i)==null){
                try {
                    this.lista.add(i, t);
                    return "Elemento agregado exitosamente";
                } catch (IndexOutOfBoundsException e){
                    if (this.lista.get(i)==0){ //AQUÍ NO JALA
                       this.lista.add(i, t);
                       return "Elemento agregado exitosamente";
                    }
                }
            }
        }
        return "Espacio de memoria lleno";*/
        this.lista.add(t);
        return "Agregado Exitosamente";
    }
    
    public String almacenarEnPosicion(T t, int x){
        try{
            this.lista.remove(x);
            this.lista.add(x, t);
            return "Se remplazo exitosamente";
        } catch (IndexOutOfBoundsException e){
            return "No existe esa posicion";
       /* if (this.lista.get(x)==null){
            this.lista.add(x,t);
        }*/
        }
        
    }
    public List<T> devuelveAlmacenados(){
        return this.lista;
    }
    public T devuelvePrimero(){
        /*for (int i=0; i<100; i++){
            if (this.lista.get(i)!=null){
                return this.lista.get(i);
            }
        }
        return null;*/
        return this.lista.get(0);
    }
    
    public T devuelveUltimoExistente(){
        /*for (int i=99; i>=0; i--){
            if (this.lista.get(i)!=null){
                return this.lista.get(i);
            }
        }
        return null;*/
        return this.lista.get(this.lista.size()-1);
    }
}
