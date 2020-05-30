import java.util.Arrays;
import java.util.Scanner;

public class P1_2Solution {
    public static void main(String[] args) {
        P1_2Solution so = new P1_2Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println(so.amount(sc.nextLine(),sc.next().charAt(0)));
    }

    public int amount(String str,char c){       //传入的字符串要匹配C的大小写
        int count = 0;
        char[] arrayCh = str.toLowerCase().toCharArray();//将字符串全转换为小写后再转化为字符数组
        Arrays.sort(arrayCh);//将字符数组排序
        String sortedStr = new String(arrayCh);//重新转化为字符串

        int temp = (int)c;                      //C若为大写则转换成小写
        if (temp <= 90 && temp >= 65)
            c = (char)(temp + 32);


        int intIndex = sortedStr.indexOf(c);

        if (intIndex == -1)     //字符串无该字符
            return 0;

        for (int i = intIndex; i < arrayCh.length; i++) {
            if(arrayCh[i] != c)
            {
                return count;
            }
            count++;
        }
        return count;           //当搜索的字符为最后一个时会出现这种情况
    }
}
