package ifma.lista04;

public class TestDequeList {
    public static void main(String[] args) {
        DequeList deque = new DequeList();
        deque.addFirst(new Node(new Aluno("Dennis", 10, 10)));
        deque.addFirst(new Node(new Aluno("Rebeca", 8, 1.5)));
        deque.addLast(new Node(new Aluno("Renato", 8, 6)));
        System.out.println("Lista de alunos");
        System.out.println(deque);

        System.out.println();
        System.out.println("Get first: ");
        System.out.println(deque.getFirst());

        System.out.println();
        System.out.println("Get last: ");
        System.out.println(deque.getLast());

        System.out.println();
        System.out.println("Remove first:");
        deque.removeFirst();
        System.out.println(deque);

        System.out.println();
        System.out.println("Remove last:");
        deque.removeLast();
        System.out.println(deque);

        System.out.println();
        System.out.println("Remove last:");
        deque.removeLast();
        System.out.println(deque);

        System.out.println();
        System.out.println("Add element on finish:");
        deque.addLast(new Node(new Aluno("Marcos", 7, 7)));
        System.out.println(deque);

        System.out.println();
        System.out.println("Add element on start:");
        deque.addFirst(new Node(new Aluno("Isabele", 9, 8.5)));
        System.out.println(deque);


        System.out.println();
        System.out.println("Search Node with name: Isabele");
        Node node = deque.search("Isabele");
        System.out.println(node);

        System.out.println();
        System.out.println("Search Node with name: Rebeca");
        node = deque.search("Rebeca");
        System.out.println(node);

    }
}
