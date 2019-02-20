import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int digit = 0;
        int divider = 1000;
        boolean isUpper = true;

        do {
            System.out.println("Введите целое четырёхзначное число: ");
            num = Integer.parseInt(in.readLine());
        } while (num < 1000 || num > 9999);

        while (isUpper & num > 0) {
            if (digit < num / divider){
                digit = num / divider;
                num = num - digit * divider;
                divider /= 10;
            } else {
                isUpper = false;
            }
        }

        if (isUpper){
            System.out.println("Возрастающая последовательность");
        } else {
            System.out.println("Последовательность невозрастающая");
        }
    }
}
