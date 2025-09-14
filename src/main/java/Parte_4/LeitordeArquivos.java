package Parte_4;

import org.example.Aluno;
import org.example.ListaEncadeadaComComparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeitordeArquivos {
    private static final String NOME_ARQUIVO = "alunosOrdenados.txt";

    /*public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))){
            int numRegistros = Integer.parseInt(reader.readLine().trim());
            System.out.println("Números de registro " + numRegistros);

            String linha;
            while ((linha = reader.readLine()) != null){
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                Double nota = Double.parseDouble(partes[2]);

                System.out.printf("ID: %d | Nome: %s | Nota: %.2f%n", id, nome, nota);

            }

        }catch (IOException e){
            System.err.println("Erro ao ler arquivo: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Erro ao processar valores numéricos :" + e.getMessage());
        }
    }
     */

    public void gravandoListaEncadeada(ListaEncadeadaComComparator<Aluno> l){
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))){
            int numRegistros = Integer.parseInt(reader.readLine().trim());
            System.out.println("Números de registro " + numRegistros);

            String linha;
            while ((linha = reader.readLine()) != null){
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                Double nota = Double.parseDouble(partes[2]);

                l.adicionar(new Aluno(id , nome, nota));

            }

        }catch (IOException e){
            System.err.println("Erro ao ler arquivo: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Erro ao processar valores numéricos :" + e.getMessage());
        }
    }

    public void gravandoList(List<Aluno> l){
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))){
            int numRegistros = Integer.parseInt(reader.readLine().trim());
            System.out.println("Números de registro " + numRegistros);

            String linha;
            while ((linha = reader.readLine()) != null){
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nome = partes[1];
                Double nota = Double.parseDouble(partes[2]);

                l.add(new Aluno(id , nome, nota));
            }

        }catch (IOException e){
            System.err.println("Erro ao ler arquivo: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Erro ao processar valores numéricos :" + e.getMessage());
        }
    }

}
