import java.util.*;

public class A1103318_0224_2{
    public static void main(String[] argv){
        double Celsius;
        double Fahrenheit;
        System.out.println("請輸入攝氏溫度");
        Scanner sc = new Scanner(System.in);
        Celsius = sc.nextDouble();
        Fahrenheit =  Celsius*9/5+32;
        System.out.println("華氏溫度為"+Fahrenheit);
    }
}