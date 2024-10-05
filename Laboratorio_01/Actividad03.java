/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio_01;

/**
 *
 * @author Usuario24B
 */
import java.util.*;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] soldados=new String[5];
        for(int i=0;i<soldados.length;i++){
            System.out.println("Ingrese el nombre del soldado "+(i+1)+": ");
            soldados[i]=scan.next();
        }
        System.out.println("El nombre de los soldados son: ");
        for(int j=0;j<soldados.length;j++)
            System.out.println("-> "+soldados[j]);       
    }
}
