package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos alunos = new CadastrarAlunos(5);

        Aluno aluno5 = new Aluno(07, "01238", "Gabriel");
        alunos.adicionarNoFinal(aluno5);

        Aluno aluno2 = new Aluno(02, "01233", "Jessica");
        alunos.adicionarNoFinal(aluno2);

        Aluno aluno3 = new Aluno(03, "01235", "Marcos");
        alunos.adicionarNoInicio(aluno3);

        Aluno aluno1 = new Aluno(01, "01234", "Dennis");
        alunos.adicionarNoInicio(aluno1);

        Aluno aluno4 = new Aluno(04, "01237", "Laura");
        alunos.adicionarNoInicio(aluno4);

        System.out.println("Antes de ordenar o vetor: ");
        alunos.exibirAlunos();

        System.out.println();

        System.out.println("Depois de ordenar o vetor: ");
        alunos.ordenaVetor();
        alunos.exibirAlunos();

        System.out.println();
        int indice = 2;
        System.out.println("Removendo aluno do indíce: " + indice);
        String nomeAlunoRemovido = alunos.removerComIndice(indice);
        System.out.println("Aluno " + nomeAlunoRemovido + " removido!");
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
