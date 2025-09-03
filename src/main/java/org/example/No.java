package org.example;


public class No<T> {
    private T valor;
    private No prox;

    public No(T valor){
        this.valor = valor;
        this.prox = null;
    }

    public void setProx(No n){
        this.prox = n;
    }

    public No getProx(){
        return this.prox;
    }

    public Object getValor(){
        return this.valor;
    }
}
