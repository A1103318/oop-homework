import java.util.*;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    void show(){
        System.out.print("姓名:"+name);
        System.out.print(" 身高:"+height+"(公尺)");
        System.out.print(" 體重:"+weight+"(公斤)");
        System.out.print(" 速度:"+speed+"(公尺/分鐘)");
    }

    double distance(double x,double y){
        return x*y*speed;
    }

    double distance(double x){
        return x*speed;
    }
}

public class A1103318_0324_1{
    public static void main(String[] args){
        Animal[] role=new Animal[4];

        for(int i=0;i<role.length;i++){
            role[i]=new Animal();
        }

        role[0].name="雪寶";
        role[0].height=1.1;
        role[0].weight=52;
        role[0].speed=100;

        role[1].name="驢子";
        role[1].height=1.5;
        role[1].weight=99;
        role[1].speed=200;

        role[2].name="安那";
        role[2].height=1.7;
        role[2].weight=48;
        role[2].speed=120;

        role[3].name="愛沙";
        role[3].height=1.7;
        role[3].weight=50;
        role[3].speed=120;

        for(int i=0;i<role.length;i++){
            role[i].show();
            System.out.println();
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<role.length;i++){
        System.out.println("請輸入"+role[i].name+"的時間");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("請輸入"+role[i].name+"的加速度");
        String z = sc.nextLine();
            if(z.isEmpty()==false){
                int y = Integer.valueOf(z);
                System.out.println(role[i].name+"的跑步距離為"+role[i].distance(x,y));
            }else{
                System.out.println(role[i].name+"的跑步距離為"+role[i].distance(x));
            }
        System.out.println();
        }
    }
}
 
