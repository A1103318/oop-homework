import java.util.Scanner;

public class A1103318_0421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期的格式 (YYYY/MM/DD 或 MM/DD/YYYY): ");
        String dateFormat = scanner.nextLine();

        System.out.print("請輸入日期: ");
        String dateStr = scanner.nextLine();

        String[] dateArray;
        if (dateFormat.equals("YYYY/MM/DD")) {
            dateArray = dateStr.split("/");
            System.out.println("您輸入的日期是 " + dateArray[0] + "年" + dateArray[1] + "月" + dateArray[2] + "日");
        } else if (dateFormat.equals("MM/DD/YYYY")) {
            dateArray = dateStr.split("/");
            System.out.println("您輸入的日期是 " + dateArray[2] + "年" + dateArray[0] + "月" + dateArray[1] + "日");
        } else {
            System.out.println("日期格式不正確");
        }

        scanner.close();
    }
}