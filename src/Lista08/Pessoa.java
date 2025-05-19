package Lista08;

// Classe abstrata que representa uma pessoa com nome, CPF e data de nascimento
public abstract class Pessoa {
    private String nome; // Nome da pessoa
    private String cpf; // CPF da pessoa
    private String dataNascimento; // Data de nascimento da pessoa

    // Construtor que inicializa os dados básicos de uma pessoa
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Método getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo cpf
    public String getCpf() {
        return cpf;
    }

    // Método setter para o atributo cpf
    // Ele verifica se o CPF já está definido, mas não valida o formato do CPF corretamente.
    public void setCpf(String cpf) {
        if (this.cpf != null) {
            System.out.println("Erro: CPF já foi definido!");
        } else {
            this.cpf = cpf;
            System.out.println("CPF definido com sucesso.");
        }
    }

    // Método getter para o atributo dataNascimento
    public String getDataNascimento() {
        return dataNascimento;
    }

    // Método setter para o atributo dataNascimento
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método abstrato para exibir as informações da pessoa
    // As subclasses (Aluno, Instrutor) devem implementar esse método
    public abstract void exibirInformacoes();
}
