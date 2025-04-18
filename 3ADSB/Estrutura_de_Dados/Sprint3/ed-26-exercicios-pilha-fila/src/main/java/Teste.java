public class Teste {
    public void separaPositivoNegativoEmOrdem(int[] v) {
        FilaObj<Integer> filaPositivos = new FilaObj<>(v.length);
        FilaObj<Integer> filaNegativos = new FilaObj<>(v.length);

        for (int num : v) {
            if (num >= 0) {
                filaPositivos.insert(num);
            } else {
                filaNegativos.insert(num);
            }
        }
        while (!filaPositivos.isEmpty()) {
            System.out.print(filaPositivos.remove() + " ");
        }
        while (!filaNegativos.isEmpty()) {
            System.out.print(filaNegativos.remove() + " ");
        }
    }
    public void separaPositivoNegativoOrdemDiferente(int[] v) {
        FilaObj<Integer> filaPositivos = new FilaObj<>(v.length);
        PilhaObj<Integer> pilhaNegativos = new PilhaObj<>(new Integer[v.length], 0);
        for (int num : v) {
            if (num >= 0) {
                filaPositivos.insert(num);
            } else {
                pilhaNegativos.push(num);
            }
        }
        while (!filaPositivos.isEmpty()) {
            System.out.print(filaPositivos.remove() + " ");
        }
        while (!pilhaNegativos.isEmpty()) {
            System.out.print(pilhaNegativos.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int[] v = {2, 7, -3, -50, 45, -4, 30, -21, 38};
        Teste teste = new Teste();
        System.out.println("Fila em ordem de positivos e negativos de forma crescente:");
        teste.separaPositivoNegativoEmOrdem(v);
        System.out.println("\n");
        System.out.println("Pilha em ordem de positivos e negativos de forma decrescente:");
        teste.separaPositivoNegativoOrdemDiferente(v);
    }
}