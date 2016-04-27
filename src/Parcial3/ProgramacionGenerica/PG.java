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
public class PG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //STRING
       Arreglo<String> aString= new Arreglo<String>();
       aString.almacenarPrimerDisponible("Hola");
       System.out.println(aString.almacenarPrimerDisponible("Como estas"));
       System.out.println(aString.almacenarPrimerDisponible("Bien"));
       System.out.println(aString.almacenarPrimerDisponible("Muy bien?"));
       System.out.println(aString.almacenarPrimerDisponible("Jeje"));
       
       System.out.println("Lista:  "+aString.devuelveAlmacenados());
       aString.almacenarEnPosicion("Bromeeeee",4);
       System.out.println("Lista:  "+aString.devuelveAlmacenados());
       System.out.println("Primer existente: "+aString.devuelvePrimero());
       System.out.println("Ultimo existente: "+aString.devuelveUltimoExistente()+"\n");
       //INTEGER
       Arreglo<Integer> aInt= new Arreglo<Integer>();
       aInt.almacenarPrimerDisponible(10);
       System.out.println(aInt.almacenarPrimerDisponible(11));
       System.out.println(aInt.almacenarPrimerDisponible(12));
       System.out.println(aInt.almacenarPrimerDisponible(13));
       System.out.println(aInt.almacenarPrimerDisponible(13));
       
       System.out.println("Lista:  "+aInt.devuelveAlmacenados());
       aInt.almacenarEnPosicion(133,3);
       System.out.println("Lista:  "+aInt.devuelveAlmacenados());
       System.out.println("Primer existente: "+aInt.devuelvePrimero());
       System.out.println("Ultimo existente: "+aInt.devuelveUltimoExistente()+ "\n");
       //FLOAT
       Arreglo<Float> aFloat= new Arreglo<Float>();
       aFloat.almacenarPrimerDisponible(1.01f);
       System.out.println(aFloat.almacenarPrimerDisponible(1.011f));
       System.out.println(aFloat.almacenarPrimerDisponible(1.02f));
       System.out.println(aFloat.almacenarPrimerDisponible(1.03f));
       System.out.println(aFloat.almacenarPrimerDisponible(1.04f));
       
       System.out.println("Lista:  "+aFloat.devuelveAlmacenados());
       aFloat.almacenarEnPosicion(1.02222f,2);
       System.out.println("Lista:  "+aFloat.devuelveAlmacenados());
       System.out.println("Primer existente: "+aFloat.devuelvePrimero());
       System.out.println("Ultimo existente: "+aFloat.devuelveUltimoExistente()+ "\n");
       //PERSONA
       Arreglo<Persona> aPersona= new Arreglo<Persona>();
       aPersona.almacenarPrimerDisponible(new Persona("Mario Perez","22 años","Masuclino"));
       System.out.println(aPersona.almacenarPrimerDisponible(new Persona("Panchito Juarez","44 años","Masculino")));
       System.out.println(aPersona.almacenarPrimerDisponible(new Persona("Oscar Guapo Nedzelsky","19 años","Masculino")));
       Persona a=new Persona();
       System.out.println(aPersona.almacenarPrimerDisponible(a));
       a.setNombre("Luisa Pineda");
       a.setEdad("18 años");
       a.setSexo("Femenino");
       System.out.println(aPersona.almacenarPrimerDisponible(new Persona("Ernesto Moxo Ramirez","18 años","Todos los dias")));
       
       System.out.println("Lista:  ");
       List<Persona> temp=new ArrayList();
       temp=aPersona.devuelveAlmacenados();
       for (int i=0; i<temp.size();i++){
           System.out.println(temp.get(i).getNombre() + "  " + temp.get(i).getEdad() + "  " + temp.get(i).getSexo() );
       }
       temp=null;
       aPersona.almacenarEnPosicion(a,1);
       
       System.out.println("\nLista:  ");
       temp=aPersona.devuelveAlmacenados();
       for (int i=0; i<temp.size();i++){
           System.out.println(temp.get(i).getNombre() + "  " + temp.get(i).getEdad() + "  " + temp.get(i).getSexo() );
       }
       temp=null;
       
       System.out.println("Primer existente: "+ aPersona.devuelvePrimero().getNombre() + aPersona.devuelvePrimero().getEdad()+aPersona.devuelvePrimero().getSexo());
       System.out.println("Ultimo existente: "+ aPersona.devuelveUltimoExistente().getNombre()+ aPersona.devuelveUltimoExistente().getEdad()+ aPersona.devuelveUltimoExistente().getSexo()+ "\n");
       /*
       System.out.println("Lista:  "+ aPersona.devuelveAlmacenados());
       aPersona.almacenarEnPosicion(a,1);
       System.out.println("Lista:  "+ aPersona.devuelveAlmacenados());
       System.out.println("Primer existente: "+ aPersona.devuelvePrimero());
       System.out.println("Ultimo existente: "+ aPersona.devuelveUltimoExistente()+ "\n");*/
    }
    
}
