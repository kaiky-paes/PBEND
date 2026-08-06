public class Empresa {
    public static void main(String[] args) {
        // Instânciando a classe em objeto
        Gerente gerente = new Gerente("Kate", 7500.0, "Financeiro");
        Desenvolvedor dev = new Desenvolvedor("Kaiky", 5000.0, "Java");

        System.out.println("---- Dados do Gerente ----");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        gerente.trabalhar();
        gerente.aprovarVerba();

        System.out.println("---- Dados do Desenvolvedor ----");
        System.out.println("Nome: " + dev.getNome());
        System.out.println("Salário: R$ " + dev.getSalario());
        dev.trabalhar();
        dev.programar();
    }
}