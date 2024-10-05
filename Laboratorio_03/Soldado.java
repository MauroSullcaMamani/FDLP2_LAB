/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio_03;

/**
 *
 * @author Mauro Snayder
 */
public class Soldado {
    // Creamos los atributos
    private String nombre;
    private int vida;
    
    // Creamos los Set y Get de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    // Creamos el toString
    public String toString() {
        return nombre+"\t->"+vida;
    }
}
