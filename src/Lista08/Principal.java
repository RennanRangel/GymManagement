package Lista08;

import static Lista08.TipoPlano.*;

public class Principal {
    public static void main(String[] args) {
        Academia academia = new Academia("Academia Senai");

        Instrutor instrutor1 = new Instrutor("Carlos", "12345567","01/08/2002","Musculaçao\n");
        Instrutor instrutor2 = new Instrutor("Ana", "3456865","07/04/2004","Yoga\n");
        Instrutor instrutor3 = new Instrutor("Marcos", "143454243","04/05/2002","Pilates");


        Aluno aluno1 = new Aluno("Rennan","140676","06/12/2003", BASICO);
        Aluno aluno2 = new Aluno("Julia","103043","05/02/2003",INTERMEDIARIO);

        System.out.println("\n");
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        System.out.println("\n");

        instrutor1.exibirInformacoes();
        instrutor2.exibirInformacoes();
        instrutor3.exibirInformacoes();
        System.out.println("\n");
    }

}
