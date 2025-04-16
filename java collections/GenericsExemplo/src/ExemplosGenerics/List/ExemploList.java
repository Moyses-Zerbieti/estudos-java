package ExemplosGenerics.List;
import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        
        //Exemplo sem o generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(12); //array permite adicionar qualquer tipo de dado


        //exemplo com o generics
        List <String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Moyses");
        listaGenerics.add("Zerbieti");

        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }
    }
}
