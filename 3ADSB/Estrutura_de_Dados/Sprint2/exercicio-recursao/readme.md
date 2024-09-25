Criar um projeto chamado exercício-recursao.
Implementar a versão recursiva e a versão iterativa dos algoritmos.
1. Dado um número n >= 0, devolve a soma dos números 0, 1, 2, ... , n.
Ex: Dado o número 5, devolve a soma 0 + 1 + 2 + 3 + 4 + 5 = 15


2. Devolve a soma dos elementos de um vetor de inteiros.
Ex: Seja um vetor com os valores
7 3 5 2
 0 1 2 3
 A soma dos elementos desse vetor é 17


3. Devolve a soma dos elementos pares de um vetor de inteiros.
Ex: No vetor do exemplo anterior, a soma dos pares é 2.


4. Dado um vetor de inteiros, devolve a quantidade de elementos ímpares que há no vetor.
Ex: No vetor do exemplo anterior, a quantidade de ímpares é 3.


5. Dado um vetor de inteiros e um valor x, conta quantas ocorrências de x há no vetor.
Ex: Seja um vetor com os valores
7 3 5 3
 0 1 2 3
O valor 3 ocorre 2 vezes.
O valor 5 ocorre 1 vez.


6. Implementar a versão iterativa e recursiva do algoritmo de Euclides para calcular o maior
divisor comum entre 2 números naturais. Esse algoritmo consiste em dividir os 2 números
naturais um pelo outro, depois dividir o divisor pelo resto dessa primeira divisão e assim
sucessivamente, até que o resto seja zero. O maior divisor comum será o último divisor.
Ex: Qual o máximo divisor comum entre 90 e 54?
 Divide-se 90 por 54, obtendo-se quociente 1 e resto 36.
 Divide-se 54 por 36, obtendo-se quociente 1 e resto 18.
 Divide-se 36 por 18, obtendo-se quociente 2 e resto 0.
 Portanto, o máximo divisor comum é 18.


7. Implementar a versão iterativa e recursiva do algoritmo que, dado um vetor de n elementos,
devolve o maior elemento do vetor.


8. Devolve a soma dos dígitos de um número inteiro.
Ex: Número 132 – soma dos dígitos é 6
Número 3417 – soma dos dígitos é 15
Dica: Para se separar os dígitos de um número, basta obter o resto do número por 10. Por
exemplo, 132 dividido por 10, dá 13 e resto 2. Depois, pega-se o resultado da divisão e
repete-se o procedimento até que o resultado seja zero: 13 dividido por 10, dá 1 e resto 3. Novamente, 1 dividido por 10 dá 0 e resto 1.


9. Dado um número inteiro, devolve sua representação em binário (no formato String).
Ex: Número 9 – representação em binário:1001
Número 12 – representação em binário: 1100
Número 32 – representação em binário: 100000
Dica: Divida o número por 2, e depois o resultado da divisão por 2 sucessivamente, até
que o resultado seja zero. Os restos de cada divisão formam a representação em
binário.
Por exemplo, 12 dividido por 2, dá 6 e resto zero.
6 dividido por 2 dá 3 e resto zero.
3 dividido por 2 dá 1 e resto um.
1 dividido por 2 dá 0 e resto um.
Representação binária de 12 é 1100