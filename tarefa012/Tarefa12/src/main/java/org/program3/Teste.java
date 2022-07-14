package org.program3;

public class Teste {
    public static void main(String[] args) {

        Login login = new Login("Gustavo", "admin");
        try{
            login.fazerLogin("Gustavo", "1234");

            System.out.println("Login realizado com sucesso!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
