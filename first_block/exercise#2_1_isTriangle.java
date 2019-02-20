import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите координаты для первой точки: ");
        System.out.println("х = ");
        int x1 = Integer.parseInt(in.readLine());
        System.out.println("y = ");
        int y1 = Integer.parseInt(in.readLine());
        System.out.println("Введите координаты для второй точки: ");
        System.out.println("х = ");
        int x2 = Integer.parseInt(in.readLine());
        System.out.println("y = ");
        int y2 = Integer.parseInt(in.readLine());
        System.out.println("Введите координаты для третьей точки: ");
        System.out.println("х = ");
        int x3 = Integer.parseInt(in.readLine());
        System.out.println("y = ");
        int y3 = Integer.parseInt(in.readLine());

        double length1 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        double length2 = Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2);
        double length3 = Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2);

        if (length1 + length2 == length3 || length1 + length3 == length2 || length2 + length3 == length1){
            System.out.println("Это прямоугольный треугольник");
        } else if (Math.pow(length1, 1.0/2.0) + Math.pow(length2, 1.0/2.0) == Math.pow(length3, 1.0/2.0) ||
                Math.pow(length3, 1.0/2.0) + Math.pow(length2, 1.0/2.0) == Math.pow(length1, 1.0/2.0) ||
                Math.pow(length1, 1.0/2.0) + Math.pow(length3, 1.0/2.0) == Math.pow(length2, 1.0/2.0)){
            System.out.println("Это не треугольник, а прямая линия");
        } else {
            System.out.println("Это непрямоугольный треугольник");
            }
    }
}

