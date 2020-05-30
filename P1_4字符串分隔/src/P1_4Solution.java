import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1_4Solution {
    public static void main(String[] args) {
        P1_4Solution so = new P1_4Solution();
        Scanner sc = new Scanner(System.in);
        so.printout(sc.nextLine(),sc.nextLine());
    }

    public void printout(String str1,String str2){
        if(!str1.isEmpty()){
            //System.out.println(getStrList(str1,8));
            List<String> list1 = getStrList(str1,8);
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }
        }
        if(!str2.isEmpty()){
            //System.out.println(getStrList(str2,8));
            List<String> list2 = getStrList(str2,8);
            for (int i = 0; i < list2.size(); i++) {
                System.out.println(list2.get(i));
            }
        }
    }

    public static List<String> getStrList(String inputString, int length){
        int size = inputString.length() / length;
        if (inputString.length() % length != 0){
            size += 1;
        }
        return getStrList(inputString,length,size);
    }

    public static List<String> getStrList(String inputString, int length,int size){
        List<String> list = new ArrayList<String>();
        for (int index = 0; index < size; index++) {
            String childStr = substring(inputString,index*length,(index +1)*length);
            list.add(childStr);
        }
        return list;
    }

    public static String substring(String str,int f, int t){
        if (f> str.length())
            return null;
        if (t > str.length()){
            String temp = str.substring(f,str.length());
            for (int i = 0; i < (t-str.length()); i++) {
                 temp += "0";
            }

            return temp;
        }
        else {
            return str.substring(f,t);
        }
    }
}
