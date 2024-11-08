import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um arquivo CSV para ler os dados:");
        System.out.println("1 - aleatorio_100.csv");
        System.out.println("2 - aleatorio_1000.csv");
        System.out.println("3 - aleatorio_10000.csv");
        System.out.println("4 - crescente_100.csv");
        System.out.println("5 - crescente_1000.csv");
        System.out.println("6 - crescente_10000.csv");
        System.out.println("7 - decrescente_100.csv");
        System.out.println("8 - decrescente_1000.csv");
        System.out.println("9 - decrescente_10000.csv");

        int escolha = scanner.nextInt();
        String caminhoArquivo = "";

        switch (escolha) {
            case 1:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\aleatorio_100.csv";
                break;
            case 2:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\aleatorio_1000.csv";
                break;
            case 3:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\aleatorio_10000.csv";
                break;
            case 4:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\crescente_100.csv";
                break;
            case 5:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\crescente_1000.csv";
                break;
            case 6:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\crescente_10000.csv";
                break;
            case 7:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\decrescente_100.csv";
                break;
            case 8:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\decrescente_1000.csv";
                break;
            case 9:
                caminhoArquivo = "C:\\TimeTravelStuff\\Hash-Sort\\Ordenação\\decrescente_10000.csv";
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        try {
            int[] dados = LeituraCSV.lerArquivo(caminhoArquivo);
            List<Integer> listadas = new ArrayList<>();
            for (int num : dados) {
                listadas.add(num);
            }

            int opcao = 0;

            while (opcao != 4) {
                System.out.println("\nMENU\n\n1 - Bubble Sort\n2 - Insertion Sort\n3 - Quick Sort\n4 - Sair\nEscolha uma opção: ");
                opcao = scanner.nextInt();

                List<Integer> listaCopia = new ArrayList<>(listadas);

                long startTime, endTime, duration;

                switch (opcao) {
                    case 1:
                        System.out.println("Usando Bubble Sort");
                        startTime = System.nanoTime();
                        BubbleSort.sort(listaCopia);
                        endTime = System.nanoTime();
                        duration = endTime - startTime;
                        System.out.println("Tempo de execução do Bubble Sort: " + duration + " nanosegundos");
                        break;

                    case 2:
                        System.out.println("Usando Insertion Sort");
                        startTime = System.nanoTime();
                        InsertionSort.sort(listaCopia);
                        endTime = System.nanoTime();
                        duration = endTime - startTime;
                        System.out.println("Tempo de execução do Insertion Sort: " + duration + " nanosegundos");
                        break;

                    case 3:
                        System.out.println("Usando Quick Sort");
                        startTime = System.nanoTime();
                        QuickSort.sort(listaCopia, 0, listaCopia.size() - 1);
                        endTime = System.nanoTime();
                        duration = endTime - startTime;
                        System.out.println("Tempo de execução do Quick Sort: " + duration + " nanosegundos");
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

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
    }
}
