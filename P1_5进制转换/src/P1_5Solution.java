import java.util.Scanner;
import java.util.StringTokenizer;

public class P1_5Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P1_5Solution so = new P1_5Solution();

        //so.Divison(sc.next());            //本地调试时使用
        while(sc.hasNext()){                //测试时需要不断输入
            so.Divison(sc.next());
        }


    }

    public void Divison(String str){
//        StringTokenizer stringTokenizer = new StringTokenizer(str,"0x");
//        if ((int)str.charAt(str.length() -1 ) == 48){
//            System.out.println(Conversion(stringTokenizer.nextToken()+"0"));
//        }
//        else {
//            System.out.println(Conversion(stringTokenizer.nextToken()));
//        }
        System.out.println(Conversion(str.substring(2,str.length())));//字符串分割，将十六进制前的0x消除
    }


    public int Conversion(String str){
        //str = str.toUpperCase();
        int count = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            temp = (int)str.charAt(i);
            if(temp >= 65){         //当当前位是A~F时
                temp -= 55;
            }
            else {                  //当前字符为阿拉伯数字
                temp -= 48;
            }
            count += (int) temp * Math.pow(16.0,str.length() - 1 - i);      //当前位乘16的几次方
        }
        return count;
    }
}
