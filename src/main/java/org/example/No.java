package org.example;


public class No<T> {
    private T valor;
    private No<T> prox;

    public No(T valor){
        this.valor = valor;
        this.prox = null;
    }

    public void setProx(No<T> n){
        this.prox = n;
    }

    public No<T> getProx(){
        return this.prox;
    }

    public Object getValor(){
        return this.valor;
    }
}
