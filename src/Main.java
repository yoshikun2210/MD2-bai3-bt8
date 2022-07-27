import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Rikkei Academy";
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.printf(count == 1 ? "There is %d character '%c' %s" : "There are %d characters '%c' %s", count, c, "in the string");
    }
}