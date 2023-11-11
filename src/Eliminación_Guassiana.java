import java.util.Scanner;

public class Eliminación_Guassiana {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int filas=0;
        int columnas=0;

        System.out.println("Eliminación gaussiana");

        System.out.println("Creación de la matriz");

        System.out.println("Ingresa el número de filas");
        filas=scanner.nextInt();
        System.out.println("Ingresa el número de columnas   (Tiene que ser igual a las filas)");
        columnas=scanner.nextInt();

        if(filas==columnas){
            int[][] matriz=new int[filas][columnas];

            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.println("Ingresa los valores de la matirz [ "+i+" ][ "+j+" ]");
                    matriz[i][j]=scanner.nextInt();
                }
            }


            for(int i=0; i< matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j]+"|");
                }
                System.out.println();
            }


        }else{
            System.out.println("Las filas y columnas tienen que ser iguales");
        }
    }

}