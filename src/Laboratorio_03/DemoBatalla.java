/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio_03;

/**
 *
 * @author mauro
 */
import java.util.*;

public class DemoBatalla {
    public static void main (String[] args){
        Nave[] misNaves=new Nave[10];
        Scanner scan=new Scanner(System.in);
        String nomb,col;
        int fil,punt;
        boolean est;
        for (int i=0;i<misNaves.length;i++){
            System.out.println("Nave " + (i+1)); 
            System.out.print("Nombre: "); 
            nomb = scan.next(); 
            System.out.println("Fila "); 
            fil = scan.nextInt(); 
            System.out.print("Columna: "); 
            col = scan.next(); 
            System.out.print("Estado: "); 
            est = scan.nextBoolean(); 
            System.out.print("Puntos: "); 
            punt = scan.nextInt(); 

            misNaves[i] = new Nave(); //Se crea un objeto Nave y se asigna su referencia a misNaves

            misNaves[i].setNombre(nomb); 
            misNaves[i].setFila(fil); 
            misNaves[i].setColumna(col); 
            misNaves[i].setEstado(est); 
            misNaves[i].setPuntos(punt); 
        }
        System.out.println("\nNaves creadas:"); 
        mostrarNaves(misNaves); 
        mostrarPorNombre(misNaves); 
        mostrarPorPuntos(misNaves,scan); 
        System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves)); 
    }
    //Método para mostrar todas las naves 
    public static void mostrarNaves(Nave [] flota){
        for (int i=0;i<flota.length;i++){
            
        }
    } 

     //Método para mostrar todas  las naves de un nombre que se pide por teclado 
    public static void mostrarPorNombre(Nave [] flota){ 
    } 

    //Método para mostrar todas las naves con un número de puntos inferior o igual 
    //al número de puntos que se pide por teclado 
    public static void mostrarPorPuntos(Nave [] flota,Scanner scan){
        
    } 

    //Método que devuelve la Nave con mayor número de Puntos 
    public static Nave mostrarMayorPuntos(Nave [] flota){
        Nave mayor=null;
        for (int i=0;i<flota.length-1;i++){
            if (flota[i].getPuntos()>flota[i+1].getPuntos()){
                mayor=flota[i];
            }
        }
        return mayor;
    } 
    public static Nave[] aleatoriamenteDesordenados(Nave[] flota){
        Nave[] misNavesDes=new Nave[flota.length];
        System.arraycopy(flota,0,misNavesDes,0,10);
        Nave cambio;
        for (int i=0;i<flota.length;i++){
            cambio=misNavesDes[i];
            int aleatorio=(int)(Math.random()*10);
            misNavesDes[i]=misNavesDes[aleatorio];
            misNavesDes[aleatorio]=cambio;
        }
        return misNavesDes;
    }
    //Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados 
    //pero aleatoriamente desordenados.
    
}
