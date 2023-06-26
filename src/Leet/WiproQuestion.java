package Leet;

import java.util.Arrays;

public class WiproQuestion {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 8, 25, 38, 23, 19, 49, 21, 44};
        System.out.println("ORG Array"+ Arrays.toString(arr));
        System.out.println("New Array"+ Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] arr) {
        int[] newArr = new int[10];
        Arrays.fill(newArr, -1);

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i] % 10;
            if(newArr[j] == -1) {
                newArr[j] = arr[i];
            } else {
                int rem = arr[i] % 10;
                int leftDigit = arr[i]/ 10;
                while(j>=0 && j<10 && newArr[j] != -1 && leftDigit > 0) {
                    if(rem % 2 == 1){
                        j = (j+(leftDigit%10))%10;
                    } else {
                        j = (j-(leftDigit%10))%10;
                    }
                    rem = leftDigit % 10;
                    leftDigit = leftDigit/ 10;
                }
                while(newArr[j] != -1){
                    j++;
                    if(j>9){
                        j=0;
                    }
                }

                newArr[j] = arr[i];
            }
        }
        return newArr;
    }
}
