package practices.day6_23;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.zip.CheckedOutputStream;

/**
 * 评委打分
 * link : https://www.youtube.com/watch?v=Gvll5UG4sA4&list=PLFbd8KZNbe-8cHN7zAPg8S8zrrx7pF6cZ&index=82
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 23/06/2024 22:27
 * @since JDK11
 */
public class JudgeScore {
    public static void main(String[] args) {
        /*
        需求剖析：
        1. 创建一个数组长度是6，元素是0～100的随机值
        2. 去掉min,max
        3. 计算另4个分数的平均值
         */

        int[] scores = new int[6];
        Random random =new Random();
        System.out.print("6个分数是：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(0,100);
            System.out.print(scores[i]+" ");
        }
        int min = Arrays.stream(scores).min().getAsInt();

        int max = Arrays.stream(scores).max().getAsInt();

        int[] extract = new int[4];
        int index = 0 ;
        System.out.println();
        System.out.println("抽取后的数组：");
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] != min && scores[i] != max){
               extract[index]  = scores[i];
                System.out.print(extract[index]+" ");
               index++;
            }
        }

        System.out.println();
        int a = 0 ;
        int sum = 0;
        for (int i = 0; i < extract.length; i++) {
            if(extract[i] !=0){
                a++;
                sum += extract[i];
            }
        }
        float avg = (float) sum/a;
        System.out.println("sum ="+sum);
        System.out.println("a = "+a);
        System.out.println("avg = "+avg);

    }
}
