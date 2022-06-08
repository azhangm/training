package day01.homework;

public class Two {
    public static void main(String[] args) {
        int ans = 0;
        double  thickness = 0.1;
        int heat = 8844430;

        while( thickness <= heat){

            thickness *= 2;
            ans++;

        }

        System.out.println("ÐèÒªÕÛµþ"+ ans +"´Î");
    }
}
