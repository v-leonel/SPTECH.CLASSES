import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private List<Time> listaTimes;

    public Campeonato(String nome) {
        this.nome = nome;
        this.listaTimes = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        listaTimes.add(time);
        System.out.println("Time " + time.getNome() + " adicionado ao campeonato " + nome);
    }

    public void treinarCampeonato() {
        System.out.println("Treinando todos os times no campeonato " + nome);
        for (Time time : listaTimes) {
            time.treinarTime();
        }
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Time> getListaTimes() {
        return listaTimes;
    }

    public void setListaTimes(List<Time> listaTimes) {
        this.listaTimes = listaTimes;
    }
}
