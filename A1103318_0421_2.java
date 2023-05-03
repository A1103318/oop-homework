import java.io.*;

public class A1103318_0421_2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String str;
    boolean isDate;
    do {
        isDate=true;
        System.out.println("請依YYYY/MM/DD或MM/DD/YYYY的格式輸入日期");
        str=br.readLine();
        if(str.matches("\\d{4}[/]{1}[0,1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}")||str.matches("[0,1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}\\d{4}")){
            System.out.println("您輸入的日期為"+str);
        }else{
            System.out.println("您輸入的格式有誤");
            isDate=false;
        }
        
    } while (!isDate);
    }
}