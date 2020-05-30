import java.util.Scanner;

public class P1_6Solution {
    public static void main(String[] args) {
        P1_6Solution so = new P1_6Solution();
        Scanner sc = new Scanner(System.in);
        so.Factor(sc.nextLong());
    }

//    public void Factor(long num){
//        while (num != 1){
//            for (int i = 2; i <= num; i++) {
//                if (num % i == 0){
//                    System.out.print(i+" ");
//                    num /= i;
//                    break;
//                }
//            }
//        }
//    }


    public void Factor(long num){
        while (num != 1){
            for (int i = 2; i <= num; i++) {
                if (num % i == 0){
                    System.out.print(i+" ");
                    num /= i;
                    break;
                }
            }
        }
    }
}
