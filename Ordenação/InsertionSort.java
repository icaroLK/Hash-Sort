import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> list) {
        int tamanho = list.size();
        for (int i = 1; i < tamanho; i++) {
            int chave = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > chave) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, chave);
        }
    }
}
