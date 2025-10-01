package Librerias.Main;

import java.util.stream.IntStream;

public class Main {

    public static String detectarOrden(int[] arr) {
        boolean ascendente = IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i] <= arr[i + 1]);

        boolean descendente = IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i] >= arr[i + 1]);

        if (ascendente) return "Ascendente";
        else if (descendente) return "Descendente";
        else return "Desordenado";
    }

    public static boolean esAritmetica(int[] arr) {
        if (arr.length < 2) return false;
        return IntStream.range(1, arr.length - 1)
                .allMatch(i -> arr[i + 1] - arr[i] == arr[1] - arr[0]);
    }

    public static boolean esGeometrica(int[] arr) {
        if (arr.length < 2 || arr[0] == 0) return false;
        return IntStream.range(1, arr.length - 1)
                .allMatch(i -> arr[i] != 0 && (double) arr[i + 1] / arr[i] == (double) arr[1] / arr[0]);
    }


    public static int busquedaBinaria(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) return mid;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println("\nOrden: " + detectarOrden(arr));

        if (esAritmetica(arr)) {
            System.out.println("El arreglo es una progresión aritmética.");
        } else if (esGeometrica(arr)) {
            System.out.println("El arreglo es una progresión geométrica.");
        } else {
            System.out.println("El arreglo no cumple ninguna progresión.");
        }

        // 🔹 Prueba de la búsqueda binaria
        int valor = 5;
        int resultado = busquedaBinaria(arr, valor);
        if (resultado != -1) {
            System.out.println("Elemento " + valor + " encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento " + valor + " no encontrado");
        }
    }
}
