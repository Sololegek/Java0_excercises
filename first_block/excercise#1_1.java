import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите три числа: а = ");
        double a = Double.parseDouble(in.readLine());
        System.out.print("b = ");
        double b = Double.parseDouble(in.readLine());
        System.out.print("c = ");
        double c = Double.parseDouble(in.readLine());

        if (a == b && b == c){
            System.out.println("Все переменные одинаковы!");
        } else if (a != b && b!= c && a != c){
            System.out.println("Все переменные разные!");
        } else {
            System.out.println("Переменные частично различаются...");
        }
    }   
}
