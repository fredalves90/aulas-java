package com.fred.Hello.World.models;

public class CadastrarPessoa implements CadastroFuncionario{

    @Override
    public Teste cadastrar(Teste teste) {

        System.out.println("salvando");

        return teste;
    }

    @Override
    public Teste editarCadastro(Teste teste) {
        return null;
    }
}
