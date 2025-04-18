import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> lista;
    private PilhaObj<Integer> pilha;
    private FilaObj<T> fila;

    public Repositorio() {
        lista = new ArrayList<>();
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
    }

    public void salvar(T obj, int id) {
        lista.add(obj);
        pilha.push(id);
    }

    public void deletar(int id) {
        T objToRemove = null;
        for (T obj : lista) {
            if (obj.hashCode() == id) {
                objToRemove = obj;
                break;
            }
        }
        if (objToRemove != null) {
            lista.remove(objToRemove);
        } else {
            System.out.println("ID inexistente");
        }
    }

    public void exibir() {
        if (lista.isEmpty()) {
            System.out.println("Repositório vazio");
        } else {
            for (T obj : lista) {
                System.out.println(obj);
            }
        }
        pilha.exibe();
        fila.exibe();
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            int id = pilha.pop();
            deletar(id);
        }
    }

    public void agendarSalvar(T obj) {
        fila.insert(obj);
    }

    public void executarAgendado(int qtdOperacoes) {
        if (fila.isEmpty()) {
            System.out.println("Não há operações agendadas");
        } else if (qtdOperacoes <= 0 || qtdOperacoes > fila.size()) {
            System.out.println("Quantidade inválida");
        } else {
            for (int i = 0; i < qtdOperacoes; i++) {
                T obj = fila.poll();
                salvar(obj, obj.hashCode());
            }
        }
    }
}