/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FP2_Lab03;

/**
 *
 * @author Usuario24B
 */

public class Actividad05 {
    public static void main(String[] args) {
        String[] ejercito1=inicializarEjercito((int) (Math.random()*5+1));
        String[] ejercito2=inicializarEjercito((int) (Math.random()*5+1));
        mostrarEjercito(ejercito1,1);
        mostrarEjercito(ejercito2,2);
        mostrarGanador(ejercito1,ejercito2);
    }
    public static String[] inicializarEjercito(int num){
        String[] ejercito=new String[num];
        for(int i=0;i<ejercito.length;i++)
            ejercito[i]="soldado"+i;
        return ejercito;
    }
    public static void mostrarEjercito(String[] ejercito,int tipo){
        System.out.println("\nEjercito "+tipo+": ");
        for(int i=0;i<ejercito.length;i++)
            System.out.println(ejercito[i]);      
    }
    public static void mostrarGanador(String[] ejercito1,String[] ejercito2){
        if(ejercito1.length>ejercito2.length)
            System.out.println("\nGana el ejercito 1 con "+ejercito1.length+" soldados.");
        else if(ejercito1.length<ejercito2.length)
            System.out.println("\nGana el ejercito 2 con "+ejercito2.length+" soldados.");
        else
            System.out.println("\nEmpatan los ejercitos con "+ejercito1.length+" soldados.");
    }
}
