package practices.day6_23;

/**
 * 找质数
 * link: https://www.youtube.com/watch?v=9uMQDLyYTc0&list=PLFbd8KZNbe-8cHN7zAPg8S8zrrx7pF6cZ&index=79
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 23/06/2024 16:22
 * @since JDK11
 */
public class FindPrimeNumber {
    public static void main(String[] args) {
        /*
         需求分析：101～200找出质数
         1. 先判断单个数字是否为质数
         2. 循环101～200 并指出质数
         */

        for (int i = 101; i <= 200; i++) {
            boolean flag = true; // true 代表是质数，false不是质数

            // 判断质数的方法：在2～n-1的范围内，n%任何一个数字=0 就不是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag = true) {
                System.out.println(i + "是质数");
            }

        }
    }
}
