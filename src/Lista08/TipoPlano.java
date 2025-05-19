package Lista08;

public enum TipoPlano {
    BASICO(20),
    INTERMEDIARIO(30),
    PREMIUM(40);

    private int Plano;


    TipoPlano(int Plano) {
        this.Plano = Plano;
    }

    public int getPlano() {

        return Plano;
    }
}