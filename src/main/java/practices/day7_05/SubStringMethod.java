package practices.day7_05;

import java.util.Scanner;

/**
 * subString
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 05/07/2024 20:40
 * @since JDK11
 */
public class SubStringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String substring = input.substring(3, 8);
        System.out.println(substring);
    }
}
