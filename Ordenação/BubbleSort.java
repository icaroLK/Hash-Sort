import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void sort(List<Integer> list) {
        int tamanho = list.size();
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }
}
