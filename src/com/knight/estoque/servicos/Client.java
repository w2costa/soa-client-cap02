package com.knight.estoque.servicos;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ListagemLivrosService listagemLivrosService =
            new ListagemLivrosService(Client.class.getResource("/livros.wsdl"));

        //Obtém um proxy
        ListagemLivros listagemLivros = listagemLivrosService.getListagemLivrosPort();

        //Executa o método remoto
        List<Livro> livros = listagemLivros.listarLivrosPaginacao(0, 2);;
        for (Livro livro : livros) {
            System.out.println("Nome: " + livro.getNome());
        }
    }
}
