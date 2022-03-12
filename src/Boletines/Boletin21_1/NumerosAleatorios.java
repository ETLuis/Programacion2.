package Boletines.Boletin21_1;

public class NumerosAleatorios {


        public int[] crearNumeros(){
            int [] num= new int[6];

            for (int i = 0; i < num.length; i++) {
                num[i]=((int)(Math.random()*50+1));
            }
            return num;
        }
}
