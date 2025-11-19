import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class radixSortTesting{

    public static void printIntArray(int[] array){
        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        radixSortFiles files = new radixSortFiles(); // 👈 cambio aquí
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int[] numeros;

        System.out.println("--------------------------------------");
        System.out.println("Programa que lee, ordena y guarda archivos con Radix Sort");
        System.out.println("Escribe el nombre del archivo de números a leer: ");
        fileName = bufer.readLine();

        // Leer números desde archivo
        numeros = files.fileToIntArray(fileName);
        System.out.println("Contenido original: ");
        printIntArray(numeros);

        // Ordenar con Radix Sort
        files.radixSort(numeros);
        System.out.println("Contenido ordenado: ");
        printIntArray(numeros);

        // Guardar en nuevo archivo
        System.out.println("Escribe el nombre del archivo de salida: ");
        fileName = bufer.readLine();
        files.writeIntArrayToFile(fileName, numeros);

        System.out.println("Proceso terminado. El archivo ordenado se guardó en C:\\archivos\\" + fileName);
    }
}