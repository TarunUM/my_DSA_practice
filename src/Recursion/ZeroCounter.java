package Recursion;

public class ZeroCounter {
    public static void main(String[] args) {
        System.out.println(counter(1240024000));
    }

    private static int counter(int n){
        return Helper(n,0);
    }

    static int Helper(int n, int count){
        if(n<=0){
            return count;
        }
        if(n%10==0){
            return Helper(n/10,count+1);
        }
        return Helper(n/10,count);
    }
}
