/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio_03;

/**
 *
 * @author Usuario24B
 */

public class Actividad05 {
    public static void main(String[] args) {
        // Inicializamos dos ejércitos con un número aleatorio de soldados entre 1 y 5
        Soldado[] ejercito1=inicializarEjercito((int) (Math.random()*5+1));
        Soldado[] ejercito2=inicializarEjercito((int) (Math.random()*5+1));
        // Mostramos los dos ejércitos
        mostrarEjercito(ejercito1,1);
        mostrarEjercito(ejercito2,2);
        // Mostramos el ganador en función de la cantidad de soldados
        mostrarGanador(ejercito1,ejercito2);
    }
    // Método para inicializar un ejército con un número determinado de soldados
    public static Soldado[] inicializarEjercito(int num){
        // Creamos un arreglo para almacenar los soldados
        Soldado[] ejercito=new Soldado[num];
        // Llenamos el arreglo con soldados nuevos
        for(int i=0;i<ejercito.length;i++){
            Soldado soldado1=new Soldado(); 
            soldado1.setNombre("soldado"+i);// Asignamos un nombre a cada soldado
            ejercito[i]=soldado1; // Almacenamos el soldado en el arreglo
        }
        return ejercito;
    }
    // Asignamos un nombre a cada soldado
    public static void mostrarEjercito(Soldado[] ejercito,int tipo){
        System.out.println("\nEjercito "+tipo+": ");
        // Asignamos un nombre a cada soldado
        for(int i=0;i<ejercito.length;i++)
            System.out.println(ejercito[i].getNombre());      
    }
    // Asignamos un nombre a cada soldado
    public static void mostrarGanador(Soldado[] ejercito1,Soldado[] ejercito2){
        // Asignamos un nombre a cada soldado
        if(ejercito1.length>ejercito2.length)
            System.out.println("\nGana el ejercito 1 con "+ejercito1.length+" soldados.");
        else if(ejercito1.length<ejercito2.length)
            System.out.println("\nGana el ejercito 2 con "+ejercito2.length+" soldados.");
        else
            System.out.println("\nEmpatan los ejercitos con "+ejercito1.length+" soldados.");
    }
}
