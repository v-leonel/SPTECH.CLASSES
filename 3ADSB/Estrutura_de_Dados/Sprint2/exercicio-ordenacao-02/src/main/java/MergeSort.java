public class MergeSort {

    public static void mergeSort(int p, int r, int[] v){
        if(p < r-1){
            int q = (p + r) / 2;
            mergeSort(p, q, v);
            mergeSort(q, r, v);
            intercala(p, q, r, v);
        }
    }

    public static void intercala(int p, int q, int r, int[] v){
        int i, j, k;
        int[] w = new int[r-p];
        i = p;
        j = q;
        k = 0;
        while(i < q && j < r){
            if(v[i] <= v[j]){
                w[k++] = v[i++];
            }else{
                w[k++] = v[j++];
            }
            while (i < q){
                w[k++] = v[i++];
            }
        }
    }

    public static void particiona(int[] v, int indInicio, int indFim) {
        int i, j, pivo;
        pivo = v[indFim];
        i = indFim;
        for (j = indFim - 1; j >= indInicio; j--) {
            if (v[j] > pivo) {
                i--;
                int auxInicio = v[i];
                v[i] = v[j];
                v[j] = auxInicio;
            }
        }
        int auxFinal = v[indFim];
        v[indFim] = v[i];
        v[i] = auxFinal;
        if (indInicio < i) {
            particiona(v, indInicio, i - 1);
        }
        if (i < indFim) {
            particiona(v, i + 1, indFim);
        }
    }

    public static void particiona2(int[] v, int indInicio, int indFim) {
        int i = indInicio, j = indFim;
        int pivo = v[(indInicio + indFim) / 2];
        while (i <= j) {
            while (i < indFim && v[i] < pivo) {
                i++;
            }
            while (j > indInicio && v[j] > pivo) {
                j--;
            }
            if (i <= j) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                i++;
                j--;
            }
        }
        if (indInicio < j) {
            particiona(v, indInicio, j);
        }
        if (i < indFim) {
            particiona(v, i, indFim);
        }
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(0, array.length, array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
