import java.util.Random;
import java.util.Scanner;

public class ArrayHandling {

    private double[][] arr;
    private double min;
    private double max;
    private int m;
    private int n;


    public ArrayHandling(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы MxN: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Введите минимальное и максимальное значения матрицы: ");
        min = sc.nextDouble();
        max = sc.nextDouble();
        arr = new double[m][n];
        arr = initArray(arr, min, max);
    }

    public ArrayHandling(double[][] arr){
        this.arr = arr;
    }

    private double[][] initArray(double[][] arr, double min, double max){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = min + (max-min)*r.nextDouble();
            }

        }
        return arr;
    }

    public void printOut(){
        int count = 0;
        for (double[] i: arr) {
            System.out.print(count++);
            for (double j: i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    public double findMin(){
        double result = arr[0][0];
        for (double[] i: arr) {
            for(double j: i){
                result = result < j ? result : j;
            }
        }
        return result;
    }

    public double findMax(){
        double result = arr[0][0];
        for (double[] i: arr) {
            for(double j: i){
                result = result > j ? result : j;
            }
        }
        return result;
    }

    public double findArithmeticAverage(){
        double result = 0.0;
        int arrSize = 0;
        for (double[] i: arr) {
            arrSize += i.length;
            for (double j: i) {
                result += j;
            }
        }
        result /= arrSize;
        return result;
    }

    public double findGeometricAverage(){
        double result = 1.0;
        int arrSize = 0;
        for (double[] i: arr) {
            arrSize += i.length;
            for (double j: i) {
                if(j >= 0)
                    result += j;
                else
                    return -1;
            }
        }
        result = Math.pow(result, 1.0 / arrSize);
        return result;
    }

    public int[] findLocalMax(){
        double tempLeft;
        double tempRight;
        double tempUp;
        double tempDown;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if((i == 0 || i == arr.length-1) && (j == 0 || j == arr[i].length-1)){
                    continue;
                }
                tempLeft = j - 1 < 0 ? this.min-1 : arr[i][j-1];
                tempRight = j+1 == arr[i].length ? this.min-1 : arr[i][j+1];
                tempUp = i - 1 < 0 ? this.min-1 : arr[i-1][j];
                tempDown = i+1 == arr.length ? this.min-1 : arr[i+1][j];
                if (arr[i][j] > tempRight && arr[i][j] > tempLeft && arr[i][j] > tempUp && arr[i][j] > tempDown){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] findLocalMin(){
        double tempLeft;
        double tempRight;
        double tempUp;
        double tempDown;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if((i == 0 || i == arr.length-1) && (j == 0 || j == arr[i].length-1)){
                    continue;
                }
                tempLeft = j - 1 < 0 ? this.max+1 : arr[i][j-1];
                tempRight = j+1 == arr[i].length ? this.max+1 : arr[i][j+1];
                tempUp = i - 1 < 0 ? this.max+1 : arr[i-1][j];
                tempDown = i+1 == arr.length ? this.max+1 : arr[i+1][j];
                if (arr[i][j] < tempRight && arr[i][j] < tempLeft && arr[i][j] < tempUp && arr[i][j] < tempDown){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public boolean transposition(){
        if (m == n){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr[i].length; j++) {
                    if (i!= j) {
                        arr[i][j] = arr[i][j] + arr[j][i];
                        arr[j][i] = arr[i][j] - arr[j][i];
                        arr[i][j] = arr[i][j] - arr[j][i];
                    }
                }
            }
            return true;
        }
        return false;
    }
}