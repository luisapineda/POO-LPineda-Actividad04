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
public class EmpresaAgroalimentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***EMPRESA AGROALIMENTARIA: INFORMACIÓN DE PRODUCTOS***");
        //Se instanciará un producto
        ProductosFrescos manzana= new ProductosFrescos("17 de Julio del 2015", 454,15, 100, "1234FTR", "Manzanocultivo", "Fruta", 200.00);
        System.out.print("Estos son los datos de la manzana: \n");
        System.out.println("Caducidad: " + manzana.getCaducidad());
        System.out.println("Lote: " + manzana.getLote());
        System.out.println("Código: " + manzana.getCodigo());
        System.out.println("Distribuidor: " + manzana.getDistribuidor());
        System.out.println("Cantidad: " + manzana.getCantidad() + " manzanas");
        System.out.println("Precio: $" + manzana.getPrecio());
        System.out.println("Tipo: " + manzana.getTipo());
        System.out.println("Peso: " + manzana.getPeso() + " gramos");
        
        System.out.println("");
        ProductosRefrigerados leche= new ProductosRefrigerados("12 de Enero del 2015", 54,19, 24, "MUU2345", "Alpura", 11);
        System.out.print("Estos son los datos de la manzana: \n");
        System.out.println("Caducidad: " + leche.getCaducidad());
        System.out.println("Lote: " + leche.getLote());
        System.out.println("Código: " + leche.getCodigo());
        System.out.println("Distribuidor: " + leche.getDistribuidor());
        System.out.println("Cantidad: " + leche.getCantidad() + " manzanas");
        System.out.println("Precio: $" + leche.getPrecio());
        System.out.println("Temperatura: " + leche.getTemperatura()+ " grados ");
        
        System.out.println("");
        Productosagua hielo= new Productosagua("09 de Octubre del 2020", 2,30, 56, "HI543", "Pinguino", 2, "Agua a 10 grados bajo cero");
        System.out.print("Estos son los datos de la manzana: \n");
        System.out.println("Caducidad: " + hielo.getCaducidad());
        System.out.println("Lote: " + hielo.getLote());
        System.out.println("Código: " + hielo.getCodigo());
        System.out.println("Distribuidor: " + hielo.getDistribuidor());
        System.out.println("Cantidad: " + hielo.getCantidad() + " manzanas");
        System.out.println("Precio: $" + hielo.getPrecio());
        System.out.println("Temperatura: " + hielo.getTemperatura()+ " grados");
        System.out.println("Descripción: " + hielo.getDescripcion());
        
        System.out.println("");
        Productosaire pizza= new Productosaire("07 de Septiembre del 2016", 99,120, 22, "8440I", "Dominos", 5, "Semi-puro");
        System.out.print("Estos son los datos de la manzana: \n");
        System.out.println("Caducidad: " + pizza.getCaducidad());
        System.out.println("Lote: " + pizza.getLote());
        System.out.println("Código: " + pizza.getCodigo());
        System.out.println("Distribuidor: " + pizza.getDistribuidor());
        System.out.println("Cantidad: " + pizza.getCantidad() + " manzanas");
        System.out.println("Precio: $" + pizza.getPrecio());
        System.out.println("Temperatura: " + pizza.getTemperatura()+ " grados");
        System.out.println("Pureza: " + pizza.getPureza());
        
        System.out.println("");
        Productosnitrogeno pay= new Productosnitrogeno("2 de Marzo del 2019", 676,99, 11, "PAY4556", "Cheesecake Factory", 5, 23);
        System.out.print("Estos son los datos de la manzana: \n");
        System.out.println("Caducidad: " + pay.getCaducidad());
        System.out.println("Lote: " + pay.getLote());
        System.out.println("Código: " + pay.getCodigo());
        System.out.println("Distribuidor: " + pay.getDistribuidor());
        System.out.println("Cantidad: " + pay.getCantidad() + " manzanas");
        System.out.println("Precio: $" + pay.getPrecio());
        System.out.println("Temperatura: " + pay.getTemperatura()+ " grados");
        System.out.println("Cantidad de nitrógeno: " + pay.getCantnitro() + " ml");
    }
    
}
