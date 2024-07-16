package practices.day6_23;

import java.util.Random;

/**
 * 随机验证码
 * link: https://www.youtube.com/watch?v=1jCvL8GyM1w&list=PLFbd8KZNbe-8cHN7zAPg8S8zrrx7pF6cZ&index=81
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 23/06/2024 21:48
 * @since JDK11
 */
public class RandomVerificationCode {
    public static void main(String[] args) {
        /*
        需求剖析：
        1. 在一个没有规律的数据当中，想抽取随机值 先放到一个数组当中，再获取索引 然后获取索引的对应值
        2. 将大写和小写字符放到一个数组
        3. 将0～9放到一个数组
        4. 抽取4次字符和1次数字
         */

        char[] letters = new char[52];
        for (int i = 0; i < letters.length; i++) {
            if(i<=25) {
                letters[i] = (char) (97 + i);
            }else{
                letters[i] = Character.toUpperCase(letters[i-26]);
            }
        }

        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        Random random = new Random();
        char[] verificationCode = new char[5];
        for (int j = 0; j < 100; j++) {

            System.out.print("随机验证码是：");
            for (int i = 0; i < verificationCode.length; i++) {
                if (i < verificationCode.length - 1) {
                    verificationCode[i] = letters[random.nextInt(51)];
                } else {
                    verificationCode[i] = numbers[random.nextInt(10)];
                }
                System.out.print(verificationCode[i]);
            }
            System.out.println();
        }

    }
}
