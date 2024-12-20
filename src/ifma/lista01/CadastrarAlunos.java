package ifma.lista01;

public class CadastrarAlunos {
    private Aluno[] alunos;
    private int size;
    private int maxSize;

    public CadastrarAlunos(int tamanhoVetor){
        alunos = new Aluno[tamanhoVetor];
        size = 0;
        maxSize = tamanhoVetor;
    }

    public void adicionarNoFinal(Aluno aluno){
        if(size == maxSize){
            throw new RuntimeException("O vetor está cheio!!");
        }
        alunos[size] = aluno;
        size++;
    }

    public void adicionarNoInicio(Aluno aluno){
        if(size == maxSize) {
            throw new RuntimeException("O vetor está cheio!!");
        }
        Aluno[] aux = new Aluno[maxSize];
        aux[0] = aluno;
        for (int i = 0; i < size; i++) {
            aux[i + 1] = alunos[i];
        }
        alunos = aux;
        size++;
    }

    public void removerNoInicio(){
        if(size == 0){
            throw new RuntimeException("Vetor vazio!");
        }
        Aluno[] aux = new Aluno[maxSize];
        alunos[0] = null;
        for (int i = 1; i < size; i++) {
            aux[i - 1] = alunos[i];
        }
        alunos = aux;
        size--;
    }

    public void removerNoFinal(){
        if(size == 0){
            throw new RuntimeException("Vetor vazio!");
        }
        alunos[size - 1] = null;
        size--;
    }

    public boolean verificaIndice(int indice){
        if(alunos[indice] == null || indice < 0 || indice >= size){
            return false;
        }
        return true;
    }

    public String removerComIndice(int indice){
        if(verificaIndice(indice)){
           String nomeAluno = alunos[indice].getNome();
           if(indice == size){
               removerNoFinal();
           } else if (indice == 0){
               removerNoInicio();
           } else {
               alunos[indice] = null;
               for (int i = indice; i < size; i++) {
                   if(i + 1 != size){
                    alunos[i] = alunos[i + 1];
                   } else if (i + 1 == size) {
                       alunos[i] = null;
                   }
               }
               size--;
           }
           return nomeAluno;
        }
        throw new RuntimeException("Aluno não foi encontrado!");
    }

    public void ordenaVetor(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(alunos[j].getCodigo() > alunos[i].getCodigo()){
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[i];
                    alunos[i] = temp;
                }
            }
        }
    }

    public void exibirAlunos(){
        for (int i = 0; i < size; i++) {
            System.out.println(alunos[i]);
        }
    }

}
