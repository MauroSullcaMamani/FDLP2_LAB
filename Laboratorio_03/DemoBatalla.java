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
        Nave[] misNaves=new Nave[10]; //creamos un arreglo para 10 objetos tipo nave
        Scanner scan=new Scanner(System.in);
        String nomb,col;
        int fil,punt;
        boolean est;
        for (int i=0;i<misNaves.length;i++){ // Ingresamos los datos para cada nave
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
        System.out.println("\nNave con mayor numero de puntos: " + mostrarMayorPuntos(misNaves)); 
    }
    //Método que muestra todas las naves 
    public static void mostrarNaves(Nave [] flota){
        for (int i=0;i<flota.length;i++){
            System.out.println(flota[i].toString());
        }
    } 

     //Método que muestra todas  las naves de un nombre que se pide por teclado 
    public static void mostrarPorNombre(Nave [] flota,Scanner scan){ 
        System.out.println("Ingrese el nombre de su nave: ");
        String nombre=scan.next();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getNombre().equals(nombre)) // Si los nombres son iguales, se imprime los datos de la nave
                System.out.println(flota[i].toString());
        }
    } 

    //Método que muestra todas las naves con un número de puntos inferior o igual 
    //al número de puntos que se pide por teclado 
    public static void mostrarPorPuntos(Nave [] flota,Scanner scan){
        System.out.println("Ingrese un numero de puntos: ");
        int numero=scan.nextInt();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getPuntos()<=numero) //Si la nave tiene menos puntos que "numero", entoces se imprime
                System.out.println(flota[i].navePunto());
        }
    } 

    //Método que devuelve la Nave con mayor número de Puntos 
    public static Nave mostrarMayorPuntos(Nave [] flota){
        Nave mayor=flota[0]; //Definimos temporalmente a la nave mayor
        for (int i=1;i<flota.length;i++){
            if (flota[i].getPuntos()>mayor.getPuntos()){ //Si existen una nave con mayor puntos
                mayor=flota[i];                          //entonces se actualiza la variable mayor
            }
        }
        return mayor;
    }
    //Metodo que devuelve un arreglo de objetos con todos los objetos previamente ingresados
    //pero aleatoriamente desordenados
    public static Nave[] aleatoriamenteDesordenados(Nave[] flota){
        Nave[] misNavesDes=new Nave[flota.length]; //Creamos un nuevo arreglo
        System.arraycopy(flota,0,misNavesDes,0,flota.length); //Copiamos los valores del arreglo original 
        Nave cambio; // Creamos una variable que nos ayudara a poder hacer cambios dentro del arreglo
        for (int i=0;i<flota.length;i++){
            cambio=misNavesDes[i]; //"cambio" tendra los valores de una parte del arreglo
            int aleatorio=(int)(Math.random()*flota.length); // Generamos una posicion random
            misNavesDes[i]=misNavesDes[aleatorio]; // La posicion "i" tendra un intercambio de posicion con
            misNavesDes[aleatorio]=cambio;         // la posicion "aleatorio"
        }
        return misNavesDes;
    }
}
