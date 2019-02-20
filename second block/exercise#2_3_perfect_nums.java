import java.util.Random;

public class Main {

    public static void main(String[] args)  {
        Random r = new Random();
        int num = Math.abs(r.nextInt());
        int result = 0;

        for (int divider = 1; divider <= num / 2; divider++){
            if (num % divider == 0){
                result += divider;
                }
            }

        if (result == num){
            System.out.println("Число " + num + " является совершенным.");
        } else {
            System.out.println("Число " + num + " не является совершенным.");
        }
    }
}