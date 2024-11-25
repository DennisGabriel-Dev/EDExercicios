package ifma.lista03;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList() {
        head = null;
        tail = null;
        size = 0;
    }

    void adicionarInicio(int valor) {
        Node novo = new Node(valor);
        Node aux = head;
        head = novo;
        head.next = aux;

        if(size == 0) {
            tail = novo;
        }
        size++;
    }

    void adicionarFim(int valor) {
        if (head == null) {
            adicionarInicio(valor);
        }
        else {
            Node novoTail = new Node(valor);
            novoTail.next = null;
            tail.next = novoTail;
            tail = novoTail;
            size++;
        }
    }

    int removerComeco(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node aux = head;
        head = head.next;
        size--;
        return aux.element;
    }

    int removerFinal(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node atual = head;

        while (atual.next != tail) {
            atual = atual.next;

        }
        int aux = tail.element;
        tail = atual;
        tail.next = null;
        size--;

        return aux;
    }



    boolean isEmpty(){
        return size == 0;
    }

    int menorValor(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node atual = head;
        int min = atual.element;
        for (int i = 0; i < size; i++) {
            if(min > atual.element){
                min = atual.element;
            }
            atual = atual.next;
        }

        return min;
    }

    double media(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node atual = head;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += atual.element;
            atual = atual.next;
        }

        double media = (double) sum / (double) size;
        return media;
    }



    int maiorValor(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node atual = head;
        int max = atual.element;
        for (int i = 0; i < size; i++) {
            if(max < atual.element){
                max = atual.element;
            }
            atual = atual.next;
        }

        return max;
    }

    @Override
    public String toString() {
       if(size == 0){
           return "[]";
       }

       Node atual = head;

       StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(atual.element);
            sb.append(", ");
            if(atual.next != null){
                atual = atual.next;
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
