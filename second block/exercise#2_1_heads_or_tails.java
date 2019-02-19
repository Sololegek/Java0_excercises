import java.util.Random;

public class Main {

    public static void main(String[] args)  {

        Random r = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000; i++){
            boolean result = r.nextBoolean();
            if (result){
                heads++;
            } else{
                tails++;
            }
        }

        System.out.println("Орёл выпал "+ heads + " раз, а решка - " + tails + ".");
    }
}