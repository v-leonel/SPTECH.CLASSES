import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adiciona(Contato c){
        contatos.add(c);
    }

    public void adiciona(List<Contato> novosContatos){
        contatos.addAll(novosContatos);
    }

    public void remove(Contato c) {

        int index = contatos.indexOf(c);
        contatos.remove(index);

        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoEncontrado = contatos.get(i);
            if (contatoEncontrado.getNome().equals(c.getNome())) {
                contatos.remove(i);
                i--;
            }
        }
    }

    public void exibirPorNome(String nome){
        for (Contato contatoEncontrado : contatos) {
            if (contatoEncontrado.getNome().equalsIgnoreCase(nome)){
                System.out.println(contatoEncontrado);
            }
        }
    }
    public Grupo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString(){
        return """
                Nome do grupo: %s
                Contatos do grupo: %s
                """.formatted(nome, contatos);
    }
}
