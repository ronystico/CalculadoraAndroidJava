package com.example.calculadora;

public class Calcular {
    public static float hacerCalculo(float numero1,float numero2,String tipo) {
        float resultado = 0;
        switch (tipo) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case  "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
        }
        return resultado;
    }
}
