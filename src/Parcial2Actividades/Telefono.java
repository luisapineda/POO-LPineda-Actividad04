/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades;

/**
 *
 * @author usuario
 */
public class Telefono {
    botonApagar EA= new botonApagar();
    //El constructor es solamente necesario para no objetos
    //como el objeto se construye del otro constructos no es necesario aqui un constructorrr!!!
    Tecla[][] Teclado=new Tecla[5][3]; //array de teclas [r][c]
    
    public void setTeclado(){
        
        int digito=0;
        String g;
        for (int i = 0; i < (Teclado.length -1); i++) {
            for (int j = 0; j < Teclado[0].length; j++) {
                Tecla aux=new Tecla(); //El auxiliar se crea DENTRO del for  para que se haga uno nuevo en cada ciclo
                digito++;
                g=Integer.toString(digito);
                aux.setDigito(g.charAt(0));
                Teclado[i][j]=aux;
            }
        }
        
        Tecla aux1=new Tecla(); //Se crea un nuevo auxiliar por cada variable que se declare independiente
        Tecla aux2=new Tecla();
        Tecla aux3=new Tecla();
        Tecla aux4=new Tecla();
        Tecla aux5=new Tecla();
        Tecla aux6=new Tecla();
        
        
        aux1.setDigito('*');
        Teclado[3][0]=aux1;
        aux2.setDigito('0');
        Teclado[3][1]=aux2;
        aux3.setDigito('#');
        Teclado[3][2]=aux3;
        aux4.setDigito('V');
        Teclado[4][0]=aux4;
        aux5.setDigito('M');
        Teclado[4][1]=aux5;
        aux6.setDigito('R');
        Teclado[4][2]=aux6;
        
        }

}
