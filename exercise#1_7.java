import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: а = ");
        a = Integer.parseInt(in.readLine());
        System.out.print("Введите второе число: b = ");
        b = Integer.parseInt(in.readLine());

        changeVar(a, b);

        System.out.println("a =  " + a);
        System.out.println("b =  " + b);

    }

    public static void changeVar(int x, int y){
        a = y;
        b = x;
    }
}
