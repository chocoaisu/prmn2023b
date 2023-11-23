package lecture02;

import java.util.Scanner;

public class pass {
    String[][] a= new String[5][2];
    Scanner scan = new Scanner(System.in);
    void gakuseki() {
        System.out.println("学籍番号は");
        String bangou = scan.next();
        for(int i=0;i<a.length;i++){
            if (a[i][0].equals(bangou)) {
                pass();
                System.exit(0);
            }
        }
        System.out.println("error!!");
    }

    void pass(){
        System.out.println("パスワードは");
        String p=scan.next();
        for(int i=0;i<a.length;i++){
            if (a[i][1].equals(p)) {
                System.out.println("ログイン完了");
                return;
            }
        }
        System.out.println("不正なアクセス");
    }
}

