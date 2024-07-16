package practices.day6_23;

import java.util.concurrent.ForkJoinPool;

/**
 * 数字加密
 * link: https://www.youtube.com/watch?v=4ldKaVLeYVg&list=PLFbd8KZNbe-8cHN7zAPg8S8zrrx7pF6cZ&index=83
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 24/06/2024 20:58
 * @since JDK11
 */
public class Encryption {
    public static void main(String[] args) {
        /*
        需求剖析：
        1。把整数里面的每一位放到数组
        2. 加密
        3. 把数组里面的每一个数字进行拼接，变成加密字符串
         */

        int[] arr = {0,9,10,5};
        // 建议每一个循环干一件事
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] +5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for(int i = 0 , j = arr.length - 1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number);
    }
}
