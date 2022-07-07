package org.exercicio2;

import java.util.List;
import java.util.Objects;

public class Agenda {

    private List<Contato> contatos;

    public void AdicionaContato(Contato contato){
        this.contatos.add(contato);
    }

    public Contato BuscaContato (String termoDeBusca){
        Contato resultado = null;
        for (Contato c: this.contatos) {
            if(Objects.equals(c.email, termoDeBusca) || Objects.equals(c.nome, termoDeBusca))
                resultado = c;
        }
        return resultado;
    }

    public void ExcluirContato(String nome){
        Contato resultado = null;
        for (Contato c: this.contatos) {
            if(Objects.equals(c.nome, nome))
                resultado = c;
        }
        if (resultado != null)
            this.contatos.remove(resultado);
    }

    public void ListarContatos (){
        System.out.println(this.contatos.toString());
    }
}
