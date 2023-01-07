package Biwise;

public class Power {
    public static void main(String[] args) {
        int base = 3, power= 6, ans=1;
        while(power>0){
            if((power &1) == 1){
                ans*= base;
            }
            base *= base;
            power = power>> 1 ;
        }
        System.out.println(ans);
    }
}
