package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> l = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> l1 = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());

        Menu menu = new Menu();
        Scanner s = new Scanner(System.in);
        int opcao =-1;
            do {

                try {
                menu.mostrarMenu();
                opcao = s.nextInt();
                if (opcao == 1) {
                    System.out.println("Adicionar aluno");

                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = s.nextInt();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    System.out.println("Digite o Nome do Aluno :");
                    String nome = s.nextLine();

                    System.out.println("Digite a Nota do Aluno :");
                    double nota = s.nextDouble();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    l.adicionar(new Aluno(matricula , nome , nota));



                } else if (opcao == 2) {
                    System.out.println("Remover aluno");

                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = s.nextInt();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    System.out.println("Digite o Nome do Aluno :");
                    String nome = s.nextLine();

                    System.out.println("Digite a Nota do Aluno :");
                    double nota = s.nextDouble();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    l.remover(l.pesquisar(new Aluno(matricula,nome,nota)));



                } else if (opcao == 3) {
                    System.out.println("Buscar aluno");

                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = s.nextInt();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    System.out.println("Digite o Nome do Aluno :");
                    String nome = s.nextLine();

                    System.out.println("Digite a Nota do Aluno :");
                    double nota = s.nextDouble();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();
                    if (l.contemElemento(new Aluno(matricula,nome, nota))){
                        System.out.println("Elemento na lista.");
                    }else{
                        System.out.println("Elemento não esta na lista.");
                    }

                } else if (opcao == 4) {
                    System.out.println("Pesquisar aluno");

                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = s.nextInt();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    System.out.println("Digite o Nome do Aluno :");
                    String nome = s.nextLine();

                    System.out.println("Digite a Nota do Aluno :");
                    double nota = s.nextDouble();
                    // S.NEXTLINE() PARA CONSUMIR O \n
                    s.nextLine();

                    System.out.println(l.pesquisar(new Aluno(matricula,nome, nota)).toString());

                }

                } catch (NullPointerException e){
                    System.out.println("Elemento não encontrado.");

                } catch (Exception e) {
                    System.out.println("Erro ao executar o menu!");
                    s.nextLine();
                }
            }while (opcao != 0);



    }
}