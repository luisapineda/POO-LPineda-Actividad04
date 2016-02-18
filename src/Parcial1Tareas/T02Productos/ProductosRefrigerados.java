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
public class ProductosRefrigerados extends Productos{
    //atributos
    private int temperatura; //temperatura de refrigeracion
    
    /**
     * Constructor
     * @param caducidad
     * @param lote
     * @param precio
     * @param cantidad
     * @param codigo
     * @param distribuidor
     * @param temperatura 
     */
    public ProductosRefrigerados(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, int temperatura){
        super(caducidad, lote, precio, cantidad, codigo, distribuidor);
        this.temperatura=temperatura;
    }
    
    /**
     * Método que otorga la temperatura de refrigeración
     * @return Temperatura
     */
    public int getTemperatura(){
        return this.temperatura;
    }
}
