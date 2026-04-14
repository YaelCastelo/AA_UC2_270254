public class Ordenamiento_mezcla { // se define la clase

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) { // condición para dividir el arreglo, //comparación (1)
            int medio = (izquierda + derecha) / 2; // se calcula el punto medio, //asignación (1)

            mergeSort(arr, izquierda, medio); // se ordena la mitad izquierda, //llamada recursiva
            mergeSort(arr, medio + 1, derecha); // se ordena la mitad derecha, //llamada recursiva

            merge(arr, izquierda, medio, derecha); // se combinan las mitades ordenadas, //llamada (1)
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1; // tamaño del subarreglo izquierdo, //asignación (1)
        int n2 = derecha - medio; // tamaño del subarreglo derecho, //asignación (1)

        int[] L = new int[n1]; // arreglo auxiliar izquierdo, //asignación (1)
        int[] R = new int[n2]; // arreglo auxiliar derecho, //asignación (1)

        for (int i = 0; i < n1; i++) { // copiar datos a L, //recorrido (n)
            L[i] = arr[izquierda + i]; //asignación (1)
        }

        for (int j = 0; j < n2; j++) { // copiar datos a R, //recorrido (n)
            R[j] = arr[medio + 1 + j]; //asignación (1)
        }

        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) { // comparación de elementos, //comparación (n)
            if (L[i] <= R[j]) { //comparación (1)
                arr[k] = L[i]; //asignación (1)
                i++;
            } else {
                arr[k] = R[j]; //asignación (1)
                j++;
            }
            k++;
        }

        while (i < n1) { // copiar elementos restantes de L, //recorrido (n)
            arr[k] = L[i]; //asignación (1)
            i++;
            k++;
        }

        while (j < n2) { // copiar elementos restantes de R, //recorrido (n)
            arr[k] = R[j]; //asignación (1)
            j++;
            k++;
        }
    }

    public static void main(String[] args) { // método principal
        int[] numeros = {5, 3, 8, 1}; // arreglo desordenado, //asignación (1)

        mergeSort(numeros, 0, numeros.length - 1); // llamada al método, //llamada (1)

        for (int n : numeros) { // recorrido del arreglo, //recorrido (n)
            System.out.print(n + " "); // impresión (n)
        }
    }
}

/*
Expresión algebraica aproximada de operaciones:

T(n) = 2T(n/2) + n

Justificación:
- El arreglo se divide en dos partes iguales (recursividad)
- Cada nivel realiza un proceso de mezcla que cuesta n
- El número de niveles es log₂(n)

Notación asintótica:
O(n log n)

Esto significa que el algoritmo divide el problema en partes más pequeñas
y luego las combina ordenadamente. Es mucho más eficiente que métodos
como selección en arreglos grandes, ya que reduce significativamente
el número de comparaciones.
*/
