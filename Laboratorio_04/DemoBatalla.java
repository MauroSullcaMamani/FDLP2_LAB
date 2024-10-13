/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_04;

/**
 *
 * @author Usuario24B
 */
import java.util.*; 
public class DemoBatalla { 
 
 public static void main(String [] args){ 
    Nave[] misNaves=new Nave[10]; //creamos un arreglo para 10 objetos tipo nave
    Scanner scan=new Scanner(System.in);
    String nomb,col;
    int fil,punt;
    boolean est;
    for (int i=0;i<misNaves.length;i++){ // Ingresamos los datos para cada nave
        System.out.println("Nave " + (i+1)); 
        System.out.print("Nombre: "); 
        nomb = scan.next(); 
        System.out.print("Fila: "); 
        fil = scan.nextInt(); 
        System.out.print("Columna: "); 
        col = scan.next(); 
        System.out.print("Estado (true,false): "); 
        est = scan.nextBoolean(); 
        System.out.print("Puntos: "); 
        punt = scan.nextInt(); 

        misNaves[i] = new Nave(); //Se crea un objeto Nave y se asigna su referencia a misNaves

        misNaves[i].setNombre(nomb); 
        misNaves[i].setFila(fil); 
        misNaves[i].setColumna(col); 
        misNaves[i].setEstado(est); 
        misNaves[i].setPuntos(punt); 
    }
    System.out.println("\nNaves creadas:"); 
    mostrarNaves(misNaves); 
    mostrarPorNombre(misNaves,scan); 
    mostrarPorPuntos(misNaves,scan); 
    System.out.println("\nNave con mayor numero de puntos: " + mostrarMayorPuntos(misNaves)); 
 
 
    //leer un nombre 
    //mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en caso contrario
    System.out.println("Ingrese el nombre de la nave que desea buscar: ");
    String buscar=scan.next();
    int pos=busquedaLinealNombre(misNaves,buscar);
    if (pos!=-1)
         System.out.println(misNaves[pos].toString());
    else
         System.out.println("No encontrado");

    ordenarPorPuntosBurbuja(misNaves); 
    mostrarNaves(misNaves); 
    ordenarPorNombreBurbuja(misNaves); 
    mostrarNaves(misNaves); 

    //mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en caso contrario 
    System.out.println("Ingrese el nombre de la nave que desea buscar: ");
    buscar=scan.next();
    pos=busquedaBinariaNombre(misNaves,buscar); 
    if (pos!=-1)
         System.out.println(misNaves[pos].toString());
    else
         System.out.println("No encontrado");
    
    ordenarPorPuntosSeleccion(misNaves); 
    mostrarNaves(misNaves); 
    ordenarPorNombreSeleccion(misNaves); 
    mostrarNaves(misNaves); 
    ordenarPorPuntosInsercion(misNaves); 
    mostrarNaves(misNaves); 
    ordenarPorNombreInsercion(misNaves); 
    mostrarNaves(misNaves); 
     } 

     //Método para mostrar todas las naves 
    public static void mostrarNaves(Nave [] flota){
        for (int i=0;i<flota.length;i++){
            System.out.println(flota[i].toString());
        }
    } 

     //Método que muestra todas  las naves de un nombre que se pide por teclado 
    public static void mostrarPorNombre(Nave [] flota,Scanner scan){ 
        System.out.println("Ingrese el nombre de su nave: ");
        String nombre=scan.next();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getNombre().equals(nombre)) // Si los nombres son iguales, se imprime los datos de la nave
                System.out.println(flota[i].toString());
        }
    } 

    //Método que muestra todas las naves con un número de puntos inferior o igual 
    //al número de puntos que se pide por teclado 
    public static void mostrarPorPuntos(Nave [] flota,Scanner scan){
        System.out.println("Ingrese un numero de puntos: ");
        int numero=scan.nextInt();
        for (int i=0;i<flota.length;i++){
            if (flota[i].getPuntos()<=numero) //Si la nave tiene menos puntos que "numero", entoces se imprime
                System.out.println(flota[i].navePunto());
        }
    } 

    //Método que devuelve la Nave con mayor número de Puntos 
    public static Nave mostrarMayorPuntos(Nave [] flota){
        Nave mayor=flota[0]; //Definimos temporalmente a la nave mayor
        for (int i=1;i<flota.length;i++){
            if (flota[i].getPuntos()>mayor.getPuntos()){ //Si existen una nave con mayor puntos
                mayor=flota[i];                          //entonces se actualiza la variable mayor
            }
        }
        return mayor;
    }

    //Método para buscar la primera nave con un nombre que se pidió por teclado 
    public static int busquedaLinealNombre(Nave[] flota, String s){ 
        for (int i=0;i<flota.length;i++){
            if (flota[i].getNombre().equals(s))
                return i;
        }
        return -1;
    } 

    //Método que ordena por número de puntos de menor a mayor 
    public static void ordenarPorPuntosBurbuja(Nave[] flota){ 
        Nave cambio;
        for (int i=0;i<flota.length-1;i++){
            for (int j=0;j<flota.length-1-i;j++){
                if (flota[j].getPuntos()>flota[j+1].getPuntos()){
                    cambio=flota[j];
                    flota[j]=flota[j+1];
                    flota[j+1]=cambio;
                }
            }
        }
    }

    //Método que ordena por nombre de A a Z 
    public static void ordenarPorNombreBurbuja(Nave[] flota){ 
        Nave cambio;
        for (int i=0;i<flota.length-1;i++){
            for (int j=0;j<flota.length-1-i;j++){
                if (flota[j].getNombre().compareTo(flota[j+1].getNombre())>0){
                    cambio=flota[j];
                    flota[j]=flota[j+1];
                    flota[j+1]=cambio;
                }
            }
        }
    } 

    //Método para buscar la primera nave con un nombre que se pidió por teclado 
    public static int busquedaBinariaNombre(Nave[] flota, String s){ 
        int alta,media,baja=0;
        alta=flota.length-1;
        while (baja<=alta){
            media=(alta+baja)/2;
            if (flota[media].getNombre().equals(s))
                return media;
            else if (s.compareTo(flota[media].getNombre())<0)
                alta=media-1;
            else
                baja=media+1;
        }
        return -1;
    } 

    //Método que ordena por número de puntos de menor a mayor 
    public static void ordenarPorPuntosSeleccion(Nave[] flota){ 
        Nave cambio;
        int posMenor;
        for (int i=0;i<flota.length-1;i++){
            posMenor=posicionPuntosMenor(i,flota);
            if (flota[i].getPuntos()>flota[posMenor].getPuntos()){
                cambio=flota[i];
                flota[i]=flota[posMenor];
                flota[posMenor]=cambio;
            }
        } 
    }

    //Método que ordena por nombre de A a Z 
    public static void ordenarPorNombreSeleccion(Nave[] flota){
        Nave cambio;
        int posMenor;
        for (int i=0;i<flota.length-1;i++){
            posMenor=posicionNombreMenor(i,flota);
            if (flota[i].getNombre().compareTo(flota[posMenor].getNombre())>0){
                cambio=flota[i];
                flota[i]=flota[posMenor];
                flota[posMenor]=cambio;
            }
        }
    } 

    //Método que muestra las naves ordenadas por número de puntos de mayor a menor 
    public static void ordenarPorPuntosInsercion(Nave[] flota){ 
        for (int i=1;i<flota.length;i++) {
        Nave naveComparacion=flota[i];  // Guarda la nave en la posición actual
        int puntoComparacion=flota[i].getPuntos();  // Obtiene los puntos de la nave actual
        int j;
        // Mueve los elementos mayores a la derecha
        for (j=i-1;j>=0 && flota[j].getPuntos()>puntoComparacion;j--) {
            flota[j+1] = flota[j];  // Desplaza hacia adelante
        }
        // Inserta la nave en la posición correcta
        flota[j+1]=naveComparacion;  // Coloca la nave en la posición correcta
        }
    } 

    //Método que muestra las naves ordenadas por nombre de Z a A 
    public static void ordenarPorNombreInsercion(Nave[] flota){ 
        for (int i=1;i<flota.length;i++) {
        Nave naveComparacion=flota[i];  // Guarda la nave en la posición actual
        String nombreComparacion=flota[i].getNombre();  // Obtiene los puntos de la nave actual
        int j;
        // Mueve los elementos mayores a la derecha
        for (j=i-1;j>=0 && flota[j].getNombre().compareTo(nombreComparacion)>0;j--) {
            flota[j+1]=flota[j];  // Desplaza hacia adelante
        }
        // Inserta la nave en la posición correcta
        flota[j+1]=naveComparacion;  // Coloca la nave en la posición correcta
        }
    }
    
    //Metodo que halla la posicion de la nave con menor puntaje
    public static int posicionPuntosMenor(int inicio,Nave[] flota){
        int posMenor=inicio;
        for (int i=inicio+1;i<flota.length;i++){
            if (flota[posMenor].getPuntos()>flota[i].getPuntos())
                posMenor=i;          
        }
        return posMenor;
    }
    
    //Metodo que halla la posicion de la nave con un nombre cercano a "Z"
    public static int posicionNombreMenor(int inicio,Nave[] flota){
        int posMenor=inicio;
        for (int i=inicio+1;i<flota.length;i++){
            if (flota[posMenor].getNombre().compareTo(flota[i].getNombre())>0)
                posMenor=i;          
        }
        return posMenor;
    }
}
