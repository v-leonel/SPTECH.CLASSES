public class Main {

    public static void selectionSortOtimizado(int[] v){
        int n = v.length;
        int troca = 0;
        int comparacao = 0;

        for (int i = 0; i < n-1; i++) {
            int indiceMenor = i;
            comparacao++;
            for (int j = i +1; j <n; j++){
                if(v[j] < v[indiceMenor]){
                    indiceMenor = j;
                    troca++;
                }
            }
            int t = v[indiceMenor];
            v[indiceMenor] = v[i];
            v[i] = t;
        }
        System.out.println("Trocas: " + troca);
        System.out.println("Comparações: " + comparacao);
    }

    public static void bubbleSort(int[] v){
        int aux = 0;
        for(int i = 0; i < v.length -1; i++){
            for(int j = 1; j < v.length - i; j++){
                if(v[j -1] > v[j]){
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] v = {4,7,5,2,8,1,6,3};

        selectionSortOtimizado(v);
        bubbleSort(v);

        System.out.println("Lista ordenada (selection sort): ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println("\n\nLista ordenada (bubble sort): ");
        for (int i = 0 ; i < v.length; i++){
            System.out.println(v[i] + " ");
        }
    }
}
