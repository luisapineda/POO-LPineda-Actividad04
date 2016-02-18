/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1Tareas.T02Productos;

/**
 *Tomaremos en cuenta que productos frescos hace referencia al área de frutas y verduras
 * @author usuario
 */
public class ProductosFrescos extends Productos{
    //Atributos
    private String tipo; //Se refiere a si es fruta o verdura
    private double peso; 
    
    /**
     * Constructor
     * @param caducidad
     * @param lote
     * @param precio
     * @param cantidad
     * @param codigo
     * @param distribuidor
     * @param tipo
     * @param peso 
     */
    public ProductosFrescos(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor, String tipo, double peso) {
        super(caducidad, lote, precio, cantidad, codigo, distribuidor);
        this.tipo=tipo;
        this.peso=peso;
    }
    /**
     * Método que otorga el tipo (fruta o verdura)
     * @return Cadena con el tipo
     */
    public String getTipo(){
        return this.tipo;
    }
    /**
     * Método que otorga el peso unitario del producto
     * @return peso
     */
    public double getPeso(){
        return this.peso;
    }
}
