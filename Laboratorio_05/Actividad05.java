/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio;

/**
 *
 * @author Usuario24B
 */

public class Actividad05 {
    public static void main(String[] args) {
        // Inicializamos dos ejércitos con un número aleatorio de soldados entre 1 y 5
        int fila=(int)(Math.random()*5+1);
        int columna=(int)(Math.random()*5+1);
        Soldado[][] ejercito1=new Soldado[fila][columna];
        for (int i=0;i<ejercito1.length;i++){
            for (int j=0;j<ejercito1[i].length;j++){
                Soldado persona=new Soldado();
                ejercito1[i][j]=persona;
            }
        }
        inicializarEjercito(ejercito1,fila,columna);
        mostrarEjercito(ejercito1);
    }
    // Método para inicializar un ejército con un número determinado de soldados
    public static void inicializarEjercito(Soldado[][] ejercito,int fil,int col){

        // Llenamos el arreglo con soldados nuevos
        int numSoldados=(int)(Math.random()*10+1);
        for (int i=0;i<numSoldados;i++){
                Soldado persona=new Soldado();
                persona.setNombre("soldado"+i);
                do {
                    persona.aleatorio(fil,col);
                }
                while(!ejercito[persona.getFila()][persona.getColumna()].getNombre().equals("________"));
                ejercito[persona.getFila()][persona.getColumna()]=persona;
                
                
                //persona.aleatorio(fil,col);
                //if (ejercito[persona.getFila()][persona.getColumna()].getNombre().equals("________")){
                    //ejercito[persona.getFila()][persona.getColumna()]=persona;
                //}
                //else {
                    //while (!ejercito[persona.getFila()][persona.getColumna()].getNombre().equals("________")){
                        //persona.aleatorio(fil,col);
                    //}
                    //ejercito[persona.getFila()][persona.getColumna()]=persona;
                //}
        }
    }
    // Asignamos un nombre a cada soldado
    public static void mostrarEjercito(Soldado[][] ejercito){
        for (int i=0;i<ejercito.length;i++){
            for (int j=0;j<ejercito[i].length;j++){
                System.out.print(ejercito[i][j].getNombre()+"|");
            }
            System.out.println();
        }
    }
    
}
