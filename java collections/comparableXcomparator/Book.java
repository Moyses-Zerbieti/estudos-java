package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable<Book> { 
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Book(String titu, String aut, int ano){
        this.titulo = titu;
        this.autor = aut;
        this.anoPublicacao = ano;
    }

    public int getAno() {
        return this.anoPublicacao;
    }

    static class comparaAno implements Comparator <Book>{
        public int compare(Book l1, Book l2){
        if (l1.getAno() < l2.getAno())
            return -1;
        if (l1.getAno() > l2.getAno())
            return 1;
        else   
            return 0;
        }  
    }
    @Override
    public int compareTo(Book outroLivro){
        return this.titulo.compareTo(outroLivro.titulo);
    }
    @Override
    public String toString(){
        return "Titulo: "+ titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao;
    }
    
    public static void main(String[] args) {
        List <Book> livros = new ArrayList<>();
        livros.add(new Book("Batman", "Cristopher Nolan",2008));
        livros.add(new Book("Pulp Fiction", "Quentin Tarantino", 1996));
        livros.add(new Book("It A coisa","Stephen King", 2017));
        
        Collections.sort(livros);
            System.out.println( "\n Antes da ordenação");
            for (Book livro : livros){
            System.out.println(livro);
        }
        livros.sort(new Book.comparaAno());
        System.out.println("\n Ordenando por ano de publicação");
        for (Book livro : livros){
            System.out.println(livro);
        }
    }
}