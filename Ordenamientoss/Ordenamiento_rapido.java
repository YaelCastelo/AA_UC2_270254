public class Ordenamiento_rapido { // se define la clase

    public static void quicksort(int[] arr, int inicio, int fin) { // método principal de quicksort
        if (inicio < fin) { // condición para seguir dividiendo el arreglo
            int pivote = particion(arr, inicio, fin); // se obtiene la posición del pivote

            quicksort(arr, inicio, pivote - 1); // ordena la parte izquierda
            quicksort(arr, pivote + 1, fin); // ordena la parte derecha
        }
    }

    public static int particion(int[] arr, int inicio, int fin) { // método para ubicar el pivote
        int pivote = arr[fin]; // se toma el último elemento como pivote, //asignación (1)
        int i = inicio - 1; // índice del elemento más pequeño, //asignación (1)

        for (int j = inicio; j < fin; j++) { // recorre el arreglo, //asignación (1), comparación (n), incremento (n)
            if (arr[j] < pivote) { // compara con el pivote, //comparación (1)
                i++; // incrementa el índice, //asignación (1)

                // intercambio
                int temp = arr[i]; //asignación (1)
                arr[i] = arr[j]; //asignación (1)
                arr[j] = temp; //asignación (1)
            }
        }

        // colocar pivote en su posición correcta
        int temp = arr[i + 1]; //asignación (1)
        arr[i + 1] = arr[fin]; //asignación (1)
        arr[fin] = temp; //asignación (1)

        return i + 1; // retorna la posición del pivote
    }

    public static void main(String[] args) { // método principal
        int[] numeros = {5, 3, 8, 1}; // arreglo desordenado, //asignación (1)

        quicksort(numeros, 0, numeros.length - 1); // llamada al método, //llamada (1)

        for (int n : numeros) { // recorrido del arreglo, //recorrido (n)
            System.out.print(n + " "); // impresión (n)
        }
    }
}

/*
Expresión algebraica aproximada de operaciones:

Mejor y caso promedio:
T(n) = n log n

Peor caso:
T(n) = n²

Justificación:
- El arreglo se divide en partes más pequeñas en cada llamada recursiva
- Cada nivel de recursión procesa aproximadamente n elementos
- La profundidad de la recursión es log n (cuando está balanceado)

Notación asintótica:
O(n log n) en promedio
O(n²) en el peor caso

Esto significa que Quicksort es mucho más eficiente que el método burbuja
en la mayoría de los casos, porque divide el problema en partes más pequeñas
en lugar de comparar todos los elementos muchas veces.
*/
