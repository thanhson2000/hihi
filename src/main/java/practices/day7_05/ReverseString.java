package practices.day7_05;

import java.util.Scanner;

/**
 * 反转字符串
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 05/07/2024 20:23
 * @since JDK11
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        StringBuffer stB = new StringBuffer(st);
        String result = stB.reverse().toString();
        String[] split = result.split(",",2);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
