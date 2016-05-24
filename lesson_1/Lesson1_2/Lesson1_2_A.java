import static java.lang.System.out;
import java.util.Scanner;

public class Lesson1_2_A {
    public static void main(String...args) {

        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        //String str_a = list[0];
        //String str_b = list[1];

        //int a = Integer.parseInt(str_a);
        //int b = Integer.parseInt(str_b);

        if (a > b) {
            out.println("a > b");
        }
        else if (a < b) {
            out.println("a < b");
        }
        else {
            out.println("a == b");
        }
    }

}
