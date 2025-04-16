package record;
public record Person(String nome, int idade){
    public Person{
    }
    
    public Person (String name){
        this(name, 1);
    }
}


