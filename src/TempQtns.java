import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TempQtns {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Enter Your Name", "null");
//        JOptionPane.showMessageDialog(null,"Hello " + name );

//        int age = JOptionPane.showConfirmDialog(null, "value");
//        JOptionPane.showMessageDialog(null,"You age is " + age );

//        System.out.println(nearDivisor(67,8));
//        System.out.println(Arrays.toString(productExceptSelf(new int[]{2, 3, 7, 5})));

        repeatedWords();

    }

    // Problem-1
    public static int nearDivisor(int m , int n){
        double modulo = m % n;
        float temp = (float) n/2;
        if(modulo <= temp) return (m/n) * n;
        else return (((m/(n))+1))*(n);
    }

    // Problem-2
    public static int[] productExceptSelf(int[] nums) {
        int prefix = 1, postfix =1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }

    public static void repeated(){
        String input1 = "John is cutting the apple with the knife sitting on the bench with the puppy";
        String input2 = "the";
        String[] input1Array = input1.split(" ");
        int count = 0;
        for(int i=0; i<input1Array.length; i++){
            if(input1Array[i].equals(input2)) count++;
        }
        System.out.println(count);
    }

    public static void repeatedWords(){
        String input1 = "John is cutting the apple using the knife sitting on the bench with the puppy";
        String[] input1Array = input1.split(" ");
        ArrayList<String> newArray = new ArrayList<>();
        ArrayList<String> repeatedArray = new ArrayList<>();
        for (int i=0; i<input1Array.length; i++){
            if (!newArray.contains(input1Array[i])) newArray.add(input1Array[i]);
            else {
                repeatedArray.add(input1Array[i]);
            }
        }
        if(repeatedArray.size() == 0) {
            System.out.println("No Repeated Words");
        } else {
            System.out.println(repeatedArray.get(0) + " word is repeated " + (repeatedArray.size()+1) + " times");
        }

    }
}
