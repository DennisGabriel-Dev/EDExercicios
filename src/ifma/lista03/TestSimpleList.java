package ifma.lista03;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.adicionarInicio(1);
        list.adicionarInicio(2);
        list.adicionarInicio(3);
        list.adicionarFim(4);
        list.adicionarInicio(5);
        System.out.println(list);

        int element = 0;
        element = list.removerFinal();
        System.out.println("Elemento Removido do Final: " + element);
        System.out.println(list);

        element = list.removerComeco();
        System.out.println("Elemento Removido do Começo: " + element);
        System.out.println(list);


        element = list.removerFinal();
        System.out.println("Elemento Removido do Final: " + element);
        System.out.println(list);

        list.adicionarFim(6);
        System.out.println(list);

        int maiorValor = list.maiorValor();
        System.out.println("Maior Valor: " + maiorValor);

        int menorValor = list.menorValor();
        System.out.println("Menor Valor: " + menorValor);

        double mediaElementos = list.media();
        System.out.printf("Media Elementos: %.2f \n", mediaElementos);
    }
}
