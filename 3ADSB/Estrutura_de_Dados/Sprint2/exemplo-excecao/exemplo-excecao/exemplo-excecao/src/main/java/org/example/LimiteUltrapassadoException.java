package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* Toda classe de excecao em Java deve ser filha da classe Exception
   Como boa pratica, ao criar uma classe personalizada de excecao
   eh bom:
   - o nome da classe terminar com a palavra Exception
   - a classe nova de excecao deve ser herdeira de Exception
   - o construtor da classe nova deve chamar o super da classe mae
 */
public class LimiteUltrapassadoException extends Exception {
    String dataHora;    // data e a hora da ocorrencia da excecao

    //Construtor
    public LimiteUltrapassadoException(String msg) {
        // boa pratica - chamar o construtor da classe mae
        super(msg);
        // Configura a data e a hora em que aconteceu o erro
        dataHora= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
