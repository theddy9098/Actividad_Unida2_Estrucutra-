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
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for( int i:arr)
            System.out.println(i);
        System.out.println(detectarOrden(arr));





    }

}