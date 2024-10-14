package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void exibirLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println(nome + " não possui livros emprestados.");
        } else {
            System.out.println("Livros emprestados por " + nome + ":");
            for (Livro livro : livrosEmprestados) {
                livro.exibirInformacoes();
            }
        }
    }

    public String getNome() {
        return nome;
    }
}
