import java.util.Scanner;

public class Main {
    public static int convertVnd(int num){
        return num * 23000;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        int usd = scanner.nextInt();
        scanner.close();
        System.out.println(convertVnd(usd));
    }
}