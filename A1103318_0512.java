import java.util.*;
import java.util.Random;


class TimerThread extends Thread{
    Eat e;
    String name;
    public TimerThread(Eat e,String name){
        this.e=e;
        this.name=name;
    }
    public void run(){
        try{
            for(int i=0;i<=1000;i++){
                sleep(3000);
                e.eat();
            }
        }catch(InterruptedException e){

        }
    }
}

class Eat{
    int pork = 5000;
    int beef = 3000;
    int veget = 1000;

    public synchronized void eat(){

        Random random = new Random();
        int n = random.nextInt(41) + 10;
        int type = random.nextInt(3)+1;

        if(pork>=n && type==1){
            pork-=n;
            System.out.println("剩餘豬肉水餃數量為"+pork);
        }else if(beef>=n && type==2){
            beef-=n;
            System.out.println("剩餘牛肉水餃數量為"+beef);
        }else if(veget>=n && type==3){
            veget-=n;
            System.out.println("剩餘蔬菜水餃數量為"+veget);
        }
        if(pork<0&&beef<0&&veget<0){
            System.out.println("水餃售完了");
            System.exit(0);
        }
    }
    public void startEat(int x){
        for(int i=0;i<x;i++){
            TimerThread[] guest=new TimerThread[x];
            guest[i]=new TimerThread(this,"guest"+i);
            guest[i].start();
        }
    }
}

public class A1103318_0512{
    public static void main(String[] args){
        System.out.println("請輸入同時光顧的顧客數目");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Eat e = new Eat();
        e.startEat(a);
    }
}