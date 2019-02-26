import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayHandling arr = new ArrayHandling();

        arr.printOut();
        System.out.println("Минимальное число в массиве: " + arr.findMin());
        System.out.println("Максимальное число в массиве: " + arr.findMax());
        System.out.println("Среднее арифметическое элементов массива: " + arr.findArithmeticAverage());
        System.out.println("Среднее геометрическое элементов массива: " + arr.findGeometricAverage());
        System.out.println("Положение локального максимума: " + Arrays.toString(arr.findLocalMax()));
        System.out.println("Положение локального минимума: " + Arrays.toString(arr.findLocalMin()));
        if(arr.transposition()) {
            System.out.println("Транспонированная матрица: ");
            arr.printOut();
        } else {
            System.out.println("Ошибка выполнения! Для данной функции размеры матрицы М и N должны быть одинаковы!");
        }
    }
}