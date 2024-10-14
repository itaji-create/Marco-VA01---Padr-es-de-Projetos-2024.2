package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Criando alguns livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("To Kill a Mockingbird", "Harper Lee", 1960);

        // Criando um usuário
        Usuario usuario = new Usuario("João Silva");

        // Criando uma biblioteca e adicionando livros a ela
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Exibindo livros disponíveis
        biblioteca.exibirLivrosDisponiveis();

        // Emprestando um livro para o usuário
        biblioteca.emprestarLivroParaUsuario(livro1, usuario);

        // Exibindo livros disponíveis e livros emprestados após o empréstimo
        biblioteca.exibirLivrosDisponiveis();
        usuario.exibirLivrosEmprestados();

		// Devolvendo o livro para a biblioteca
        biblioteca.receberLivroDeUsuario(livro1, usuario);

        // Exibindo livros disponíveis e livros emprestados após a devolução
        biblioteca.exibirLivrosDisponiveis();
        usuario.exibirLivrosEmprestados();
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
