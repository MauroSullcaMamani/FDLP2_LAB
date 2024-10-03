/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FP2_Lab03;

/**
 *
 * @author Usuario24B
 */
import java.util.*;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] soldados=new String[5];
        int[] vidas=new int[5];
        for(int i=0;i<soldados.length;i++){
            System.out.println("Ingrese el nombre del soldado "+(i+1)+": ");
            soldados[i]=scan.next();
        }
        for(int j=0;j<vidas.length;j++)
            vidas[j]=(int) (Math.random()*5+1);
        System.out.println("NOMBRE \t VIDA");
        for(int k=0;k<soldados.length;k++)
            System.out.println(soldados[k]+" -> "+vidas[k]);
    }
}
