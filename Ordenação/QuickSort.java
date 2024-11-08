import java.util.List;

public class QuickSort {
    public static void sort(List<Integer> list, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = partition(list, inicio, fim);
            sort(list, inicio, pivoIndex - 1);
            sort(list, pivoIndex + 1, fim);
        }
    }

    private static int partition(List<Integer> list, int inicio, int fim) {
        int pivo = list.get(fim);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (list.get(j) <= pivo) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(fim));
        list.set(fim, temp);

        return i + 1;
    }
}
