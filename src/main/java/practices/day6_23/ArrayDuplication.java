package practices.day6_23;

import java.util.Arrays;

/**
 * 重复值
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 23/06/2024 23:30
 * @since JDK11
 */
public class ArrayDuplication {
    public static void main(String[] args) {
        int[] ints = {4,4,4,4,9,9};
        int min = Arrays.stream(ints).min().getAsInt();
        int max = Arrays.stream(ints).max().getAsInt();
        int[] newArray = new int[4];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != min && ints[i] != max){
                newArray[index] = ints[i];
                index++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        int a = 0 ;
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] !=0){
                sum += newArray[i];
                a++;
            }
        }
        float avg = (float) sum/a;
        System.out.println("sum ="+sum);
        System.out.println("a = "+a);
        System.out.println("avg = "+avg);
    }
}
