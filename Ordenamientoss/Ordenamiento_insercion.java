public class Ordenamiento_Insercion { // se define la clase

    public static void ordenar(int[] arr) { // recibe el arreglo de los números

        for (int i = 1; i < arr.length; i++) { 
            // ciclo que recorre el arreglo desde la segunda posición
            // asignación i=1 (1), comparación (n), incrementos (n)

            int clave = arr[i]; 
            // se guarda el número actual que se quiere insertar en su posición correcta
            // asignación (1)

            int j = i - 1; 
            // índice del elemento anterior para empezar comparaciones
            // asignación (1)

            while (j >= 0 && arr[j] > clave) { 
            // mientras el número anterior sea mayor que la clave
            // comparación (n)

                arr[j + 1] = arr[j]; 
                // se mueve el número una posición hacia la derecha
                // asignación (1)

                j = j - 1; 
                // se retrocede en el arreglo para seguir comparando
                // asignación (1)
            }

            arr[j + 1] = clave; 
            // se coloca la clave en su posición correcta
            // asignación (1)
        }
    }

    public static void main(String[] args) { // método principal donde inicia el programa

        int[] numeros = {5, 3, 8, 1}; 
        // se crea un arreglo desordenado
        // asignación (1)

        ordenar(numeros); 
        // se llama al método para ordenar el arreglo
        // llamada al método (1)

        for (int n : numeros) { 
        // ciclo que recorre cada número del arreglo
        // recorrido del arreglo (n)

            System.out.print(n + " "); 
            // imprime cada número ordenado en la consola
            // impresión (n)
        }
    }
}

/*
Expresión algebraica aproximada de operaciones:

T(n) = n² + 2n + 1

Justificación:
- El ciclo principal depende de n
- El ciclo while puede recorrer hasta n posiciones en el peor caso
- Esto produce aproximadamente n × n operaciones

Notación asintótica:

O(n²)

Esto significa que cuando el arreglo está muy desordenado,
el algoritmo puede tardar más tiempo porque debe mover
muchos elementos hacia la derecha para insertar cada número
en su posición correcta.
*/
