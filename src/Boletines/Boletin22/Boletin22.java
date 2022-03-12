package Boletines.Boletin22;

import libreriaLuis.lerDatos;

public class Boletin22 {


    public static void main(String[] args) {
        // TODO code application logic here

        int filas = 3;
        int columnas = 3;

        int [][] taboa = new int [filas][columnas];
        String [] xornadas= {"x1","x2","x3"};
        String [] nomes={"Celta", "Bilbao", "Malaga"};

        taboa = MetodosArray.crear(taboa);
        MetodosArray.amosarArray(taboa, xornadas, nomes);
        MetodosArray.sumarGoles(taboa);
        MetodosArray.ordeMenorAMaior(taboa, nomes, nomes);


    }

}
