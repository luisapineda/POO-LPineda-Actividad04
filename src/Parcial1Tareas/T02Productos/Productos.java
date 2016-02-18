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
public class Productos {
    //Atributos
    protected String caducidad, codigo, distribuidor;
    protected int lote, cantidad;
    protected float precio;
    
    /**MÉTODOS
     * Constructor
     * @param caducidad Fecha de caducidad
     * @param lote El número de lote
     */
    public Productos(String caducidad, int lote, float precio, int cantidad, String codigo, String distribuidor){
        this.caducidad=caducidad;
        this.lote=lote;
        this.precio=precio;
        this.cantidad=cantidad;
        this.codigo=codigo;
        this.distribuidor=distribuidor;
    }
    /**
     * Método que regresa la caducidad
     * @return  Una cadena con fecha de caducidad
     */
    public String getCaducidad(){
        return this.caducidad;
    }
    /**
     * Método que regresa el lote
     * @return número de lote
     */
    public int getLote(){
        return this.lote;
    }
    /**
     * Método que regresa el precio
     * @return El precio en double
     */
    public float getPrecio(){
        return this.precio;
    }
    /**
     * Método que otorga la cantidad de productos
     * @return Cantidad de productos en existencia
     */
    public int getCantidad(){
        return this.cantidad;
    }
    /**
     * Método que otorga la cadena de código
     * @return códidgo de barras
     */
    public String getCodigo(){
        return this.codigo;
    }
    /**
     * Método que otroga el distribuidor del producto
     * @return compañia distribuidora
     */
    public String getDistribuidor(){
        return this.distribuidor;
    }
}
