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
        Soldado[] ejercito1=inicializarEjercito((int) (Math.random()*5+1));
        Soldado[] ejercito2=inicializarEjercito((int) (Math.random()*5+1));
        mostrarEjercito(ejercito1,1);
        mostrarEjercito(ejercito2,2);
        mostrarGanador(ejercito1,ejercito2);
    }
    public static Soldado[] inicializarEjercito(int num){
        Soldado[] ejercito=new Soldado[num];
        for(int i=0;i<ejercito.length;i++){
            Soldado soldado1=new Soldado();
            soldado1.setNombre("soldado"+i);
            ejercito[i]=soldado1;
        }
        return ejercito;
    }
    public static void mostrarEjercito(Soldado[] ejercito,int tipo){
        System.out.println("\nEjercito "+tipo+": ");
        for(int i=0;i<ejercito.length;i++)
            System.out.println(ejercito[i].getNombre());      
    }
    public static void mostrarGanador(Soldado[] ejercito1,Soldado[] ejercito2){
        if(ejercito1.length>ejercito2.length)
            System.out.println("\nGana el ejercito 1 con "+ejercito1.length+" soldados.");
        else if(ejercito1.length<ejercito2.length)
            System.out.println("\nGana el ejercito 2 con "+ejercito2.length+" soldados.");
        else
            System.out.println("\nEmpatan los ejercitos con "+ejercito1.length+" soldados.");
    }
}
