package org.example;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Variáveis | Constantes globais
    private static final ContactDAO dao = new ContactDAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Garante que a tabela exista antes de qualquer operação
        Database.createTable();
        System.out.println("Agenda de contatos");
        int opcao = 0;
        while (opcao != 5) {
            showMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1: addContact(); break;
                    case 2: listContacts(); break;
                    case 3: updateContact(); break;
                    case 4: deleteContact(); break;
                    case 5: System.out.println("Encerrando..."); break;
                    default: System.out.println("Opção inválida!"); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número.");
                scanner.nextLine();
            }
        }
    }
    private static void showMenu() {
        System.out.println("""
                --------- AGENDA ---------
                [1] - Adicionar contato
                [2] - Listar contatos
                [3] - Atualizar contatos
                [4] - Remover contato
                [5] - Sair
                """);
    }

    private static void addContact() {
        System.out.println("\n--- Adicionar contato ---");
        System.out.println("Nome: ");
        String name = scanner.nextLine();
        System.out.println("Telefone: ");
        String phone = scanner.nextLine();

        dao.add(new Contact(name, phone));
        System.out.println("Contato salvo com sucesso.");
    }

    private static void listContacts() {
        System.out.println("\n--- Lista de Contatos ---");
        List<Contact> contacts = dao.list();
        if (contacts.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            contacts.forEach(System.out::println);
        }
    }

    private static void updateContact() {
        System.out.println("\n--- Atualizar Contato ---");
        System.out.println("Digite o ID do contato a ser atualizado: ");
        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Novo nome: ");
            String name = scanner.nextLine();
            System.out.println("Novo telefone: ");
            String phone = scanner.nextLine();
            dao.update(new Contact(id, name, phone));
            System.out.println("Contato atualizado com sucesso.");
        } catch (InputMismatchException e) {
            System.out.println("ID inválido. Digite um número.");
            scanner.nextLine();
        }
    }

    private static void deleteContact() {
        System.out.println("\n--- Remover Contato ---");
        System.out.println("Digite o ID do contato a ser removido: ");
        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            dao.delete(id);
            System.out.println("Contato removido com sucesso.");
        } catch (InputMismatchException e) {
            System.out.println("ID inválido. Digite um número.");
            scanner.nextLine();
        }
    }
}