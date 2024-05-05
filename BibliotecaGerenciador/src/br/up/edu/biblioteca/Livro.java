package br.up.edu.biblioteca;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    //Declarando as variaveis da classe
    private String titulo;
    private  static  int proximoId = 1;
    private int id;
    private int anoPublicacao;

    private int numExemplares;

    private Autor autor;

    private Genero genero;
    private Editora editora;
    //Constructor
    public Livro(String titulo, int id, int anoPublicacao, int numExemplares, Autor autor, Genero genero, Editora editora) {
        this.titulo = titulo;
        //deixando automatico o id do livro
        this.id = proximoId++;
        this.anoPublicacao = anoPublicacao;
        this.numExemplares = numExemplares;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
    }
    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public static Livro adicionarLivro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Título do Livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Informe o Ano de Publicacao do Livro: ");
        int anoPublicacao = scanner.nextInt();

        System.out.println("Informe o Numero de Exemplares que a Biblioteca Possui: ");
        int  numExemplares = scanner.nextInt();

        System.out.println("Digite o nome do autor do livro:");
        String nomeAutor = scanner.nextLine();
        Autor autor = new Autor(nomeAutor);

        System.out.println("Digite o gênero do livro:");
        String nomeGenero = scanner.nextLine();
        Genero genero = new Genero(nomeGenero);

        System.out.println("Digite o nome da editora do livro:");
        String nomeEditora = scanner.nextLine();
        Editora editora = new Editora(nomeEditora);

        //falta terminar
        Livro novoLivro = new Livro();

        novoLivro.setTitulo(titulo);
        novoLivro.setAnoPublicacao(anoPublicacao);
        novoLivro.setNumExemplares(numExemplares);
        novoLivro.setAutor();

    }


}