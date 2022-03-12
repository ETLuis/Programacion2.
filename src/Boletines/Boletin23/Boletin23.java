package Boletines.Boletin23;

public class Boletin23 {
    int seleccion=0;

        do{

        seleccion=Funciones.simpleSelector("Escoje una oipcion","Strins",Funciones.opciones);

        switch (seleccion) {

            case 0:{

                Funciones.medir("Esto é  Java!");

            }

            case 1:{

                Funciones.despedazar("Java");

            }

            case 2:{

                Funciones.invertir("Java desde 0");

            }

            case 3:{

                Funciones.eliminaEspacios("James Gosling Created Xava");

            }

            case 4:{

                Funciones.cuentaVocales("java java java");

            }

            case 5:{

                Funciones.divideStrings("www. javadesde0. com");

            }

            case 6:{

                Funciones.cambiaMayusculas("javeros");

            }


            case 7:{

                Funciones.comparaStrings("Java","JavaScript");

            }

            case 8:{

                Funciones.cambiaLetra(" Jeve jeve jeve",'e','a');

            }

            case 9:{

                Funciones.TransformaASCII(" ABCD");

            }

            case 10:{
                Funciones.cuentaCaracteres("Ola, son alumno de DAM1, e son programador desde o 2021");
            }

            default:{
                seleccion=-1;
            }

        }

    }while(seleccion!=-1);

}

