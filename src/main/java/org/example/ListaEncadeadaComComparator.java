package org.example;

import java.util.Comparator;

public class ListaEncadeadaComComparator<T> {
    private No<T> prim,ult;
    private int quantidade;
    private final boolean ordenada;
    private Comparator<Object> comparador;

    public ListaEncadeadaComComparator(boolean ehOrdenada, Comparator<T> comparador){
        this.prim=this.ult = null;
        this.quantidade = 0;
        this.ordenada = ehOrdenada;
        this.comparador = (Comparator<Object>) comparador;

    }

    public void inserirElemento(T elem) {
        if (this.ordenada == false) {
            inserirElementoNaoOrd(elem);
        } else {
            inserirElementoOrd(elem);
        }
    }

    public void inserirElementoNaoOrd(T elem){
        No<T> novo = new No<T>(elem);
        if (this.prim == null) {
            this.prim = novo;
            this.ult = novo;
        } else {
            this.ult.setProx(novo);
            this.ult = novo;
        }
        this.quantidade++;
    }
    public void inserirElementoOrd(T elem){
        No<T> novo = new No<T>(elem);
        No<T> atual,ant;
        atual = this.prim;
        ant = null;
        if (this.prim == null){
            this.prim = novo;
            this.ult = novo;
        }
        else{
            while(atual != null && comparador.compare(atual.getValor(), elem) < 0){
                ant = atual;
                atual = atual.getProx();
            }
            if (ant == null){
                novo.setProx(this.prim);
                this.prim = novo;
            }
            else if (atual == null){
                this.ult.setProx(novo);
                this.ult = novo;
            }
            else{
                ant.setProx(novo);
                novo.setProx(atual);
            }
        }
        this.quantidade++;
    }

    public boolean contemElemento(T elem){
        No<T> aux = this.prim;
        while (aux != null){
            if(aux.getValor().equals(elem))
                return true;
            aux = aux.getProx();
        }
        return false;
    }
    @Override
    public String toString(){
        No<T> aux = this.prim;
        String s = "[";
        while (aux != null){
            s += aux.getValor();
            if (aux != this.ult)
                s += ",";
            aux = aux.getProx();
        }
        return (s+"]");
    }
}
