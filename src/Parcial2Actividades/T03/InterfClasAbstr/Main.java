/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2Actividades.T03.InterfClasAbstr;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menú para inscribir a un alumno a Olimpiatec
        Scanner entrada= new Scanner(System.in);
        System.out.println("BIENVENIDO AL REGISTRO DE OLIMPIATEC 2016 \nÚltimos registros: ");
        Ingenieria i1=new Ingenieria("Luisa Pineda", 2, 'F', true, "ITIC", 18);
        System.out.println("Nombre: " + i1.getNombre());
        System.out.println("Deporte: " + i1.getDeporte());
        System.out.println("Sexo: " + i1.getSexo());
        System.out.println("Carrera: " + i1.getCarrera());
        System.out.println("Unidades: " + i1.getUnidades());
        System.out.println("Experiencia previa en Olimpiatec: " + i1.getExperiencia());
        System.out.println(i1.jugar(false));
        System.out.println("¿Ustedes inician el siguiente partido?: "+ i1.equipoInicia());
        
        Licenciatura l1=new Licenciatura("Xanat Rdz", 4, 'F', true, "LDN", 24);
        System.out.println("\nNombre: " + l1.getNombre());
        System.out.println("Deporte: " + l1.getDeporte());
        System.out.println("Sexo: " + l1.getSexo());
        System.out.println("Carrera: " + l1.getCarrera());
        System.out.println("Unidades: " + l1.getUnidades());
        System.out.println("Experiencia previa en Olimpiatec: " + l1.getExperiencia());
        System.out.println(l1.jugar(false));
        System.out.println(l1.jugar(true));
        System.out.println(l1.votarPorSoc());
        System.out.println(l1.votarPorSoc());
        
        Primero p1=new Primero("Erandy Rev", 1, 'M', false, 1,"bilingue", "Conferencia del exfutbolista");
        System.out.println("\nNombre: " + p1.getNombre());
        System.out.println("Deporte: " + p1.getDeporte());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Año: " + p1.getAño());
        System.out.println("Plan: " + p1.getPlan());
        System.out.println("Actividad Semana de la salud" + p1.getAct());
        System.out.println("Experiencia previa en Olimpiatec: " + p1.getExperiencia());
        System.out.println(p1.jugar(false));
        System.out.println(p1.puntoExtra("Español"));
        System.out.println("Calificacion de la semana de la salud: " + p1.CalifiSemanaSalud(100, 90));
        System.out.println("\nContador de participantes: " + Deportistas.contparticip);
        System.out.println("Contador de juegos: " + Deportistas.contarjuegos);
        
        System.out.println("¿Desea usted registrar a algún alumno? Presione 1 si lo desea, o cualquier digito para salir");
        int r=entrada.nextInt();
        if (r==1){
            System.out.println("Teclee 1 si es ingeniero, 2 si es licenciado y 3 si es prepatec");
            int c=entrada.nextInt();
            switch (c){
                case 1: crearIngeniero(); break;
                case 2: crearLicenciado(); break;
                case 3: crearPrepo(); break;
                default: System.out.println("No valido");
            }
        } else { 
            System.out.println("Gracias por usar el programa de Olimpiatec 2016!");
        }
        
    }
    static public void crearIngeniero(){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese nombre:  ");
        String nombre=entrada.next();
        System.out.print("Ingrese 1 si jugara Tochito, 2 si es volleyball, 3 si es basketball y 4 si es futbol:  ");
        int deporte=entrada.nextInt();
        System.out.print("Sexo(Ingrese M o F):  ");
        char sexo=(entrada.next()).charAt(0);
        System.out.println("¿Experiencia en Olimpiatec? Ingrese 1 si la tiene, o cualquier digito si no");
        int expp=entrada.nextInt();
        boolean exp;
        if (expp==1){
            exp=true;
        } else { 
            exp=false;
        }
        System.out.println("Carrera:  ");
        String carrera=entrada.next();
        System.out.println("Unidades cursadas:  ");
        int unidades=entrada.nextInt();
        System.out.println("Registro terminado");
        
        Ingenieria ii= new Ingenieria(nombre, deporte, sexo, exp,carrera, unidades);
        System.out.println("\nNombre: " + ii.getNombre());
        System.out.println("Deporte: " + ii.getDeporte());
        System.out.println("Sexo: " + ii.getSexo());
        System.out.println("Carrera: " + ii.getCarrera());
        System.out.println("Unidades: " + ii.getUnidades());
        System.out.println("Experiencia previa en Olimpiatec: " + ii.getExperiencia());
    }
    static public void crearLicenciado(){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese nombre:  ");
        String nombre=entrada.next();
        System.out.print("Ingrese 1 si jugara Tochito, 2 si es volleyball, 3 si es basketball y 4 si es futbol:  ");
        int deporte=entrada.nextInt();
        System.out.print("Sexo(Ingrese M o F):  ");
        char sexo=(entrada.next()).charAt(0);
        System.out.println("¿Experiencia en Olimpiatec? Ingrese 1 si la tiene, o cualquier digito si no");
        int expp=entrada.nextInt();
        boolean exp;
        if (expp==1){
            exp=true;
        } else { 
            exp=false;
        }
        System.out.println("Carrera:  ");
        String carrera=entrada.next();
        System.out.println("Unidades cursadas:  ");
        int unidades=entrada.nextInt();
        System.out.println("Registro terminado");
        
        Licenciatura ii= new Licenciatura(nombre, deporte, sexo, exp,carrera, unidades);
        System.out.println("\nNombre: " + ii.getNombre());
        System.out.println("Deporte: " + ii.getDeporte());
        System.out.println("Sexo: " + ii.getSexo());
        System.out.println("Carrera: " + ii.getCarrera());
        System.out.println("Unidades: " + ii.getUnidades());
        System.out.println("Experiencia previa en Olimpiatec: " + ii.getExperiencia());
    }
    static public void crearPrepo(){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese nombre:  ");
        String nombre=entrada.next();
        System.out.print("Ingrese 1 si jugara Tochito, 2 si es volleyball, 3 si es basketball y 4 si es futbol:  ");
        int deporte=entrada.nextInt();
        System.out.print("Sexo(Ingrese M o F):  ");
        char sexo=(entrada.next()).charAt(0);
        System.out.println("¿Experiencia en Olimpiatec? Ingrese 1 si la tiene, o cualquier digito si no");
        int expp=entrada.nextInt();
        boolean exp;
        if (expp==1){
            exp=true;
        } else { 
            exp=false;
        }
        System.out.println("Plan:  ");
        String plan=entrada.next();
        System.out.println("Año: ");
        int año=entrada.nextInt();
        switch (año){
            case 1: crearPrimero(nombre, deporte, sexo, exp, 1, plan); break;
            case 2: crearSegundo(nombre, deporte, sexo, exp, 2, plan); break;
            case 3: crearTercero(nombre, deporte, sexo, exp, 3, plan); break;
            default: System.out.println("Año no valido");  
        }
        
    }
    static public void crearPrimero(String nombre, int deporte, char sexo,boolean exp, int año, String plan){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese actividad realizada en la semana de la salud");
        String descripcion=entrada.next();
        Primero pp=new Primero(nombre, deporte, sexo, exp, año, plan, descripcion);
        System.out.println("\nNombre: " + pp.getNombre());
        System.out.println("Deporte: " + pp.getDeporte());
        System.out.println("Sexo: " + pp.getSexo());
        System.out.println("Año: " + pp.getAño());
        System.out.println("Plan: " + pp.getPlan());
        System.out.println("Actividad Semana de la salud: " + pp.getAct());
        System.out.println("Experiencia previa en Olimpiatec: " + pp.getExperiencia());
    }
    static public void crearSegundo(String nombre, int deporte, char sexo,boolean exp, int año, String plan){
        Segundo pp=new Segundo(nombre, deporte, sexo, exp, año, plan);
        System.out.println("\nNombre: " + pp.getNombre());
        System.out.println("Deporte: " + pp.getDeporte());
        System.out.println("Sexo: " + pp.getSexo());
        System.out.println("Año: " + pp.getAño());
        System.out.println("Plan: " + pp.getPlan());
        System.out.println("Experiencia previa en Olimpiatec: " + pp.getExperiencia());
    }
    static public void crearTercero(String nombre, int deporte, char sexo,boolean exp, int año, String plan){
        Tercero pp=new Tercero(nombre, deporte, sexo, exp, año, plan);
        System.out.println("\nNombre: " + pp.getNombre());
        System.out.println("Deporte: " + pp.getDeporte());
        System.out.println("Sexo: " + pp.getSexo());
        System.out.println("Año: " + pp.getAño());
        System.out.println("Plan: " + pp.getPlan());
        System.out.println("Experiencia previa en Olimpiatec: " + pp.getExperiencia());
    }
}

