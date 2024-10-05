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
            System.out.print("Fila: "); 
            fil = scan.nextInt(); 
            System.out.print("Columna: "); 
            col = scan.next(); 
            System.out.print("Estado (true,false): "); 
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
        mostrarPorNombre(misNaves,scan); 
        mostrarPorPuntos(misNaves,scan); 
        System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves)); 
    }
    //Método para mostrar todas las naves 
    public static void mostrarNaves(Nave [] flota){
        for (int i=0;i<flota.length;i++){
            System.out.println(flota[i].toString());
        }
    } 

     //Método para mostrar todas  las naves de un nombre que se pide por teclado 
    public static void mostrarPorNombre(Nave [] flota,Scanner scan){ 
        System.out.println("Ingrese el nombre de su nave: ");
        String nombre=scan.next();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getNombre().equals(nombre))
                System.out.println(flota[i].toString());
        }
    } 

    //Método para mostrar todas las naves con un número de puntos inferior o igual 
    //al número de puntos que se pide por teclado 
    public static void mostrarPorPuntos(Nave [] flota,Scanner scan){
        System.out.println("Ingrese un numero de puntos: ");
        int numero=scan.nextInt();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getPuntos()<=numero)
                System.out.println(flota[i].navePunto());
        }
    } 

    //Método que devuelve la Nave con mayor número de Puntos 
    public static Nave mostrarMayorPuntos(Nave [] flota){
        Nave mayor=flota[0];
        for (int i=0;i<flota.length;i++){
            if (flota[i].getPuntos()>flota[i+1].getPuntos()){
                mayor=flota[i];
            }
        }
        return mayor;
    } 
    public static Nave[] aleatoriamenteDesordenados(Nave[] flota){
        Nave[] misNavesDes=new Nave[flota.length];
        System.arraycopy(flota,0,misNavesDes,0,flota.length);
        Nave cambio;
        for (int i=0;i<flota.length;i++){
            cambio=misNavesDes[i];
            int aleatorio=(int)(Math.random()*flota.length);
            misNavesDes[i]=misNavesDes[aleatorio];
            misNavesDes[aleatorio]=cambio;
        }
        return misNavesDes;
    }
}
