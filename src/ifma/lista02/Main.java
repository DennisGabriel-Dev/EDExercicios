package ifma.lista02;

public class Main {
    public static void main(String[] args) {
        //q01();
        //q02();
        //q03();
        // q04();
        q05();
    }

    static void q01(){
        int[][] matriz = matriz();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] == matriz[i][i]){
                    matriz[i][j] = 0;
                }
            }
        }

        imprimirMatriz(matriz);
    }

    static void q02(){
        int[][] matriz = matriz();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == (matriz.length - 1 - j)){
                    matriz[i][j] = 0;
                }
            }
        }

        imprimirMatriz(matriz);
    }

    static void q03(){
        int[][] matriz = matriz();
        System.out.print("[");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == (matriz.length - 1 - j)){
                    System.out.print(matriz[i][j] + ",");
                }
            }
        }
        System.out.print("]");
    }

    static void q04(){
        int[][] matriz = matriz();
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == (matriz.length - 1 - j)){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }

    static void q05(){
        String result = "[";
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i >= (matriz.length - 1 - j)){
                    result += matriz[i][j]+", ";
                }
            }
        }

        result += "]";
        System.out.println(result);
    }

    static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matriz(){
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        return matriz;
    }
}
