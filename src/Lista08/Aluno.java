package Lista08;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private TipoPlano tipoPlano;
    private List<String> aulasAgendadas;
    private static int totalAlunos = 0;

    public Aluno(String nome, String cpf, String dataNascimento, TipoPlano tipoPlano) {
        super(nome, cpf, dataNascimento);
        this.tipoPlano = tipoPlano;
        this.aulasAgendadas = new ArrayList<>();
        totalAlunos++;
    }

    public List<String> getAulasAgendadas() {
        return aulasAgendadas;
    }

    public void agendarAula(String nomeAula) {
        if (nomeAula != null && !nomeAula.trim().isEmpty()) {
            aulasAgendadas.add(nomeAula);
            System.out.println("Aula \"" + nomeAula + "\" agendada com sucesso.");
        } else {
            System.out.println("Nome da aula inválido.");
        }
    }

    public void cancelarAula(String nomeAula) {
        if (aulasAgendadas.remove(nomeAula)) {
            System.out.println("Aula \"" + nomeAula + "\" cancelada com sucesso.");
        } else {
            System.out.println("Aula \"" + nomeAula + "\" não encontrada.");
        }
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

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
