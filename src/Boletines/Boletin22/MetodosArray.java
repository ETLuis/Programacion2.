package Boletines.Boletin22;

import javax.swing.JOptionPane;
import libreriaLuis.lerDatos;


public class MetodosArray {


    public static int [][] crear (int[][]taboa){
        for(int fila =0; fila<taboa.length;fila++)
            for(int columna=0;columna<taboa[fila].length;columna++){
                taboa[fila][columna]=lerDatos.lerInt("Dame os goles de cada equipo:");
            }

        return taboa;
    }


    public static void amosarArray(int[][]taboa,String[]set,String[]nomes){

        for(int columna=0;columna<set.length;columna++)
            System.out.print("\t \t"+ set[columna]);

        for(int fila =0; fila<taboa.length;fila++){
            System.out.print("\n"+nomes [fila]+"\t \t");

            for(int columna=0;columna<taboa[fila].length;columna++)
                System.out.print(taboa[fila][columna]+"\t \t");
        }

    }

    public static int[] sumarGoles(int[][]taboa){
        int suma;
        int aux=0;
        int aux2=0;
        int tam=lerDatos.lerInt("tamaño array :");
        int[]sumas=new int[3];
        //i=0;i<totais.length-1;i++
        //j=i+1;j<totais.legth;j++
        //if(totais[i]<totais[j])




        for(int fila =0; fila<taboa.length;fila++){
            suma=0;

            for(int columna=0;columna<taboa[fila].length;columna++){
                suma = suma + taboa[fila][columna];
                sumas[fila]=suma;
            }

            sumas[fila]=suma;
        }

        return sumas;
    }




    public static void ordeMenorAMaior(int[][]taboa,String[]set,String[]nomes){
        int[]total=MetodosArray.sumarGoles(taboa);

        for(int fila =0; fila<taboa.length;fila++){

            System.out.println("\n \n"+nomes[fila]+"      ");
            for(int columna=0;columna<taboa[fila].length;columna++){

                System.out.print(taboa[fila][columna]+"        ");
            }
            System.out.println("       "+total[fila]);
        }

    }











}
