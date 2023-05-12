import java.io.*;
import java.util.Scanner;
public class A1103318_0505{
    public static void main(String[] args){
        int[] ball = {2,13,24,35,46,22};
        int[] number = new int[6];
        int z=0;
        System.out.println("此為樂透對獎程式\n請輸入六個不重複的數字(1~49)");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            number[i]=sc.nextInt();
            if(number[i]>49||number[i]<1){
                throw new IndexOutOfBoundsException("請輸入範圍內的數字");
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(number[i]==ball[j]){
                    z++;
                }
            }
        }
        if(z>=3){
           System.out.println("您中獎了");
        }else{
            System.out.println("未中獎");
        }
    }
}
