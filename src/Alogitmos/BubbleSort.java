package Alogitmos;

public class BubbleSort {
    // Método que realiza o Bubble Sort para ordenar do maior para o menor
    public void sortDescending(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) { // Trocar se o elemento atual for menor que o próximo
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se não houve trocas, o array já está ordenado
            if (!swapped) break;
        }
    }

    // Método para imprimir o array
    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Método principal para testar o Bubble Sort
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array antes da ordenação:");
        bubbleSort.printArray(array);

        bubbleSort.sortDescending(array);

        System.out.println("Array após a ordenação do maior para o menor:");
        bubbleSort.printArray(array);
    }
}
