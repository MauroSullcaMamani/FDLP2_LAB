/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio_08;

/**
 *
 * @author Usuario24B
 */
public class Soldado {
    // Creamos los atributos
    private String nombre= "             ";
    private int vida;
    private int fila;
    private int columna;
    private String color;

    // Creamos los Set y Get de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Medoto para saber a que tipo de ejercito pertenece el soldado
    public void setColor(String color){
        this.color=color;
    }

    public int getVida() {
        return vida;
    }
    
    //Metodo para darle color a "vida"
    public void printVida(){
        System.out.print(color+vida+"\u001B[0m");
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }
    //Generamos una posicion aleatoria para el soldado
    public void aleatorioPosicion(int fila,int columna){
        this.fila=(int)(Math.random()*fila);
        this.columna=(int)(Math.random()*columna);
    }
    //Generamos la vida del soldado
    public void aleatorioVida(){
        this.vida=(int)(Math.random()*5+1);
    }
    // Creamos el toString
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", vida=" + vida + ", fila=" + fila + ", columna=" + columna + "}\n";
    }
}
