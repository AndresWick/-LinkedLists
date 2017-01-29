/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase que representa un Nodo de la lista.
 * @author Andrés_Aguirre.
 */
public class Nodo {
    
    /**
     * valor del Nodo.
     */
    private int valor;
    
    /**
     * Nodo al que enlaza este.
     */
    private Nodo sig;
    
    /**
     * Constructor parametrico.
     * @param valor valor del Nodo.
     */
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }
    
    /**
     * Metodo encargado de retornar el Nodo siguiente.
     * @return sig.
     */
    public Nodo getSig(){
        return sig;
    }
    
    /**
     * Metodo encargado de retornar el valor del Nodo.
     * @return valor.
     */
    public int getValor(){
        return valor;
    }
    
    /**
     * Metodo encargado de cambiar el Nodo al que enlazará este.
     * @param sig Nodo siguiente al que enlazará este.
     */
    public void setSig(Nodo sig){
        this.sig = sig;
    }
    
}
