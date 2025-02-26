import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        int[] lotteryNumbers = {5, 10, 15, 20, 25, 30}; 
        
        
        int[][] userNumbers = new int[3][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите 6 номеров для игрока " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                userNumbers[i][j] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {
            int matches = Utils.checkMatches(lotteryNumbers, userNumbers[i]);
            System.out.println("Игрок " + (i + 1) + " угадал " + matches + " номеров.");
        }
    }
}

class Utils {
    public static int checkMatches(int[] lotteryNumbers, int[] userNumbers) {
        int matches = 0;
        for (int lotteryNumber : lotteryNumbers) {
            for (int userNumber : userNumbers) {
                if (lotteryNumber == userNumber) {
                    matches++;
                }
            }
        }
        return matches;
    }
}