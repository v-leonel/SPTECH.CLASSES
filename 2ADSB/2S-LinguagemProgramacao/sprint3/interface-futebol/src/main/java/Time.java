import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Treinavel> listaTreinavel;
    private Integer pontos;

    public Time(String nome) {
        this.nome = nome;
        this.listaTreinavel = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarMembro(Treinavel t) {
        listaTreinavel.add(t);
        System.out.println("Membro adicionado ao time " + nome);
    }

    public void treinarTime() {
        System.out.println("Treinando o time " + nome);
        for (Treinavel t : listaTreinavel) {
            t.treinar();
        }
    }

    public void adicionarPontos(Integer pontos) {
        this.pontos += pontos;
        System.out.println(nome + " agora tem " + this.pontos + " pontos.");
    }

    public int getPontos() {
        return pontos;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Treinavel> getListaTreinavel() {
        return listaTreinavel;
    }

    public void setListaTreinavel(List<Treinavel> listaTreinavel) {
        this.listaTreinavel = listaTreinavel;
    }
}
