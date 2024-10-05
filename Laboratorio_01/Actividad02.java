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

public class Actividad02 {
    public static void main(String[] args) {
        String soldado1,soldado2,soldado3,soldado4,soldado5;
        int vida1,vida2,vida3,vida4,vida5;
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
        vida1=(int) (Math.random()*5+1);
        vida2=(int) (Math.random()*5+1);
        vida3=(int) (Math.random()*5+1);
        vida4=(int) (Math.random()*5+1);
        vida5=(int) (Math.random()*5+1);
        System.out.println("NOMBRE \t VIDA");
        System.out.println(soldado1+" -> "+vida1);
        System.out.println(soldado2+" -> "+vida2);
        System.out.println(soldado3+" -> "+vida3);
        System.out.println(soldado4+" -> "+vida4);
        System.out.println(soldado5+" -> "+vida5);
    }
}
