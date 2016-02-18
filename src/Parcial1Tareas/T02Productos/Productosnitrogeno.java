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
public class Productosnitrogeno extends ProductosCongelados{
    //atributo
    protected int cantnitro; //cantidad necesaria para congelar con nitrógeno dicho producto
    
    /**
     * Constructor
     * @param caducidad
     * @param lote
     * @param precio
     * @param cantidad
     * @param codigo
     * @param distribuidor
     * @param temperatura
     * @param cantnitro 
     */
    public Productosnitrogeno(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, int temperatura, int cantnitro) {
        super(caducidad, lote, precio, cantidad, codigo, distribuidor, temperatura);
        this.cantnitro=cantnitro;
    }
    
    /**
     * Método que regresa la cantidad de nitrógeno
     * @return Cantnitro
     */
    public int getCantnitro(){
        return this.cantnitro;
    }
}
