package Boletines.Boletin18;

public class TemperaturaErradaExcepcion {
    float Farenheir,centígrados,resultado;
    try{
        resultado = 9.0f / 5.0f * centígrados + 32.4f;
        System.out.println("operación = "+ resultado);
    }catch(ArithmeticException ex){
        System.out.println("Erro 1 "+ ex.toString());
    }

}
