import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Это добавлено в ветке dev");

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean soutBool = a < b ? true : false;

            System.out.println(soutBool);

        }
    }
