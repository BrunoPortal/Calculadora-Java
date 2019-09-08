/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.core;

/**
 *
 * @author Bruno
 */
public class CalculadoraCore {
    
    public Double somar(Double numero1, Double numero2){
        return numero1 + numero2;
    }
    
    public Double subtrair(Double numero1, Double numero2){
        return numero1 - numero2;
    }
    
    public Double multiplicar(Double numero1, Double numero2){
        return numero1 * numero2;
    }
    
    public Double dividir(Double numero1, Double numero2){
        if(numero2 == 0){
            return -1D;
        }
        else{
            return numero1 / numero2;
        } 
    }
}
