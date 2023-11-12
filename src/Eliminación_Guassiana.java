public class Eliminación_Guassiana {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, -4, -2, -11},
                {3, -1, 2, 5},
                {2, 3, 2, 12}
        };


        int filas = matriz.length;
        int columnas = matriz[0].length-1;



        for (int i = 0; i<filas; i++) {
            for (int j=0; j<columnas+1; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        for (int j=0; j<columnas+1; j++) {
            matriz[1][j]=matriz[0][j]*-3+matriz[1][j];
            matriz[2][j]=matriz[0][j]*-2+matriz[2][j];
        }


        System.out.println("--------------------------------------");
        for (int i = 0; i<filas; i++) {
            for (int j=0; j<columnas+1; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        for(int j=0; j<columnas+1; j++){
            matriz[2][j]=matriz[1][j]*-1+matriz[2][j];
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i<filas; i++) {
            for (int j=0; j<columnas+1; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

    }

}