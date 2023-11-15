import java.util.Scanner;
public class Eliminación_Guassiana {

    public static void muestraMatriz(float matriz[][], int var) {
        for (int i = 0; i < var; i++) {
            for (int j = 0; j < (var + 1); j++) {
                System.out.print(" " + matriz[i][j] + " |");
            }
            System.out.println("");
        }
    }

    public static void pivote(float matriz[][], int piv, int var) {
        float temp = matriz[piv][piv];
        for (int i = 0; i < (var + 1); i++) {
            matriz[piv][i] = matriz[piv][i] / temp;
        }
    }

    static void hacerCeros(float matriz[][], int piv, int var) {
        for (int i = 0; i < var; i++) {
            if (i != piv) {
                float c = matriz[i][piv];
                for (int j = 0; j < (var + 1); j++)
                    matriz[i][j] = ((-1 * c) * matriz[piv][j]) + matriz[i][j];
            }
        }
    }

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int var = 0, piv = 0;
        float matriz[][];

        System.out.println("*ELIMINACIÓN GAUSSIANA*");
        System.out.println("¿Cuántas variables tiene la matriz?");
        var = leer.nextInt();
        matriz = new float[var][var + 1];

        for (int i = 0; i < var; i++) {
            for (int j = 0; j < (var + 1); j++) {
                System.out.println("Ingresa el coeficiente de la posición: A[" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = leer.nextFloat();
            }
        }

        for (int i = 0; i < var; i++) {
            pivote(matriz, piv, var);

            System.out.println("Renglon " + (i + 1) + " dividido por el pivote");
            muestraMatriz(matriz, var);
            System.out.println("");

            System.out.println("********");
            hacerCeros(matriz, piv, var);
            muestraMatriz(matriz, var);
            System.out.println("");
            piv++;
        }

        for (int i = 0; i < var; i++) {
            System.out.println("La variable " + (i + 1) + " es: " + matriz[i][var]);
        }

        leer.close();
    }
}