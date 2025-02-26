import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
        }
        System.out.println("Исходник:");
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println("Итоговый:");
        System.out.println(Arrays.toString(arr));
    }
}