package ifma.lista04;

public class DequeList {
    Node head;
    Node trailer;
    int size;

    public DequeList() {
        head = new Node();
        trailer = new Node();
        size = 0;
    }

    void addLast(Node node){
        if(size == 0){
            addFirst(node);
        } else{
            Node currentLastElement = trailer.previous;
            currentLastElement.next = node;
            trailer.previous = node;
            size++;
        }
    }

    void addFirst(Node node){
        if(size == 0){
            head.next = node;
            trailer.previous = node;
        } else {
            Node temp = head.next;
            head.next = node;
            node.next = temp;
        }
        size++;
    }

    Node getFirst(){
        if(size == 0){
            throw new RuntimeException("Lista vazia");
        }
        return head.next;
    }

    Node getLast(){
        if(size == 0){
            throw new RuntimeException("Lista vazia");
        }
        return trailer.previous;
    }

    Node removeFirst(){
        Node currentFirst = getFirst();
        if(currentFirst == null){
            head.next = trailer;
        }
        else{
            head.next = currentFirst.next;
            size--;
        }

        return currentFirst;
    }

    Node removeLast(){
        if(size <= 1){
            return removeFirst();
        }
        Node currentLast = getLast();
        trailer.previous = currentLast.previous;
        size--;

        return currentLast;
    }

    Node search(String name){
        Node current = getFirst();

        for (int i = 0; i < size; i++) {
            if(current.aluno.nome.equals(name)){
                return current;
            }
            current = current.next;
        }

        throw new RuntimeException("Aluno " + name +  " não foi encontrado");
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }

        Node atual = head.next;

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(atual.aluno.toString());
            sb.append(", ");
            if(atual.next != null){
                atual = atual.next;
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
