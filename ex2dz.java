import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class ex2dz {
    public static void main(String[] args){
        int[] arr = new int[10];
        int minVal = 0;
        int maxVal = 10;
        for (int i = 0; i < arr.length; i++) {
        arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j <= arr.length; j++) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i = 0;}}}
        
        System.out.println(Arrays.toString(arr));
    }
}
