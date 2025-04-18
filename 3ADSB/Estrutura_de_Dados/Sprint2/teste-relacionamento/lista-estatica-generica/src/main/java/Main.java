import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaObj<String> Lista = new ListaObj<>(5);
        Lista.adiciona("A");
        System.out.println(Lista.getTamanho());
        System.out.println(Lista.getElemento(0));
        Lista.adiciona("B");
        System.out.println(Lista.getTamanho());
        System.out.println(Lista.getElemento(1));
        Lista.adiciona("C");
        System.out.println(Lista.getTamanho());
        System.out.println(Lista.getElemento(2));
        Lista.adiciona("D");
        Lista.adiciona("E");
        Lista.busca("C");
        Lista.removeElemento("E");
        Lista.getElemento(2);
        Lista.exibe();
        Lista.limpa();
        Lista.exibe();
    }
}
