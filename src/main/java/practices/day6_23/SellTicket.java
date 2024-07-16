package practices.day6_23;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 卖飞机票
 * link: https://www.youtube.com/watch?v=8G3J3zTtVIs&list=PLFbd8KZNbe-8cHN7zAPg8S8zrrx7pF6cZ&index=78
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 23/06/2024 15:51
 * @since JDK11
 */
public class SellTicket {
    public static void main(String[] args) {

        /* I。 需求分析：
            1. 键盘输入机票原价、月份、头等舱或经济舱
            2. 判断月份是旺季还是淡季
            3. 判断舱位是经济舱还是头等舱
            4. 根据实际情况计算出机票价格
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0是头等舱 1是经济舱");
        int seat = sc.nextInt();
        if(month>=5 && month <=10){
            // 旺季
            // 判断当前机票是经济舱还是头等舱
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        }else if((month >=1 && month <=4) || (month >= 11 && month<=12)){
            // 淡季
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else {
            // 表示键盘录入的月份是非法的
            System.out.println("键盘输入的月份不合法");
        }
        System.out.println("机票的价格是："+ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            // 头等舱
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            // 经济舱
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有此舱位");
        }
        return ticket;
    }


}
