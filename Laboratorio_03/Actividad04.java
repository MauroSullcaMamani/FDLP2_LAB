/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio_03;

/**
 *
 * @author Usuario24B
 */
import java.util.*;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Soldado[] soldados=new Soldado[5]; //Creamos un arreglo para almacenar 5 objetos de tipo Soldado
        for(int i=0;i<soldados.length;i++){ //Ingresamos los datos de los 5 soldados
            Soldado soldado1=new Soldado(); //Creamos "soldado1" que no ayudara a poder ingresar los datos
                                            //de los soldados en el arreglo
            System.out.println("Ingrese el nombre del soldado "+(i+1)+": ");
            soldado1.setNombre(scan.next());
            System.out.println("Ingrese la vida de su soldado: ");
            soldado1.setVida(scan.nextInt());
            soldados[i]=soldado1; //Ponemos los datos del soldado en el arreglo
        }
        System.out.println("NOMBRE \t VIDA");
        for(int k=0;k<soldados.length;k++) //Imprimimos los datos de los 5 soldados
            System.out.println(soldados[k].toString());
    }
}
