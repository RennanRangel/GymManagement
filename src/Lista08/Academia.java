package Lista08;
import java.util.ArrayList;
import java.util.List;

// Classe que representa uma academia com alunos e instrutores
public class Academia {

    private String nome; // Nome da academia
    private List<Instrutor> instrutores; // Lista de instrutores contratados
    private List<Aluno> alunos; // Lista de alunos matriculados
    private static final int capacidadeMaxima = 200; // Capacidade máxima de alunos na academia

    // Construtor da classe Academia, inicializa listas de alunos e instrutores
    public Academia(String nome) {
        this.nome = nome;
        this.instrutores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    // Método para cadastrar um aluno na academia, respeitando a capacidade máxima
    public void cadastrarAluno(Aluno aluno) {
        if (alunos.size() < capacidadeMaxima) {
            alunos.add(aluno);
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    // Método para contratar um novo instrutor para a academia
    public void contratarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    // Método para buscar uma pessoa (aluno ou instrutor) pelo CPF
    public Pessoa buscarPessoa(String cpf) {
        // Procura primeiro entre os alunos
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        // Se não encontrar entre os alunos, procura entre os instrutores
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getCpf().equals(cpf)) {
                return instrutor;
            }
        }
        // Retorna null se não encontrar a pessoa
        return null;
    }

    // Método para buscar uma pessoa (aluno ou instrutor) pelo nome (ignora maiúsculas e minúsculas)
    public Pessoa buscarPessoaPorNome(String nome) {
        // Procura primeiro entre os alunos
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        // Se não encontrar entre os alunos, procura entre os instrutores
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getNome().equalsIgnoreCase(nome)) {
                return instrutor;
            }
        }
        // Retorna null se não encontrar a pessoa
        return null;
    }

    // Método para imprimir um relatório de alunos agrupados por tipo de plano

    public void relatorioAlunosPorPlano() {
        // Itera por todos os tipos de plano possíveis
        for (TipoPlano plano : TipoPlano.values()) {
            System.out.println("\nPlano " + plano + ":");
            // Imprime os nomes dos alunos que estão matriculados nesse plano
            for (Aluno aluno : alunos) {
                if (aluno.getTipoPlano() == plano) {
                    System.out.println("- " + aluno.getNome());
                }
            }
        }
    }
}
