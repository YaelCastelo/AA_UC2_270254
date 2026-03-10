public class Main_burbuja {

    public static void main(String[] args) {

        int[] numeros = {5, 3, 8, 1}; // se crea un arreglo desordenado
        Ordenamiento_burbuja.ordenar(numeros); // se llama al método para ordenar el arreglo
        for (int n : numeros) { // ciclo que recorre cada número del arreglo
            System.out.print(n + " "); // imprime cada número ordenado en la consola
        }
    }

}
