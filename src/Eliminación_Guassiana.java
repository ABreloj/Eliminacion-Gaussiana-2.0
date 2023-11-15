import java.util.Scanner;
public class Eliminación_Guassiana {

    public static void muestraMatriz(int matriz[][], int numValores) {
        for (int i = 0; i < numValores; i++) {
            for (int j = 0; j < (numValores + 1); j++) {
                System.out.print(" " + matriz[i][j] + " |");
            }
            System.out.println("");
        }
    }

    public static void pivote(int matriz[][], int piv, int numValores) {
        int valorPiv = matriz[piv][piv];
        if (valorPiv != 0) {
            for (int i = 0; i < (numValores + 1); i++) {
                matriz[piv][i] = matriz[piv][i] / valorPiv;
            }
        } else {
            System.out.println("No se puede realizar la eliminación gaussiana.");
            System.exit(0);
        }
    }

    static void hacerCeros(int matriz[][], int piv, int numValores) {
        for (int i = 0; i < numValores; i++) {
            if (i != piv) {
                int c = matriz[i][piv];
                for (int j = 0; j < (numValores + 1); j++) {
                    matriz[i][j] = ((-1 * c) * matriz[piv][j]) + matriz[i][j];
                }
            }
        }
    }

    public static void main(String args[]) {
        try (Scanner leer = new Scanner(System.in)) {
            int piv = 0, nColumnas, nFilas;
            int matriz[][];
            // Entrada de filas y columnas de la matriz
            System.out.println("*ELIMINACIÓN GAUSSIANA*");
            System.out.println("Escribe el total de filas: ");
            nFilas = leer.nextInt();
            System.out.println("Escribe el total de columnas: ");
            nColumnas = leer.nextInt();
            matriz = new int[nFilas][nColumnas + 1];

            // Entrada de datos de la matriz
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < (nColumnas + 1); j++) {
                    System.out.printf("Ingresa el coeficiente de la posición: A[%d][%d]: ", (i + 1), (j + 1));
                    matriz[i][j] = leer.nextInt();
                }
            }

            // Eliminación Gaussiana convirtiendolo en ceros y unos
            for (int i = 0; i < nFilas; i++) {
                pivote(matriz, piv, nFilas);

                System.out.println("Renglon " + (i + 1) + " dividido por el pivote");
                muestraMatriz(matriz, nFilas);
                System.out.println("");

                System.out.println("********");
                hacerCeros(matriz, piv, nFilas);
                muestraMatriz(matriz, nFilas);
                System.out.println("");
                piv++;
            }

            // Resultado final de la eliminación gaussiana
            System.out.println("Resultados Finales:");
            for (int i = 0; i < nFilas; i++) {
                System.out.println("El resultado de la matriz " + (i + 1) + " es: " + matriz[i][nColumnas]);
            }
        }
    }
}