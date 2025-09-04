package org.example;

public class ListaEncadeada<T>{
    private No<T> prim, ult;
    private int quant;

    public ListaEncadeada(){
        this.prim=this.ult=null;
        this.quant=0;

    }

    public void inserirElemento(T elem) {
        No<T> novo = new No<T>(elem);
        if (this.prim == null) {
            this.prim = novo;
            this.ult = novo;
        } else {
            this.ult.setProx(novo);
            this.ult = novo;
        }
        this.quant++;
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

    public boolean excluirElemento(T elem){
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
                this.quant--;
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


