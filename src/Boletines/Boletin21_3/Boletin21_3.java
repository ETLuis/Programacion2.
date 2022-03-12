package Boletines.Boletin21_3;

public class Boletin21_3 {
    public static void main(String[] args) {
        Notas DAM = new Notas();

        String[] nombresDAM = DAM.asignarNombre();
        int[] notasDAM = DAM.cargarNotas();


        DAM.buscarNotaAlumno("Persona7", nombresDAM, notasDAM);

        DAM.alumnosAprobados(nombresDAM, notasDAM);

        DAM.ordenarLista(nombresDAM, notasDAM);

        DAM.buscarNotaAlumnoPorTeclado(nombresDAM, notasDAM);


    }
}
