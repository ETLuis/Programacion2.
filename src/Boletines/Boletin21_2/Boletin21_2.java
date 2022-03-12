package Boletines.Boletin21_2;

public class Boletin21_2 {
    public static void main(String[] args) {

        Notas DAM = new Notas();
        int[] notasDAM = DAM.cargarNotas();
        DAM.visualizar(notasDAM);


    }
}
