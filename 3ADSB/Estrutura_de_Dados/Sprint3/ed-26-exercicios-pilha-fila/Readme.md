1- (Fila) Em um novo projeto, implementar a classe FilaObj <T>, uma fila para armazenar
objetos de tipo genérico.
Crie também uma classe executável Teste.
Na classe Teste, implemente o método separaPositivoNegativoEmOrdem, que recebe um
vetor de inteiros e deve utilizar duas filas de Integer (dois objetos FilaObj<Integer>) para
separar os números positivos dos números negativos e exibi-los separados e na ordem
em que estavam no vetor.
Ao final do método, as filas deverão estar vazias.
No método main da classe Teste, crie um vetor qualquer de inteiros, contendo números
positivos e negativos e chame o método separaPositivoNegativoEmOrdem, passando o
vetor.
Por exemplo, suponha que o vetor criado no main seja:
v = {2,7,-3,-50,45,-4,30,-21,38}
O método deverá exibir a sequência: 2 7 45 30 38 -3 -50 -4 -21


2- (Pilha e Fila) No mesmo projeto, copiar a classe PilhaObj<T>.
Na classe Teste, implemente o método separaPositivoNegativoOrdemDiferente, que
recebe um vetor de inteiros e deve utilizar um objeto FilaObj<Integer> e um objeto
PilhaObj<Integer> para separar os números positivos dos números negativos e exibi-los
separados, mas de forma que os números positivos sejam exibidos na ordem em que
estavam no vetor, e os elementos negativos sejam exibidos na ordem inversa em que
estavam no vetor.
Ao final do método, os objetos fila e pilha deverão estar vazios.
No método main da classe Teste, crie um vetor qualquer de inteiros, contendo números
positivos e negativos e chame o método separaPositivoNegativoOrdemDiferente,
passando o vetor.
Por exemplo, suponha que o vetor criado no main seja:
v = {2,7,-3,-50,45,-4,30,-21,38}
O método deverá exibir a sequência: 2 7 45 30 38 -21 -4 -50 -3