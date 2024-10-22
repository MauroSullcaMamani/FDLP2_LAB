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
        //System.out.print("\nEl soldado con mayor vida es: "+mayorVida(ejercito1).toString());
        //System.out.println("El promedio de la vida del ejercito es: "+vidaTotal(ejercito1)/numSoldados);
        //System.out.println("La vida total del ejercito es: "+vidaTotal(ejercito1));
        //System.out.println("\nLista de los soldados por orden de creacion: ");
        //mostrarEjercitoOrdenCreacion(ejercito1,numSoldados);
        System.out.println("\nEl ranking de los soldados es: ");
        //rankingSoldados(ejercito1,numSoldados);
        
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
    public static Soldado mayorVida(Soldado[][] ejercito){
        Soldado mayor=new Soldado();//creamos un objeto para almacenar al soldado mayor
        for (int i=0;i<ejercito.length;i++){
            for (int j=0;j<ejercito[i].length;j++){
                if (ejercito[i][j].getVida()>mayor.getVida())
                    mayor=ejercito[i][j];//actualizamos "mayor" si otro soldado tiene mayor vida
            }
        }
        return mayor;
    }
    //Metodo para determinar la vida total de todos los soldados
    public static double vidaTotal(Soldado[][] ejercito){
        double vidaT=0;//vida inicial
        for (int i=0;i<ejercito.length;i++){
            for (int j=0;j<ejercito[i].length;j++)
                vidaT+=ejercito[i][j].getVida();//sumamos la vida de cada soldado
        }
        return vidaT;
    }
    //Metodo para ver las lista de los soldados por el orden de creacion
    public static void mostrarEjercitoOrdenCreacion(Soldado[][] ejercito,int numSoldados){
        Soldado[] list=new Soldado[numSoldados];//creamos un arreglo unidimensional.
        int copiar=0;
        for (int j=0;j<ejercito.length;j++){//Copiamos el arreglo bidimensional a un unidimensional
            for (int k=0;k<ejercito[j].length;k++){//ya que es mas facil ordenarlos
                if (!ejercito[j][k].getNombre().equals("             ")){
                    list[copiar]=ejercito[j][k];
                    copiar++;
                }
            }
        }
        ordenamientoBurbuja(list);//ordenamos el arreglo unidimensional
        for (int i=0;i<list.length;i++){//imprimimos el arreglo
            System.out.print(list[i].toString());
        }
    }
    //Metodo para ver el ranking de los soldados (por vida)
    public static void rankingSoldados(Soldado[][] ejercito,int numSoldados){
        Soldado[] listRankT=new Soldado[numSoldados];//creamos un arreglo unidimensional.
        int copiar=0;
        for (int j=0;j<ejercito.length;j++){//Copiamos el arreglo bidimensional a un unidimensional
            for (int k=0;k<ejercito[j].length;k++){//ya que es mas facil ordenarlos
                if (!ejercito[j][k].getNombre().equals("           ")){
                    listRankT[copiar]=ejercito[j][k];
                    copiar++;
                }
            }
        }
        ordenamientoInsercion(listRankT);//ordenamos el arreglo unidimensional
        for (int i=0,j=listRankT.length-1;j>=0;i++,j--){//imprimimos el arreglo
            System.out.print((i+1)+" -> "+listRankT[j].toString());
        }
    }
    //Metodo de ordenamiento burbuja para los nombres de los soldados, ya que de esa
    //manera podemos ver el orden de creacion de los soldados
    public static void ordenamientoBurbuja(Soldado[] lista){
        Soldado cambio;
        for(int i=0;i<lista.length-1;i++){
            for(int j=0;j<lista.length-i-1;j++){
                if(lista[j].getNombre().compareTo(lista[j+1].getNombre())>0){
                    cambio=lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=cambio;
                }
            }
        }
    }
    //Metodo de ordenamiento de insersion para la vida de los soldados
    public static void ordenamientoInsercion(Soldado[] lista) {
        for (int i=1;i<lista.length;i++) {
            Soldado soldadoActual=lista[i];
            int j=i-1;
            while (j>=0 && lista[j].getVida()>soldadoActual.getVida()){
                lista[j+1]=lista[j];
                j--;
            }
            lista[j+1]=soldadoActual;
        }
    }
}
