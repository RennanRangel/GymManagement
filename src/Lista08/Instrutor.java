package Lista08;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {
    private String registro;
    private String especializacao;
    private List<Aluno> alunos = new ArrayList<>();


    public Instrutor(String nome, String cpf, String dataNascimento, String especializacao) {
        super(nome, cpf, dataNascimento);
        this.especializacao = especializacao;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null){
            alunos.add(aluno);
        }

    }

    public void ListarAluno() {
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno registrado.");
        } else {
            System.out.println("Aluno do Instrutor" + getNome());
            for (Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Registro: " + registro);
        System.out.println("Especialização: " + especializacao);
    }
}