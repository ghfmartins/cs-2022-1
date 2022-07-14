package org.program3;

public class Login {
    private String usuario;

    private String senha;

    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String user, String senha) throws LoginInvalidoException{
        if(!user.equals(this.usuario))
            throw new LoginInvalidoException("usuário incorreto!");
        if(!senha.equals(this.senha))
            throw new LoginInvalidoException("Senha incorreta!");

        return true;
    }
}
