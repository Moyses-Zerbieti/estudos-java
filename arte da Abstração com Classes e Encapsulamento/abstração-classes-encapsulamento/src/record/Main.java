package record;

public class Main{
    public static void main(String[] args) {
        var person = new Person("Moyses ");
        System.out.println(person);
        System.out.println(person.nome() + person.idade() );

    }
}
