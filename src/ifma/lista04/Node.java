package ifma.lista04;

public class Node {
    public Aluno aluno;
    public Node next;
    public Node previous;

   Node(Aluno aluno){
       this.aluno = aluno;
   }

   Node(){}

    @Override
    public String toString() {
        return this.aluno.toString();
    }
}
