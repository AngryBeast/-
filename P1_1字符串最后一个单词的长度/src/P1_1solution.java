import java.util.Scanner;

public class P1_1solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split("\\s+");
        System.out.println(arr[arr.length -1].length());
    }
}
