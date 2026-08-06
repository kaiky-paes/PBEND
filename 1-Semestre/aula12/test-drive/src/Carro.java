public class Carro {
    // Atributos PRIVADOS. Só podem ser acessados pelos metodos desta classe.
    private boolean ligado;
    private int velocidade;
    private int marcha;

    // Construtor: é chamado quando um novo objeto Carro é criado
    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0; // Ponto morto
        System.out.println("Um novo carro foi criado, está desligado e parado.");
    }

    // --- METODOS PÚBLICOS (A "INTERFACE" DE CONTROLE) ---

    // Metodo público para ligar o carro, controlando a regra de negócio
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // A velocidade só pode ser alterada se o carro estiver ligado
    public void acelerar(int aumento) {
        if (ligado && aumento > 0) {
            this.velocidade += aumento;
            System.out.println("Vrumm! Velocidade autal: " + this.velocidade + " km/h");
            atualizarMarcha(); // O próprio carro decide quando atualizar a marcha
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado ou o valor é inválido");
        }
    }

    // Desacelerar também tem regras
    public void frear(int reducao) {
        if (ligado && reducao > 0) {
            this.velocidade -= reducao;
            if (this.velocidade < 0) {
                this.velocidade = 0; // Não permite velocidade negativa
            }
            System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
            atualizarMarcha();
        }
    }

    // Metodo privado auxiliar. Só o próprio carro usa, ninguém de fora pode chamar.
    private void atualizarMarcha() {
        if (this.velocidade == 0) this.marcha = 0; // Ponto morto
        else if (this.velocidade < 20) this.marcha = 1;
        else if (this.velocidade < 40) this.marcha = 2;
        else this.marcha = 3;
        System.out.println("--> Marcha atual: " + this.marcha);
    }

    // Metodo público para "ler" a velocidade (getter)
    public int getVelocidade() {
        return this.velocidade;
    }

    public boolean isLigado() {
        return this.ligado;
    }
}
