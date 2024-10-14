package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
    }

    public void exibirLivrosDisponiveis() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Não há livros disponíveis na biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca " + nome + ":");
            for (Livro livro : livrosDisponiveis) {
                livro.exibirInformacoes();
            }
        }
    }

    public void emprestarLivroParaUsuario(Livro livro, Usuario usuario) {
        if (livro != null && livrosDisponiveis.contains(livro)) {
            livrosDisponiveis.remove(livro);
            usuario.emprestarLivro(livro);
            System.out.println("O livro \"" + livro.getTitulo() + "\" foi emprestado para " + usuario.getNome() + ".");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" não está disponível.");
        }
    }

    public void receberLivroDeUsuario(Livro livro, Usuario usuario) {
        if (livro != null && usuario != null) {
            usuario.devolverLivro(livro);
            livrosDisponiveis.add(livro);
            System.out.println("O livro \"" + livro.getTitulo() + "\" foi devolvido por " + usuario.getNome() + ".");
        }
    }

    public String getNome() {
        return nome;
    }
}
