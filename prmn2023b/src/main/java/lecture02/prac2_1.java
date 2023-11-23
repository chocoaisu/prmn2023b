package lecture02;

import java.util.Scanner;

public class prac2_1 {
    public static void main(String[] args){
        String name1 = "千歳太郎";
        int num = 2001000;

        System.out.printf("氏名：%s , 学籍番号：b%d", name1 ,num);
        System.out.println("");

        Scanner input=new Scanner(System.in);
        System.out.print("変更するなら１を入力");
        int a=input.nextInt();
        if(a==1){
            System.out.print("名前は");
            name1=input.next();
            System.out.print("学籍番号は b");
            num=input.nextInt();
            System.out.printf("氏名：%s , 学籍番号：b%d", name1 ,num);
        }

    }

}
