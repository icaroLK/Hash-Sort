import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa a lista com os números fornecidos
        List<Integer> listadas = new ArrayList<>(Arrays.asList(
                95124, 79808, 84494, 60842, 35110, 60832, 86880, 38712,
                43519, 30490, 59611, 3745, 78026, 55184, 83637, 20721, 36663, 6681, 7130, 97896,
                24499, 57495, 50181, 39699, 39193, 91079, 87787, 87484, 94634, 84238, 85668, 54657,
                69436, 12559, 58676, 53906, 48337, 39708, 70742, 99996, 53416, 47958, 91142, 59949,
                18536, 18006, 74385, 17276, 34823, 32887, 94370, 20558, 71038, 89938, 88421, 58989,
                42898, 18652, 94714, 57848, 98647, 2810, 66996, 35310, 90487, 5237, 83276, 37852,
                6807, 96479, 30075, 55100, 1954, 91999, 87787, 91401, 51094, 84042, 75822, 91253,
                50228, 24919, 47700, 81779, 41548, 31334, 97793, 35647, 13513, 627, 90095, 23370,
                91833, 16386, 26050, 94810, 18327, 70458, 32050, 4521
        ));

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("MENU\n\n1 - Bubble Sort\n2 - Insertion Sort\n3 - Quick Sort\n4 - Sair\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            List<Integer> listaCopia = new ArrayList<>(listadas);  // Cria uma cópia da lista original para ordenação

            switch (opcao) {
                case 1:
                    System.out.println("Usando Bubble Sort");
                    BubbleSort.sort(listaCopia);
                    break;
                case 2:
                    System.out.println("Usando Insertion Sort");
                    InsertionSort.sort(listaCopia);
                    break;
                case 3:
                    System.out.println("Usando Quick Sort");
                    QuickSort.sort(listaCopia, 0, listaCopia.size() - 1);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("Lista ordenada: " + listaCopia);
            }
        }

        scanner.close();
    }
}
