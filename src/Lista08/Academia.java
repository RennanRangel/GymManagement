package Lista08;
import java.util.ArrayList;
import java.util.List;


   public class Academia {

    private String nome;
    private List<Instrutor> instrutores;
    private List<Aluno> alunos;
    private static final int capacidadeMaxima = 200;


        public Academia(String nome) {
            this.nome = nome;
            this.instrutores = new ArrayList<>();
            this.alunos = new ArrayList<>();
        }

        public void cadastrarAluno(Aluno aluno) {
            if (alunos.size() < capacidadeMaxima) {
                alunos.add(aluno);
            } else {
                System.out.println("Capacidade máxima atingida.");
            }
        }

        public void contratarInstrutor(Instrutor instrutor) {
            instrutores.add(instrutor);
        }

        public Pessoa buscarPessoa(String cpf) {
            for (Aluno aluno : alunos) {
                if (aluno.getCpf().equals(cpf)) {
                    return aluno;
                }
            }
            for (Instrutor instrutor : instrutores) {
                if (instrutor.getCpf().equals(cpf)) {
                    return instrutor;
                }
            }
            return null;
        }

        public Pessoa buscarPessoaPorNome(String nome) {
            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    return aluno;
                }
            }
            for (Instrutor instrutor : instrutores) {
                if (instrutor.getNome().equalsIgnoreCase(nome)) {
                    return instrutor;
                }
            }
            return null;
        }

        public void relatorioAlunosPorPlano() {
            for (TipoPlano plano : TipoPlano.values()) {
                System.out.println("\nPlano " + plano + ":");
                for (Aluno aluno : alunos) {
                    if (aluno.getTipoPlano() == plano) {
                        System.out.println("- " + aluno.getNome());
                    }
                }
            }
        }
    }




