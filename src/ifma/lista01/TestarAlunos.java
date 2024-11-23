package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos alunos = new CadastrarAlunos(3);

        Aluno aluno2 = new Aluno(02, "01233", "Jessica");
        alunos.adicionarNoFinal(aluno2);

        Aluno aluno3 = new Aluno(03, "01235", "Marcos");
        alunos.adicionarNoInicio(aluno3);

        Aluno aluno1 = new Aluno(01, "01234", "Dennis");
        alunos.adicionarNoInicio(aluno1);



        System.out.println("Antes de ordenar o vetor: ");
        alunos.exibirAlunos();

        System.out.println();

        System.out.println("Depois de ordenar o vetor: ");
        alunos.ordenaVetor();
        alunos.exibirAlunos();

        System.out.println();

        System.out.println("Removendo aluno do final:");
        alunos.removerNoFinal();
        alunos.exibirAlunos();

        System.out.println();
        System.out.println("Removendo aluno do comeco:");
        alunos.removerNoInicio();
        alunos.exibirAlunos();


    }
}
