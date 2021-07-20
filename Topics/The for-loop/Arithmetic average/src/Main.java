import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double av = 0;
        double cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                av += i;
                cnt++;
            }
        }

        System.out.println(av / cnt);
    }
}