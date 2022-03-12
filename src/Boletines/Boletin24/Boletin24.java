package Boletines.Boletin24;

import javax.swing.*;

public class Boletin24 {
    Libreria lib= new Libreria();
    int menu=0;

        do {
        menu=Integer.parseInt(JOptionPane.showInputDialog("-- Librería --\n\n1-> añadir libros\n2-> Borrar libros \n3-> mostrar los libros\n4-> dar de baja\n5-> consultar libro\n0-> Salir"));
        switch (menu){

            case 1: lib.addLibro();
                break;
            case 2: lib.venderLibro();
                break;
            case 3: lib.mostrarLibros();
                break;
            case 4: lib.darDeBaixaLibro();
                break;
            case 5: lib.consultasLibro();
                break;
            case 0:JOptionPane.showMessageDialog(null,"Fin del programa");
                break;
            default:
                JOptionPane.showMessageDialog(null,"opcion invalida, vuelve intentarlo");
        }
    }while (menu!=0);

}

