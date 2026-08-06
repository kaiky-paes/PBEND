import java.util.Scanner;

class Funcionario {
    private String nome;
    protected double salarioBase; // protected permite que os filhos acessem diretamente

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000.0;
    }
}

class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 0.10); // 10% de comissão
    }
}

class FolhaPagamento {
    public void imprimirContracheque(Funcionario f) {
        System.out.println("\n========== CONTRACHEQUE ==========");
        System.out.println("Colaborador: " + f.getNome());
        System.out.println("Cargo: " + f.getClass().getSimpleName()); // Pega o nome da classe
        System.out.println("Total a receber: R$ %.2f\n" + f.calcularSalario());
        System.out.println("====================================");
    }
}

public class SistemaRH {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FolhaPagamento rh = new FolhaPagamento();

        System.out.println("SISTEMA DE GESTÃO DE PESSOAS");
        System.out.println("Nome do colaborador: ");
        String nome = leitor.nextLine();

        System.out.println("Salário base: R$ ");
        double salario = leitor.nextDouble();

        System.out.println("\nSelecione o cargo:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        int opcao = leitor.nextInt();

        Funcionario colaborador = null;

        if (opcao == 1) {
            colaborador = new Gerente(nome, salario);
        } else if (opcao == 2) {
            System.out.println("Informe o total de vendas do m");
            double vendas = leitor.nextDouble();
            colaborador = new Vendedor(nome, salario, vendas);
        }
        if (colaborador != null) {
            rh.imprimirContracheque(colaborador);
        } else {
            System.out.println("Erro: Cargo inválido.");
        }

        leitor.close();
    }
}