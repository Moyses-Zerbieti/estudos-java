package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List <Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor))
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List <Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List <Livro> lisvrosPorIntervaloAnos = new ArrayList<>();

        if(!lisvrosPorIntervaloAnos.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    lisvrosPorIntervaloAnos.add(l);
                }
            }
        }
        return lisvrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2009);
        catalogoLivros.adicionarLivro("Livro 1", "autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 2", "autor 2", 2011);
        catalogoLivros.adicionarLivro("Livro 3", "autor 3", 2012);
        catalogoLivros.adicionarLivro("Livro 4", "autor 4", 2005);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2005, 2013));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}