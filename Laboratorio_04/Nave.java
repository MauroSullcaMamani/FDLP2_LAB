/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_5.DemoBatalla;

/**
 *
 * @author Usuario24B
 */
public class Nave {
     // Creamos los atributos
    private String nombre;
    private int fila;
    private String columna;
    private boolean estado;
    private int puntos;
    
    // Creamos los Set y Get de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    // Creamos el toString y un metodo que imprimirá el nombre y puntos
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", fila=" + fila + ", columna=" + columna + ", estado=" + estado + ", puntos=" + puntos + '}';
    }
    
    public String navePunto() {
        return "Nave{" + "nombre=" + nombre + ", puntos=" + puntos + '}';
    }
}
