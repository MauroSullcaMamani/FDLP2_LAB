/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FP2_Lab06;

/**
 *
 * @author Usuario24B
 */
import java.util.*;

public class Actividad05 {
    public static void main(String[] args) {
        // Inicializamos dos ejércitos con un número aleatorio de soldados entre 1 y 5
        int fila=10;//Generamos la fila de la tabla
        int columna=10;//Generamos la columna de la tabla
        ArrayList<ArrayList<Soldado>> tabla=new ArrayList<ArrayList<Soldado>>();
        ArrayList<Soldado> ejercito1=new ArrayList<Soldado>();
        ArrayList<Soldado> ejercito2=new ArrayList<Soldado>();
        for (int i=0;i<fila;i++){
            tabla.add(new ArrayList<Soldado>());
            for (int j=0;j<columna;j++){
                tabla.get(i).add(new Soldado());
            }
        }
        inicializarEjercito(tabla,ejercito1,1);
        inicializarEjercito(tabla,ejercito2,2);
        mostrarEjercitoTabla(tabla);
        System.out.print("\nEl soldado con mayor vida del ejercito 1 es: "+mayorVida(ejercito1).toString());
        System.out.print("El soldado con mayor vida del ejercito 2 es: "+mayorVida(ejercito2).toString());
        System.out.println("\nEl promedio de la vida del ejercito 1 es: "+vidaPromedio(ejercito1));
        System.out.println("El promedio de la vida del ejercito 2 es: "+vidaPromedio(ejercito2));
        System.out.println("\nLista de los soldados por orden de creacion: ");
        mostrarEjercitoOrdenCreacion(ejercito1,1);
        mostrarEjercitoOrdenCreacion(ejercito2,2);
        System.out.println("\nEl ranking de los soldados es: ");
        rankingSoldadosV1(ejercito1,1);
        rankingSoldadosV2(ejercito2,2);
        
    }
    // Método para inicializar una tabla con cierto numeros de soldados
    public static void inicializarEjercito(ArrayList<ArrayList<Soldado>> tabla,ArrayList<Soldado> ejercito,int tipo){
        int numSoldados=(int) (Math.random()*10+1);
        for (int i=0;i<numSoldados;i++){
            Soldado persona=new Soldado();//creamos "persona" para luego ponerlo dentro del arreglo
            do {
                persona.aleatorioPosicion(tabla.size(),tabla.get(0).size());//generamos una posicion
                persona.aleatorioVida();//generamos la vida
                persona.setNombre("soldado"+persona.getFila()+"X"+persona.getColumna()+" E"+tipo);
            }
            //El bucle se repite si en una posicion aleatoria ya existe un soldado puesto
            while(!tabla.get(persona.getFila()).get(persona.getColumna()).getNombre().equals("             "));
            ejercito.add(persona);//ponemos el soldado dentro del arreglo
            tabla.get(persona.getFila()).set(persona.getColumna(),persona);
        }
    }
    // Metodo para mostrar la tabla
    public static void mostrarEjercitoTabla(ArrayList<ArrayList<Soldado>> tabla){
        System.out.println(" _____________ _____________ _____________ _____________ _____________ _____________ _____________ _____________ _____________ _____________");
        for (int i=0;i<tabla.size();i++){
            System.out.print("|");
            for (int j=0;j<tabla.get(i).size();j++)
                System.out.print(tabla.get(i).get(j).getNombre()+"|");           
            System.out.println();
            System.out.println("|_____________|_____________|_____________|_____________|_____________|_____________|_____________|_____________|_____________|_____________|");
        }
    }
    //Metodo para determinar el soldado con mayor vida
    public static Soldado mayorVida(ArrayList<Soldado> ejercito){
        Soldado mayor=new Soldado();//creamos un objeto para almacenar al soldado mayor
        for (Soldado persona:ejercito){
            if (persona.getVida()>mayor.getVida())
                mayor=persona;          
        }
        return mayor;
    }
    //Metodo para determinar la vida total de todos los soldados
    public static double vidaPromedio(ArrayList<Soldado> ejercito){
        double vidaT=0;//vida inicial
        for (Soldado persona:ejercito){
            vidaT+=persona.getVida();
        }
        return vidaT/ejercito.size();
    }
    //Metodo para ver las lista de los soldados por el orden de creacion
    public static void mostrarEjercitoOrdenCreacion(ArrayList<Soldado> ejercito,int tipo){
        System.out.println("Ejercito "+tipo+" : ");
        for (Soldado persona:ejercito){//imprimimos el arreglo
            System.out.print(persona.toString());
        }
    }
    //Metodo para ver el ranking de los soldados (por vida)
    public static void rankingSoldadosV1(ArrayList<Soldado> ejercito,int tipo){
        ordenamientoBurbuja(ejercito);//ordenamos el arreglo unidimensional
        System.out.println("Ejercito "+tipo+" : ");
        for (int i=ejercito.size()-1;i>=0;i--){//imprimimos el arreglo
            System.out.print(ejercito.get(i).toString());
        }
    }
    //Metodo para ver el ranking de los soldados (por vida)
    public static void rankingSoldadosV2(ArrayList<Soldado> ejercito,int tipo){
        ordenamientoInsercion(ejercito);//ordenamos el arreglo unidimensional
        System.out.println("Ejercito "+tipo+" : ");
        for (int i=ejercito.size()-1;i>=0;i--){//imprimimos el arreglo
            System.out.print(ejercito.get(i).toString());
        }
    }
    //Metodo de ordenamiento Burbuja para la vida de los soldados
    public static void ordenamientoBurbuja(ArrayList<Soldado> lista){
        Soldado cambio;
        for(int i=0;i<lista.size()-1;i++){
            for(int j=0;j<lista.size()-i-1;j++){
                if (lista.get(j).getVida()>lista.get(j+1).getVida()){
                    cambio=lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1,cambio);
                }
            }
        }
    }
    //Metodo de ordenamiento de insersion para la vida de los soldados
    public static void ordenamientoInsercion(ArrayList<Soldado> lista) {
        for (int i=1;i<lista.size();i++){
            Soldado soldadoActual=lista.get(i);
            int j=i-1;
            while (j>=0 && lista.get(j).getVida()>soldadoActual.getVida()){
                lista.set(j+1,lista.get(j));
                j--;
            }
            lista.set(j+1,soldadoActual);
        }
    }
}
