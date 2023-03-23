import java.util.*;

public class A1103318_0317_1{
    public static void main(String args[]){
        int n,m;
        System.out.println("請輸入n值&m值");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[][]product=new int[n][m];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                product[i-1][j-1]=i*j;
            }
        }
        for(int[] i:product){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}