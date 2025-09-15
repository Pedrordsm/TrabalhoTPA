Para iniciar os testes é necessário executar o GeradordeArquivos.java que irá criar um arquivo .txt com a seguinte arquitetura :
NUM_DE_REGISTROS
Aluno_1
Aluno_2
Aluno_3…

É possível alterar o tamanho do arquivo mudando a variável NUM_REGISTROS antes da execução do programa.
O programa gera nomes aleatórios e uma nota para criar um Aluno(matricula, nome, nota), que pertence ao pacote da primeira parte.
Ao fim de uma execução bem sucedida o terminal ira exibir a mensagem: Arquivo gerado com sucesso: + NOME_ARQUIVO
O NOME_ARQUIVO pode ser alterado como o número de registros.
Após a execução prévia do GeradordeArquivos deve se executar a Main.
Nela as listas serão inicializadas com o arquivo gerado anteriormente com o auxilio do LeitordeArquivos que vai ler o arquivo especificado na variável NOME_ARQUIVO antes da execução da main, ao chamar o método gravandoList(List<Aluno> l) os elementos são instanciado em uma List, após a leitura do arquivo o programa entra em um menu. No menu é possivel fazer os testes descritos e conferir os resultados obtidos. Quando uma adição na lista é feita um Aluno especial é inserido na lista sendo ele Aluno(111333, "Individou Teste", 10) na posição de acordo com a selecionada.
Ao fim da Main o usuario pode conferir a lista final comentando ou descomentando as listas presentes no final da Main.
