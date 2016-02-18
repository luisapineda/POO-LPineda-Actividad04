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
public class Productosagua extends ProductosCongelados {
    //atributo
    protected String descripcion; //descripcion del proceso de congelacion
    /**
     * Constructor
     * @param caducidad
     * @param lote
     * @param precio
     * @param cantidad
     * @param codigo
     * @param distribuidor
     * @param temperatura
     * @param descripcion 
     */
    public Productosagua(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, int temperatura, String descripcion) {
        super(caducidad, lote, precio, cantidad, codigo, distribuidor, temperatura);
        this.descripcion=descripcion;
    }
    /**
     * Método que regresa la descripción
     * @return cadena con descripción
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    
}
