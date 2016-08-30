package tabelas;

public class Login {

    private int codigo_login_usuarios;
    private int codigo_usuarios;
    private int codigo_nivel_usuarios;
    private String login_usuarios;
    private String senha_usuarios;

    public int getCodigo_login_usuarios() {
        return codigo_login_usuarios;
    }

    public void setCodigo_login_usuarios(int codigo_login_usuarios) {
        this.codigo_login_usuarios = codigo_login_usuarios;
    }

    public int getCodigo_usuarios() {
        return codigo_usuarios;
    }

    public void setCodigo_usuarios(int codigo_usuarios) {
        this.codigo_usuarios = codigo_usuarios;
    }

    public int getCodigo_nivel_usuarios() {
        return codigo_nivel_usuarios;
    }

    public void setCodigo_nivel_usuarios(int codigo_nivel_usuarios) {
        this.codigo_nivel_usuarios = codigo_nivel_usuarios;
    }

    public String getLogin_usuarios() {
        return login_usuarios;
    }

    public void setLogin_usuarios(String login_usuarios) {
        this.login_usuarios = login_usuarios;
    }

    public String getSenha_usuarios() {
        return senha_usuarios;
    }

    public void setSenha_usuarios(String senha_usuarios) {
        this.senha_usuarios = senha_usuarios;
    }

}
