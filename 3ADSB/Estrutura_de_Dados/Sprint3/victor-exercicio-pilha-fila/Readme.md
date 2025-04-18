Crie um projeto chamado xxxxxx-exercicio-pilha-fila, sendo xxxxxx o seu primeiro nome. Se tiver outro aluno com mesmo nome que você em sua turma, acrescente o segundo nome separado por um hífen (ex: ana-rita-exercicio-pilha).

Copie para esse projeto a sua classe tema usada nos exercícios de saída formatada e arquivo csv.

Copie também para esse projeto as classes PilhaObj<T> e FilaObj<T>.

Suponha que você vai usar um Repositorio, que por questões de performance, armazena os objetos num List.

Esse Repositorio terá as operações de salvar e deletar, e ele permite que as operações de salvar sejam desfeitas.

Além disso, esse Repositorio também permite agendar a operação de salvar, para ser executada num momento posterior, mais oportuno. Esse agendamento será enfileirado para que ele possa ser executado posteriormente, na ordem em que foi solicitado o agendamento.

1- Dessa forma, crie uma classe chamada Repositorio.

(a) Atributos encapsulados de Repositorio:
List<Classe tema> lista
PilhaObj<Integer> pilha
FilaObj<Classe Tema> fila

(b) Construtor de Repositorio
- Instancia os atributos lista, pilha e fila. Pode criar a pilha e a fila com tamanho 10.

(c) Métodos de Repositorio

(c1) salvar, do tipo void, recebe como argumento um objeto do tipo ClasseTema.
Esse método adiciona esse objeto à lista. Como o método salvar pode ser desfeito, empilha o id do objeto na pilha.

(c2) deletar, do tipo void, recebe como argumento um inteiro id, do objeto a ser deletado.
Esse método verifica se o objeto com id igual ao argumento existe na lista. Se existir, remove esse objeto da lista. Se não existir, exibe a mensagem "ID inexistente". Obs: Não confundam o id do objeto com o índice da lista. O id pode ser 100 e estar no índice zero da lista. Você deve percorrer a lista para encontrar o objeto da lista cujo id seja o id desejado. Para remover da lista, vc pode usar o método remove da lista, passando como argumento o próprio objeto ou o índice (que é diferente do ID) do objeto na lista. Se vc usar uma variável para ser o índice da lista, essa variável deve ser int e não Integer.

(c3) exibir, do tipo void, não recebe argumentos.
Esse método verifica se a lista está vazia. Se estiver, exibe "Repositório vazio", senão exibe o conteúdo da lista.
Esse método também chama o método exibe da pilha e o método exibe da fila.

(c4) desfazer, do tipo void, não recebe argumentos.
Esse método verifica se a pilha está vazia. Se estiver, exibe mensagem "Não há nada a desfazer". Senão, desempilha um id da pilha e chama o deletar, passando esse id, para desfazer a última operação de salvar.

(c5) agendarSalvar, do tipo void, recebe como argumento um objeto do tipo ClasseTema.
Esse método enfileira o argumento recebido na fila, para que seja executado posteriormente.

(c6) executarAgendado, do tipo void, recebe como argumento um inteiro qtdOperacoes, com o valor da quantidade de operações a serem executadas da fila. Esse método verifica se a fila está vazia. Se estiver, exibe mensagem “Não há operações agendadas”. Se a fila não estiver vazia, valide o argumento, exibindo mensagem “Quantidade inválida” se o argumento for menor ou igual a zero ou maior do que o tamanho da fila. Retire da fila a quantidade desejada de operações, executando uma a uma. (Lembre-se de usar a operação salvar para executar a operação)


2- Na classe Main, no método main:

(a) Crie um objeto Repositorio
(b) Fique num loop, exibindo o menu:
1- Salvar objeto
2- Deletar objeto
3- Exibir
4- Desfazer
5- Agendar salvar
6- Executar agendado
7- Fim
Se o usuário digitar:
Opção 1: solicite que o usuário digite os valores dos atributos da sua classe tema, crie um objeto da sua classe tema, e chama o método salvar do repositorio, passando esse objeto. O ID deve ser a partir de 100. Se preferir, pode deixar o id ser automático. Ou seja, seu programa controla o valor do id, sem que o usuário precise digitar esse valor.
Opção 2: solicite que o usuário digite o ID do objeto a ser deletado. Chame o método deletar do repositorio, passando esse ID.
Opção 3: chama o método exibir do repositorio.
Opção 4: chama o método desfazer do repositorio.
Opção 5: solicite que o usuário digite os valores dos atributos do objeto da classe tema. Instancie um objeto com os valores digitados e chame o me´todo agendarSalvar da classe Repositorio.
Opção 6: solicite que o usuário digite a quantidade de operações agendadas a serem executadas. Chame o método executarAgendado da classe Repositorio, passando como argumento a quantidade lida.
Opção 7: encerra o programa
Qualquer outra opção diferente de 1, 2, 3, 4, 5, 6, 7, exiba mensagem de opção inválida e continue no loop.

Teste seu programa!