package Lista08;

public enum TipoPlano {
    // Enum que representa os diferentes tipos de plano disponíveis para os alunos
        BASICO(20),          // Plano básico com valor mensal de 20
        INTERMEDIARIO(30),   // Plano intermediário com valor mensal de 30
        PREMIUM(40);         // Plano premium com valor mensal de 40

        // Atributo para armazenar o valor mensal do plano
        private int valorPlano;

        // Construtor do enum, que recebe o valor do plano
        TipoPlano(int valorPlano) {
            this.valorPlano = valorPlano;
        }

        // Método getter para retornar o valor do plano
        public int getValorPlano() {
            return valorPlano;
        }
    }

