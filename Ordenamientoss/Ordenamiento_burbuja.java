public class Ordenamiento_burbuja { // se define la clase

    public static void ordenar(int[] arr) { // recibe el arreglo de los números
        for (int i = 0; i < arr.length - 1; i++) { // primer ciclo que controla las pasadas del ordenamiento, // asignación i=0 (1), comparación (n), incrementos (n)
            for (int j = 0; j < arr.length - 1; j++) { // segundo ciclo que compara los números del arreglo, // asignación j=0 (1), comparación (n), incrementos (n)
                if (arr[j] > arr[j + 1]) { // si el número actual es mayor que el siguiente, //comparación (1)
                    int temp = arr[j]; // se guarda el valor actual en una variable temporal, //asignación (1)
                    arr[j] = arr[j + 1]; // se mueve el siguiente número a la posición actual, //asignación (1)
                    arr[j + 1] = temp; // se coloca el valor guardado en la siguiente posición, //asignación (1)
                }
            }
        }
    }

    public static void main(String[] args) { // método principal donde inicia el programa
        int[] numeros = {5, 3, 8, 1}; // se crea un arreglo desordenado, //asignacion (1)

        ordenar(numeros); // se llama al método para ordenar el arreglo, //llamar al método (1)

        for (int n : numeros) { // ciclo que recorre cada número del arreglo, //recorrido del arreglo (n)
            System.out.print(n + " "); // imprime cada número ordenado en la consola, //impresión (n)
        }
    }
}

/*
Expresión algebraica aproximada de operaciones:

T(n) = n² + 3n + 2

Justificación:
- El ciclo externo depende de n
- El ciclo interno también depende de n
- Al multiplicarse producen n * n = n² operaciones dominantes

Notación asintótica:
O(n²)

Esto significa que entre más números tenga el arreglo, 
más tiempo tarda en ordenarse, porque el programa 
revisa los números muchas veces usando dos ciclos 
uno dentro de otro. Por eso el tiempo aumenta 
aproximadamente n × n (n²).

*/
