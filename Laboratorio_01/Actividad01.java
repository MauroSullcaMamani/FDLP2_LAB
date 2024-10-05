/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio_01;

/**
 *
 * @author mauro
 */
import java.util.*;

public class Actividad01 {
    public static void main(String[] args) {
        String soldado1,soldado2,soldado3,soldado4,soldado5;
        Scanner scan=new Scanner(System.in);  
        System.out.println("Ingrese el nombre del soldado 1:");
        soldado1=scan.next();
        System.out.println("Ingrese el nombre del soldado 2:");
        soldado2=scan.next();
        System.out.println("Ingrese el nombre del soldado 3:");
        soldado3=scan.next();
        System.out.println("Ingrese el nombre del soldado 4:");
        soldado4=scan.next();
        System.out.println("Ingrese el nombre del soldado 5:");
        soldado5=scan.next();
        System.out.println("El nombre de los soldados son: ");
        System.out.println("-> "+soldado1);
        System.out.println("-> "+soldado2);
        System.out.println("-> "+soldado3);
        System.out.println("-> "+soldado4);
        System.out.println("-> "+soldado5);
    } 
}
