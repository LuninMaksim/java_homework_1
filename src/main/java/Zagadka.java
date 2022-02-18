import java.util.Scanner;

public class Zagadka {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String znak = "";
        long l = 1;
        long r = 2147483648L;
        while (znak.equals(">") | (znak.equals("<")) | znak.equals("")) {
            System.out.print((l+r)/2 + " is that your number?\n");
            System.out.print("Input '>' or '<' or '=': ");
            znak = in.nextLine();
            if (znak.equals(">")) {
                l = (l+r)/2;
            }
            if (znak.equals("<")) {
                r = (l+r)/2;
            }
        }
        in.close();
        if (znak.equals("=")) {
            System.out.print("Here is your number " + (l+r)/2);
        }
    }

}
