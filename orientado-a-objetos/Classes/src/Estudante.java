public class Estudante {
    
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food) {
        System.out.println(name + " está comendo " + food);
    }

    void drinking(Eat eat) {
        System.out.println(name + " está bebendo " + eat);
    }

    void running() {
        System.out.println(name + " está correndo.");
    }
    
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante();
        estudante1.name = "José";
        estudante1.age = 12;
        estudante1.color = Color.FAIR; 
        estudante1.sex = Sex.MALE;

        Estudante estudante2 = new Estudante();
        estudante2.name = "Sophia";
        estudante2.age = 14;
        estudante2.color= Color.FAIR;
        estudante2.sex = Sex.FEMALE;

        estudante1.running();
        estudante2.drinking(Eat.agua);
    }
} 