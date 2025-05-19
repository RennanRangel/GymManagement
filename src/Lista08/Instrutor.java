package Lista08;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um instrutor, que também é uma Pessoa
public class Instrutor extends Pessoa {
    private String registro; // Registro profissional do instrutor
    private String especializacao; // Área de especialização do instrutor
    private List<Aluno> alunos = new ArrayList<>(); // Lista de alunos associados ao instrutor

    // Construtor que inicializa os dados do instrutor
    public Instrutor(String nome, String cpf, String dataNascimento, String especializacao) {
        super(nome, cpf, dataNascimento); // Chama o construtor da superclasse Pessoa
        this.especializacao = especializacao;
        this.alunos = new ArrayList<>(); // Inicializa a lista de alunos do instrutor
    }

    // Método para adicionar um aluno à lista de alunos do instrutor
    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) { // Verifica se o aluno não é nulo antes de adicionar
            alunos.add(aluno);
        }
    }

    // Método para listar todos os alunos associados a este instrutor
    public void ListarAluno() {
        if (alunos.isEmpty()) {
            // Mensagem caso o instrutor não tenha alunos associados
            System.out.println("Nenhum aluno registrado.");
        } else {
            // Exibe o nome do instrutor e os nomes dos alunos associados
            System.out.println("Alunos do Instrutor " + getNome() + ":");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        }
    }

    // Métodos getter e setter para o atributo registro
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    // Métodos getter e setter para o atributo especializacao
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    // Método para exibir as informações detalhadas do instrutor
    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Registro: " + registro);
        System.out.println("Especialização: " + especializacao);
    }


}
