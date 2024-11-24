package ifma.lista02;

public class Main {
    public static void main(String[] args) {
        //q01();
        //q02();
        //q03();
        // q04();
        // q05();
        // q06();
        // q07();
        // q08();
        // q09();
        // q10();
        // q11();
        // q12();
        // q13();
        // q14();
        // q15();
        q16();
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

    static void q06(){
        double soma = 0;
        int quantidade = 0;
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i >= (matriz.length - 1 - j)){
                    soma += matriz[i][j];
                    quantidade++;
                }
            }
        }

        double resultado = soma / quantidade;

        System.out.printf("%.1f \n", resultado);
    }

    static void q07(){
        String result = "[";
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i > (matriz.length - 1 - j)){
                    result += matriz[i][j]+", ";
                }
            }
        }

        result += "]";
        System.out.println(result);
    }

    static void q08(){
        int[][] matriz = matriz();
        int max = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i >= (matriz.length - 1 - j) && (matriz[i][j] > max)){
                     max = matriz[i][j];
                }
            }
        }

        System.out.println(max);
    }

    static void q09(){
        String result = "[";
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i <= (matriz.length - 1 - j)){
                    result += matriz[i][j]+", ";
                }
            }
        }

        result += "]";
        System.out.println(result);
    }

    static void q10(){
        int[][] matriz = matriz();
        int[] numbers = new int[12];
        int sizeNumbers = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i <= (matriz.length - 1 - j)){
                    numbers[sizeNumbers] = matriz[i][j];
                    sizeNumbers++;
                }
            }
        }

        int min = numbers[0];
        for (int i = 0; i < sizeNumbers; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println(min);
    }

    static void q11(){
        String result = "[";
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i < (matriz.length - 1 - j)){
                    result += matriz[i][j]+", ";
                }
            }
        }

        result += "]";
        System.out.println(result);
    }

    static void q12(){
        int produto = 1;
        int[][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i < (matriz.length - 1 - j)){
                    produto *= matriz[i][j];
                }
            }
        }

        System.out.println(produto);
    }

    static void q13(){
        int[][] matriz = matriz();
        int[][] matrizB = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] % 2 == 0){
                    matrizB[i][j] = (int) Math.pow(matriz[i][j], 2);
                } else {
                    matrizB[i][j] = (int) Math.pow(matriz[i][j], 3);
                }
            }
        }

        imprimirMatriz(matrizB);
    }

    static void q14(){
        int[][] matriz = matriz();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0 ; j--) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void q15(){
        int[][] matriz = matriz();

        for (int i = matriz.length -1; i >= 0; i--) {
            for (int j = matriz.length - 1; j >= 0 ; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void q16(){
        int[][] matriz = matriz();

        for (int i = matriz.length -1; i >= 0; i--) {
            for (int j = 0; j <  matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
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
