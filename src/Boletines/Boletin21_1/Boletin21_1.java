package Boletines.Boletin21_1;


public class Boletin21_1 {
    public static void main(String[] args) {

        NumerosAleatorios vec=new NumerosAleatorios();

        int[] Array=vec.crearNumeros();

        for (int i = Array.length-1; i >= 0 ; i--) {
            System.out.println("Array ["+i+"] --> "+Array[i]);
        }
    }
}
