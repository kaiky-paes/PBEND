public class Usuario {
    private String nomeDeUsuario;
    private String email;

    public Usuario(String nomeDeUsuario, String email) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
    }

    public String getNomeDeUsuario() {
        return this.nomeDeUsuario;
    }

    public String getEmail() {
        return this.email;
    }
}