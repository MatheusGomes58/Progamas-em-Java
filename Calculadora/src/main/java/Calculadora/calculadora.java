/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author mathe
 */


public class calculadora {
    
    
    double valor1, valor2;
    String sinal, corrige, txt_Resultado , calculo = "";
    int primeirodig = 0, zerar = 0;

    public calculadora() {
        
    }
    
    public String attribuir(String valor)
    {   
        
        valor1 = Double.parseDouble(calculo);
        txt_Resultado = calculo;
        
        if(null != valor)switch (valor) {
            case "soma" -> {
                txt_Resultado += " + " ;
            }
            case "subtrai" -> {
                txt_Resultado += " - ";
            }
            case "divide" -> {
                txt_Resultado += " / ";
            }
            case "multiplica" -> {
                txt_Resultado += " * ";
            }
            default -> {
            }
        }
        
        sinal = valor;
        calculo = "";
        return txt_Resultado;
    }
    
    public String acrescentar(String valor)
    {
        if ("".equals(valor))
        {
            txt_Resultado = "";
            calculo = "";
            primeirodig = 0;
        }else if (primeirodig == 1){
            calculo += valor;
            txt_Resultado += valor;
        }else if(primeirodig == 0) {
            calculo = valor;
            txt_Resultado = valor;
            primeirodig++;
        }
        
        return txt_Resultado;
    }
    
    public String corrige()
    {
        corrige = txt_Resultado;
        corrige = corrige.substring(0,corrige.length()-1);
        txt_Resultado = corrige;
        calculo = corrige;
        
        return txt_Resultado;
    }
    
    public String calcular( )
    {
        valor2 = Double.parseDouble(calculo);
        calculo = "";
        
        if (null != sinal) switch (sinal) {
            case "soma" -> txt_Resultado += " = " + String.valueOf(valor1+valor2);
            case "subtrai" -> txt_Resultado += " = " + String.valueOf(valor1-valor2);
            case "divide" -> txt_Resultado += " = " + String.valueOf(valor1/valor2);
            case "multiplica" -> txt_Resultado += " = " + String.valueOf(valor1*valor2);
            default -> {
            }
        }
        
        zerar = 1;
        return txt_Resultado;
    }
    
    void zerar()
    {
        if(zerar == 1)
        {
            txt_Resultado = "";
            calculo = "";
            primeirodig = 0;
            zerar = 0;
        }
    }
}
