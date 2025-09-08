package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> l = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> l1 = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());
        Aluno a1 = new Aluno(1, "Zé", 50);
        Aluno a2 = new Aluno(2, "Mané", 50);
        Aluno a3 = new Aluno(3, "josep", 3);
        l.adicionar(a1);
        l.adicionar(a2);
        l1.adicionar(a1);
        l1.adicionar(a2);
        l.adicionar(a3);
        l1.contemElemento(a1);
        l1.contemElemento(a2);
        l1.pesquisar(a1);
        l.pesquisar(a2);
        System.out.println(l.pesquisar(a3));

        System.out.println(l);
        System.out.println(l1);
    }
}