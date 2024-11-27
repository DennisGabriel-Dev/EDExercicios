package ifma.lista04;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "(" + nome + ", "+ nota1 + ", "+  nota2 + ")";
    }
}
