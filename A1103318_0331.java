import java.util.*;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name, double height, double  weight, double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }
    
    void show(){
        System.out.print("姓名:"+this.name);
        System.out.print(" 身高:"+this.height+"(公尺)");
        System.out.print(" 體重:"+this.weight+"(公斤)");
        System.out.print(" 速度:"+this.speed+"(公尺/分鐘)");
    }

    double distance(double x,double y){
        return x*y*this.speed;
    }

    double distance(double x){
        return x*this.speed;
    }

    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal{
    String gender;
    Human(String name, double height, double weight, double speed,String gender){
        super(name, height, weight, speed);
        this.gender=gender;
    }
    void show(){
        System.out.print("姓名:"+this.name);
        System.out.print(" 身高:"+this.height+"(公尺)");
        System.out.print(" 體重:"+this.weight+"(公斤)");
        System.out.print(" 速度:"+this.speed+"(公尺/分鐘)");
        System.out.print(" 性別:"+this.gender);
    }    
}

class Snow extends Human{
    String skill;
    public Snow(String name, double height, double weight, double speed,String gender, String skill){
        super(name, height, weight, speed, gender);
        this.skill=skill;
    }
    void show(){
        System.out.print("姓名:"+this.name);
        System.out.print(" 身高:"+this.height+"(公尺)");
        System.out.print(" 體重:"+this.weight+"(公斤)");
        System.out.print(" 速度:"+this.speed+"(公尺/分鐘)");
        System.out.print(" 性別:"+this.gender);
        System.out.print(" 冰凍技能:"+this.skill);
    }     
    double distance(double x,double y){
        return x*y*this.speed*2;
    }

    double distance(double x){
        return x*this.speed*2;
    }
}

public class A1103318_0331{
    public static void main(String[] args){
        Animal.showinfo();
        Animal[] animal=new Animal[2];
        Human[] human=new Human[3];
        Snow[] snow=new Snow[1];

        animal[0]=new Animal("雪寶",1.1,52,100);

        animal[1]=new Animal("驢子",1.5,99,200);

        human[0]=new Human("阿克",1.9,80,150,"男");

        human[1]=new Human("漢斯",1.9,78,130,"男");

        human[2]=new Human("安那",1.7,48,120,"女");

        snow[0]=new Snow("愛沙",1.7,50,120,"女", "yes");
        
        for(int i=0;i<animal.length;i++){
            animal[i].show();
        }
        for(int i=0;i<human.length;i++){
            human[i].show();
        }
        for(int i=0;i<snow.length;i++){
            snow[i].show();
        }

        
        for(int i=0;i<animal.length;i++){
        Scanner sc = new Scanner(System.in);    
        System.out.println("請輸入"+animal[i].name+"的時間");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("請輸入"+animal[i].name+"的加速度");
        String z = sc.nextLine();
            if(z.isEmpty()==false){
                int y = Integer.valueOf(z);
                System.out.println(animal[i].name+"的跑步距離為"+animal[i].distance(x,y));
            }else{
                System.out.println(animal[i].name+"的跑步距離為"+animal[i].distance(x));
            }
        System.out.println();
        }

        for(int i=0;i<human.length;i++){
            Scanner sc = new Scanner(System.in);    
            System.out.println("請輸入"+human[i].name+"的時間");
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("請輸入"+human[i].name+"的加速度");
            String z = sc.nextLine();
                if(z.isEmpty()==false){
                    int y = Integer.valueOf(z);
                    System.out.println(human[i].name+"的跑步距離為"+human[i].distance(x,y));
                }else{
                    System.out.println(human[i].name+"的跑步距離為"+human[i].distance(x));
                }
            System.out.println();
        }
        

        for(int i=0;i<snow.length;i++){
            Scanner sc = new Scanner(System.in);    
            System.out.println("請輸入"+snow[i].name+"的時間");
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("請輸入"+snow[i].name+"的加速度");
            String z = sc.nextLine();
                if(z.isEmpty()==false){
                    int y = Integer.valueOf(z);
                    System.out.println(snow[i].name+"的跑步距離為"+snow[i].distance(x,y));
                }else{
                    System.out.println(snow[i].name+"的跑步距離為"+snow[i].distance(x));
                }
            System.out.println();
        }
    }
}