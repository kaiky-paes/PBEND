package org.example;

public class GameSettings {
    private String playerName;
    private int difficultyLevel;
    private boolean audioEnabled;
    private String screenResolution;

    public GameSettings() {
        this.playerName = "Player1";
        this.difficultyLevel = 2;
        this.audioEnabled = true;
        this.screenResolution = "1280x720";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isAudioEnabled() {
        return audioEnabled;
    }

    public void setAudioEnabled(boolean audioEnabled) {
        this.audioEnabled = audioEnabled;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String toString() {
        String audioStatus = audioEnabled ? "Habilitado" : "Desabilitado";
        return String.format(
                "--- Configurações Atuais ---\n" +
                        "Nome do Jogador: %s\n" +
                        "Nível de Dificuldade: %d\n" +
                        "Áudio: %s\n" +
                        "Resolução da Tela: %s\n" +
                        "-----------------------------",
                playerName, difficultyLevel, audioStatus, screenResolution
        );
    }
}