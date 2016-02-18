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
public class ProductosCongelados extends Productos{
    //atributos
    protected int temperatura; //temperatura de congelación recomendada
    
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
    public ProductosCongelados (String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, int temperatura) {
        super(caducidad, lote, precio, cantidad, codigo, distribuidor);
        this.temperatura=temperatura;       
    }
    /**
     * Método que obtiene temperatura
     * @return Temperatura de congelación recomendada
     */
    public int getTemperatura(){
        return this.temperatura;
    }
    
    
}
