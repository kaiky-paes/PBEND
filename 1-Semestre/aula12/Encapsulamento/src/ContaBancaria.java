public class ContaBancaria {
    // Atributo de classe
    public double saldo;

    // Metodo construtor: inicializa os atributos (mesmo nome da classe)
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial > 0) {
            // this: referencia o atributo da classe
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Metodo da classe
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo " + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Metodo da classe
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Metodo com retorno (sem void)
    // get: serve para visualizar o conteúdo do atributo
    public double getSaldo() {
        return this.saldo;
    }
}
