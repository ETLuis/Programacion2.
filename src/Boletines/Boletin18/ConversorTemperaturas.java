package Boletines.Boletin18;

import java.util.Scanner;

public class ConversorTemperaturas {

    final int valor = 80;


    public void centigradosAFharenheit(float centígrados){
        float Farenheir;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a temperatura en grados centígrados: ");
        centígrados=sc.nextInt();

        Farenheir = 9.0f / 5.0f * centígrados + 32.4f;
        System.out.println("A temperatura en grados Farenheir é de: "+Farenheir);

    }




    public void centígradosAReamur(float centígrados){
        float Reamur;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a temperatura en grados centígrados: ");
        centígrados=sc.nextInt();

        Reamur = 4.0f / 5.0f * centígrados;
        System.out.println("A temperatura en grados Reamur é de: "+Reamur);

    }




}
