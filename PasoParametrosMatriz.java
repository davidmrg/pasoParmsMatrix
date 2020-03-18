/*
 1) El programa pide los datos para guardarlos en una matriz 2x2 y los imprime en pantalla
 2) En la función main: Se piden los datos y el resultado se muestra (llamado al método del punto 3)
 3) En un método afuera del main: se desarrolla la lógica de imprimir la matríz.
 4) Usar import java.util.Scanner;
 */
package pasoparametrosmatriz;
import java.util.Scanner;
/**
 *
 * @author davidmramirez
 */
public class PasoParametrosMatriz {

       
    //definimos objeto scanner en la instancia s
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        //declaramos matriz
        int [][]matriz1 = new int[2][2];
        //pedimos datos para llenar primer matriz
        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print("ingrese elemento de fila " + i + " y columna " + j + ":");
                matriz1[i][j]=s.nextInt();
            }    
        }
        //llamamos la función para imprimir la matriz
        imprimeMatriz(matriz1);  
    }
    
    public static void imprimeMatriz(int[][] m1){
        System.out.println("la matriz impresa es: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
