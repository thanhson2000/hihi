package practices.day6_23;

/**
 * 将数字的每一位放到数组
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 24/06/2024 22:17
 * @since JDK11
 */
public class NumberIntoArray {
    public static void main(String[] args) {
        int origin = 110234;
        int temp = origin;

        // 1. 需要知道origin有多少个数字
        int count = 0;
        while(origin != 0){
            origin = origin / 10;
            count++;
        }


        // 2. 将origin的每一位放到数组，数组的长度= count
        int[] arr = new int[count];
        int index = arr.length -1;
        while(index >= 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }

        // 需求： 要将origin的每一位放到一个数组，而origin不知道是多少
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
