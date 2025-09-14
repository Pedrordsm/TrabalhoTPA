package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaEncadeadaComComparator<Aluno> l = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorNome());
        ListaEncadeadaComComparator<Aluno> l1 = new ListaEncadeadaComComparator<Aluno>(true, new ComparadorAlunoPorMatricula());
        Aluno a1 = new Aluno(1, "Zé",12);
        Aluno a2 = new Aluno(2, "mané", 12331);
        Aluno a3 = new Aluno(3, "josep",  123);


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


                }catch (NullPointerException e){
                    System.out.println("Elemento não encontrado.");

                } catch (Exception e) {
                    System.out.println("Erro ao executar o menu!");
                }finally {
                    s.nextLine();
                }
            }while (opcao != 0);


        //linkedList.carregarDados();

        l.adicionar(a1);
        l.adicionar(a2);
        l1.adicionar(a1);
        l1.adicionar(a2);
        l.adicionar(a3);
        l1.contemElemento(a1);
        l1.contemElemento(a2);
        l1.pesquisar(new Aluno(3,null,0));
        l.pesquisar(new Aluno(3,"Zé",0));
        System.out.println(l1.pesquisar(new Aluno(1,null,0)));

        System.out.println(l);
        System.out.println(l1);
        //GeradorArquivosOrdenados.gerarArquivo();
        //GeradorArquivosBalanceados.gerarArquivo();
        //LeitorArquivos.LerArq();
        /*Scanner s = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            if (opcao == 1) {
                System.out.println("adicionar aluno");
            } else if (opcao == 2) {
                System.out.println("remover aluno");
            } else if (opcao == 3) {
                System.out.println("buscar aluno");
            } else if (opcao == 4) {
                System.out.println("listar aluno");
            }
            System.out.print("Digite a opção: ");
            opcao = s.nextInt();
        }*/
    }
}