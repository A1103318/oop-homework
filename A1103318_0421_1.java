import java.io.*;

public class A1103318_0421_1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String str;
    boolean isMail;
    do {
        isMail=true;
        System.out.println("請輸入正確格式的電子郵件信箱");
        str=br.readLine();
        if(str.matches("[a-z0-9]{1,64}[@]{1}[a-z0-9.]{1,20}[.]{1}[a-z0-9]{1,10}")){
            System.out.println("您輸入的電子郵件為"+str);
        }else{
            System.out.println("您輸入的格式有誤");
            isMail=false;
        }
        
    } while (!isMail);
    }
}