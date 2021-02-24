
import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
    System.out.println("ois");

    Scanner scanner = new Scanner(System.in);

    double v = scanner.nextInt();

    double a = ( Math.pow(6.684 *10, -11 ) * Math.pow(5972*10,24) )/ (Math.pow(6.371, 6) + v)*(Math.pow(6.371, 6) + v);


        System.out.println(v);
        System.out.println(a);

    }
}