package Lista08;
import java.util.ArrayList;
import java.util.List;

// Classe que representa um aluno, que é um tipo de Pessoa
public class Aluno extends Pessoa {
    private String matricula; // Número de matrícula do aluno
    private TipoPlano tipoPlano; // Tipo de plano do aluno (enum)
    private List<String> aulasAgendadas; // Lista de aulas agendadas pelo aluno
    private static int totalAlunos = 0; // Contador estático para rastrear o número total de alunos

    // Construtor que inicializa os dados básicos do aluno e incrementa o total de alunos
    public Aluno(String nome, String cpf, String dataNascimento, TipoPlano tipoPlano) {
        super(nome, cpf, dataNascimento); // Chama o construtor da superclasse Pessoa
        this.tipoPlano = tipoPlano;
        this.aulasAgendadas = new ArrayList<>();
        totalAlunos++;
    }

    // Retorna a lista de aulas agendadas pelo aluno
    public List<String> getAulasAgendadas() {
        return aulasAgendadas;
    }

    // Agenda uma nova aula para o aluno, validando o nome da aula
    public void agendarAula(String nomeAula) {
        if (nomeAula != null && !nomeAula.trim().isEmpty()) { // Verifica se o nome é válido
            aulasAgendadas.add(nomeAula);
            System.out.println("Aula \"" + nomeAula + "\" agendada com sucesso.");
        } else {
            System.out.println("Nome da aula inválido.");
        }
    }

    // Cancela uma aula previamente agendada, caso ela exista na lista
    public void cancelarAula(String nomeAula) {
        if (aulasAgendadas.remove(nomeAula)) {
            System.out.println("Aula \"" + nomeAula + "\" cancelada com sucesso.");
        } else {
            System.out.println("Aula \"" + nomeAula + "\" não encontrada.");
        }
    }

    // Retorna a matrícula do aluno
    public String getMatricula() {
        return matricula;
    }

    // Define a matrícula do aluno
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Retorna o tipo de plano do aluno
    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    // Define o tipo de plano do aluno
    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    // Retorna o total de alunos cadastrados (valor estático)
    public static int getTotalAlunos() {
        return totalAlunos;
    }

    // Sobrescreve o método exibirInformacoes da classe Pessoa para incluir dados específicos do aluno
    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Plano: " + tipoPlano);
        System.out.println("Aulas Agendadas: " + aulasAgendadas);
        System.out.println("Total de Alunos: " + totalAlunos);
    }
}
