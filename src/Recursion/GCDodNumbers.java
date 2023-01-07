package Recursion;

public class GCDodNumbers {
    public static void main(String[] args) {
        System.out.println(LCM(4,9));
    }


//    HCF * LCM = a * b

//    Eclidean Algorithm for Greatest Common Divisor(GCD) or HCF(Highest Common Factor)
    static int GCD(int a, int b) {
        if(a==0){
            return b;
        }
        return GCD((b%a),a);
    }

// Least Common Factor
    static int LCM(int a, int b) {
        return a * b / GCD(a,b);
    }
}
