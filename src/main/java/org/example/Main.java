package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> l = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> l1 = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());
        Aluno a1 = new Aluno(1, "Zé", 50);
        Aluno a2 = new Aluno(2, "Mané", 50);
        l.inserirElemento(a1);
        l.inserirElemento(a2);
        l1.inserirElemento(a1);
        l1.inserirElemento(a2);
        System.out.println(l);
        System.out.println(l1);
    }
}