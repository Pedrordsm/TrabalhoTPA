package Parte_4;

import org.example.Aluno;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Aluno> listaLk = new LinkedList<>();
        ArrayList<Aluno> listaAR = new ArrayList<>();
        LeitordeArquivos arq = new LeitordeArquivos();

        Long tempoInicio, tempoFim, duracao;


        tempoInicio = System.currentTimeMillis();
        System.out.println("Criando Lista Encadeada!");
        arq.gravandoList(listaLk);

        tempoFim = System.currentTimeMillis();
        duracao = tempoFim-tempoInicio;
        System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

        tempoInicio = System.currentTimeMillis();
        System.out.println("Criando Lista Vetorial!");
        arq.gravandoList(listaAR);

        tempoFim = System.currentTimeMillis();
        duracao = tempoFim-tempoInicio;
        System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");


        String menu = "Selecione uma modalidade:\n" +
                "1 - Inserir ao inicio\n" +
                "2 - Inserir no final\n" +
                "3 - Inserir no meio\n" +
                "4 - Buscar elemento no fim da lista\n" +
                "5 - Buscar penultimo elemento\n" +
                "6 - Buscar o elemento no meio das listas\n" +
                "0 - Sair" ;


        Scanner s = new Scanner(System.in);

        int opcao =-1;
        do {

            try {
                System.out.println(menu);
                opcao = s.nextInt();
                if (opcao == 1) {
                    System.out.println("Inserir elemento ao início das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no início da Lista Encadeada!");
                    listaLk.addFirst(new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no início da Lista Encadeada!");
                    listaAR.addFirst(new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                } else if (opcao == 2) {

                    System.out.println("Inserir elemento ao fim das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no fim da Lista Encadeada!");
                    listaLk.addLast(new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no fim da Lista Encadeada!");
                    listaAR.addLast(new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                }else if (opcao == 3) {

                    System.out.println("Inserir elemento no meio das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no meio da Lista Encadeada!");
                    listaLk.add((listaLk.size())/2,new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Inserindo elemento no meio da Lista Encadeada!");
                    listaAR.add((listaAR.size())/2,new Aluno(111333, "Individou Teste", 10));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                }else if (opcao == 4) {

                    System.out.println("Buscar ultimo elemento das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o ultimo elemento da Lista Encadeada!");
                    System.out.println(listaLk.get(listaLk.size()-1));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o ultimo elemento da Lista Encadeada!");
                    System.out.println(listaAR.get(listaLk.size()-1));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                }else if (opcao == 5) {

                    System.out.println("Buscar penultimo elemento das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o penultimo elemento da Lista Encadeada!");
                    System.out.println(listaLk.get(listaLk.size()-2));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o penultimo elemento da Lista Vetorial!");
                    System.out.println(listaAR.get(listaLk.size()-2));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                }else if (opcao == 6) {

                    System.out.println("Buscar elemento no meio das listas!");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o elemento no meio da Lista Encadeada!");
                    System.out.println(listaLk.get(listaLk.size()/2));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                    tempoInicio = System.currentTimeMillis();
                    System.out.println("Buscando o elemento no meio da Lista Vetorial!");
                    System.out.println(listaAR.get(listaLk.size()/2));
                    tempoFim = System.currentTimeMillis();
                    duracao = tempoFim-tempoInicio;
                    System.out.println("Tempo decorrido da execução: " + duracao + " milisegundos");

                }

            } catch (Exception e) {
                System.out.println("Erro ao executar o menu!");
                s.nextLine();
            }
        }while (opcao != 0);


        System.out.println(listaLk);
        //System.out.println(listaAR);

}
}

