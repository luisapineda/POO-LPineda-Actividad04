/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1Tareas.T02Productos;

/**
 *
 * @author usuario
 */
public class Productosaire extends ProductosCongelados {
    //atributos
    protected String pureza; //nivel de pureza del aire

    public Productosaire(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, int temperatura, String pureza) {
        super(caducidad, lote, precio, cantidad, codigo, distribuidor, temperatura);
        this.pureza=pureza;
    }
    
    public String getPureza(){
        return this.pureza;
    }
}
