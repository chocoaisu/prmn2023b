package lecture02;

public class Keisan {
    int[] num=new int[5];
    int s=0;
    void sum(){
        for(int i=0;i< num.length;i++){
            s+=num[i];
        }
        System.out.println("合計値"+s);
    }
    void hanbetu(){
        if(s<=49){
            System.out.println("small");;
        } else if (s<=99) {
            System.out.println("big");
        }else {
            System.out.println("great!!");
        }
    }
}
