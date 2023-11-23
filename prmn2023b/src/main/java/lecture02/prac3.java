package lecture02;

public class prac3 {
    public static void main(String[] args) {

        String[][] a = new String[5][2];
        a[0][0] = "B2221234";
        a[0][1] = "1234";
        a[1][0] = "B2224563";
        a[1][1] = "4563";
        a[2][0] = "B2227861";
        a[2][1] = "7861";
        a[3][0] = "B2117652";
        a[3][1] = "7651";
        a[4][0] = "B2119675";
        a[4][1] = "9675";

        pass pa=new pass();
        pa.a=a;
        pa.gakuseki();
    }
}
