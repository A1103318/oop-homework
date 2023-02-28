import java.util.*;

public class A1103318_0224_1{
    public static void main(String[] argv){
        int number;
        System.out.println("請輸入一個整數");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println(number%2==0?number+"為偶數":number+"為奇數");
    }   
}