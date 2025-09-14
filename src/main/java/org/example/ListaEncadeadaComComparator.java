package org.example;

import java.util.Comparator;

public class ListaEncadeadaComComparator<T> {
    private No<T> prim,ult;
    private int quantidade;
    private final boolean ordenada;
    private Comparator<T> comparador;

    public ListaEncadeadaComComparator(boolean ehOrdenada, Comparator<T> comparador){
        this.prim=this.ult = null;
        this.quantidade = 0;
        this.ordenada = ehOrdenada;
        this.comparador = comparador;

    }

    // ADICIONAR
    public void adicionar(T elem) {
        if (!this.ordenada) {
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

    // PESQUISAR
    public T pesquisar(T valor){
        if (this.prim == null) return null;
        if (this.ordenada){
            pesquisarOrd(valor);
        }
        else {
            pesquisarNaoOrd(valor);
        }
        return null;
    }

    public T pesquisarOrd(T valor) {
        No<T> aux = this.prim;
        while (aux != null){
            int cmp = comparador.compare(aux.getValor(), valor);
            if (cmp == 0){
                return aux.getValor();
            } else if (cmp > 0){
                return null;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public T pesquisarNaoOrd(T valor) {
        No<T> aux = this.prim;
        while (aux != null) {
            if (aux.getValor().equals(valor))
                return aux.getValor();
            aux = aux.getProx();
        }
        return null;
    }


    // Contem Elemento
    public boolean contemElemento(T elem) {
        if (this.prim == null) return false;
        if (this.ordenada) {
            return contemElementoOrd(elem);
        } else {
            return contemElementoNaoOrd(elem);
        }
    }

    public boolean contemElementoOrd(T elem) {
        No<T> aux = this.prim;
        while (aux != null) {
            int cmp = comparador.compare(aux.getValor(), elem);
            if (cmp == 0) {
                return true;
            } else if (cmp > 0) {
                return false;
            }
            aux = aux.getProx();
        }
        return false;
    }

    public boolean contemElementoNaoOrd(T elem) {
        No<T> aux = this.prim;
        while (aux != null) {
            if (aux.getValor().equals(elem))
                return true;
            aux = aux.getProx();
        }
        return false;
    }

    // REMOVER ELEMENTO
    public boolean remover(T elem){
        if (this.prim == null) return false;

        if (this.ordenada){
            return removerOrd(elem);
        }else {
            return removerNaoOrd(elem);
        }
    }

    public boolean removerOrd(T elem) {
        No<T> aux = this.prim;
        No<T> ant = null;
        while (aux != null) {
            int cmp = comparador.compare(aux.getValor(), elem);
            if (cmp == 0) {
                if (aux == this.prim) {
                    this.prim = this.prim.getProx();
                    if (aux == this.ult) {
                        this.ult = null;
                    }
                } else {
                    ant.setProx(aux.getProx());
                    if (aux == this.ult) {
                        this.ult = ant;
                    }
                }
                this.quantidade--;
                return true;
            } else if (cmp > 0) {
                return false;
            }

            ant = aux;
            aux = aux.getProx();
        }
        return false;
    }

    public boolean removerNaoOrd(T elem) {
        No<T> aux = this.prim;
        No<T> ant = null;
        while(aux != null){
            if (aux.getValor().equals(elem)){
                if(aux == this.prim){
                    this.prim = this.prim.getProx();
                    if (aux == this.ult){
                        this.ult = null;
                    }
                }else{
                    ant.setProx(aux.getProx());
                    if(aux == this.ult)
                        this.ult = ant;
                }
                this.quantidade--;
                return true;
            }
            ant = aux;
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
