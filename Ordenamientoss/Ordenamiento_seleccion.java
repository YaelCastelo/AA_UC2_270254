public class Ordenamiento_seleccion { // se define la clase

    public static void ordenar(int[] arr) { // recibe el arreglo de números
        for (int i = 0; i < arr.length - 1; i++) { // ciclo que controla la posición actual del arreglo
            int min = i; // se asume que el elemento actual es el menor, //asignación (1)

            for (int j = i + 1; j < arr.length; j++) { // ciclo que busca el número más pequeño en el resto del arreglo
                if (arr[j] < arr[min]) { // comparación para encontrar el menor valor, //comparación (1)
                    min = j; // se actualiza la posición del número más pequeño, //asignación (1)
                }
            }

            int temp = arr[i]; // guarda el valor actual en una variable temporal, //asignación (1)
            arr[i] = arr[min]; // coloca el menor valor encontrado en la posición actual, //asignación (1)
            arr[min] = temp; // coloca el valor anterior en la posición del menor, //asignación (1)
        }
    }

    public static void main(String[] args) { // método principal donde inicia el programa
        int[] numeros = {5, 3, 8, 1}; // se crea un arreglo desordenado, //asignación (1)

        ordenar(numeros); // se llama al método para ordenar el arreglo, //llamada al método (1)

        for (int n : numeros) { // ciclo que recorre cada número del arreglo, //recorrido del arreglo (n)
            System.out.print(n + " "); // imprime cada número ordenado en la consola, //impresión (n)
        }
    }
}

/*
Expresión algebraica aproximada de operaciones:

T(n) = n² + 2n + 1

Justificación:
- El ciclo externo depende de n
- El ciclo interno también depende de n
- Se comparan los elementos restantes para encontrar el menor
- Las comparaciones dominan el número de operaciones

Notación asintótica:
O(n²)

Esto significa que el algoritmo revisa varias veces los números
para encontrar el menor y colocarlo en su posición correcta.
Como usa dos ciclos anidados, el tiempo de ejecución crece
aproximadamente como n × n (n²) cuando aumenta el tamaño
del arreglo.
*/
