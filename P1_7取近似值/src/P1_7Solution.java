import java.util.Scanner;

public class P1_7Solution {
    public static void main(String[] args) {
        P1_7Solution so = new P1_7Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println(so.Approximate_value(sc.nextFloat()));
    }

    public int Approximate_value(float num){
        if ((num - (int)num) >= 0.5){
            return (int)num + 1;
        }
        else
            return (int)num;
    }
}
