package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final ManagerConfig manager = new ManagerConfig("game_config.json");
    private static final Scanner scanner = new Scanner(System.in);
    private static GameSettings settings;

    public static void main(String[] args) {
        settings = manager.load();
        System.out.println("Painel de Configurações de Jogo");

        int option = 0;
        while (option != 6) {
            showMenu();
            try {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        viewSettings();
                        break;

                    case 2:
                        changePlayerName();
                        break;

                    case 3:
                        changeDifficulty();
                        break;

                    case 4:
                        changeAudio();
                        break;

                    case 5:
                        changeResolution();
                        break;

                    case 6:
                        System.out.println("Salvando configurações...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número.");
                scanner.nextLine();
            }
        }
        manager.save(settings);
        System.out.println("~Configurações salvas em 'game_config.json'.");
    }

    private static void showMenu() {
        System.out.println("\n --- MENU DE CONFIGURAÇÕES ---");
        System.out.println("[1] - Ver configurações atuais");
        System.out.println("[2] - Alterar o nome do Jogador");
        System.out.println("[3] - Alterar nível de Dificuldade");
        System.out.println("[4] - Habilitar/Desabilitar Áudio");
        System.out.println("[5] - Trocar resolução");
        System.out.println("[6] - Sair e salvar");
        System.out.println("Escolha uma opção: ");
    }

    private static void viewSettings() {
        System.out.println(settings.toString());
    }

    private static void changePlayerName() {
        System.out.println("Digite o novo nome do jogador: ");
        String newName = scanner.nextLine();
        settings.setPlayerName(newName);
        System.out.println("Nome do jogador alterado para " + newName);
    }

    private static void changeDifficulty() {
        System.out.println("Digite o novo nível de dificuldade (1 = Fácil, 2 = Médio, 3 = Difícil)");
        try {
            int newLevel = scanner.nextInt();
            scanner.nextLine();
            if (newLevel >= 1 && newLevel <= 3) {
                settings.setDifficultyLevel(newLevel);
                System.out.println("Nível de dificuldade alterado para: " + newLevel);
            } else {
                System.out.println("Nível inválido. Use 1, 2 ou 3.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número.");
            scanner.nextLine();
        }
    }

    private static void changeAudio() {
        Boolean currentAudio = settings.isAudioEnabled();
        settings.setAudioEnabled(!currentAudio);
        String newStatus = settings.isAudioEnabled() ? "HABILITADO" : "DESABILITADO";
        System.out.println("Áudio agora está " + newStatus);
    }

    private static void changeResolution() {
        System.out.println("Selecione a nova resolução: ");
        System.out.println("640x480");
        System.out.println("1280x720");
        System.out.println("1920x1080");
        System.out.println("2560x1440");
        System.out.println("3840x2160");
        String newResolution = scanner.nextLine();
        if (newResolution.equals("640x480") || newResolution.equals("1280x720") || newResolution.equals("1920x1080") || newResolution.equals("2560x1440") || newResolution.equals("3840x2160")) {
            settings.setScreenResolution(newResolution);
            System.out.println("Resolução alterada para: " + newResolution);
        } else {
            System.out.println("Digite uma resolução válida.");
        }
    }
}