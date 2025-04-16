import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {
        List <User> users = List.of(
        new User("Maria", 21), 
        new User("João", 32), 
        new User("Eduardo",40));
    
        users.forEach(user -> System.out.println(user.name() + " - " + user.age()));     
    }
}    
    

