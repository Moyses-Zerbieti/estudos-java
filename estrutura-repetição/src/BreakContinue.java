public class BreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <= 15; numero ++){
            if (numero== 10)
                break;
            System.out.println("Parou no número " + numero);
        }
        for (int num = 1; num <= 10; num ++){
            if (num == 8)
                continue;
            System.out.println("Continue a partir do numero " + num);
        }
       
    }
}
