package Leet;

import java.util.Date;

//605 = https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,1).toString());
    }
    public static returnData canPlaceFlowers(int[] flowerbed, int n) {
        long start = System.nanoTime();
        int i = 0;
        int len = flowerbed.length;
        while(i<len && n > 0){
            if((i==0 || flowerbed[i-1] == 0) && flowerbed[i] == 0 && (i == (len-1) || flowerbed[i+1] == 0)){
                i++;
                n--;
            }
            i++;
        }
        long end = System.nanoTime();
        return new returnData((end - start), n == 0);
    }

    static class returnData {
        long ansDate;
        Boolean ans;

        public returnData(long ansDate, Boolean ans) {
            this.ansDate = ansDate;
            this.ans = ans;
        }

        @Override
        public String toString() {
            return "returnData{" +
                    "ansDate=" + ansDate +
                    ", ans=" + ans +
                    '}';
        }

    }
}
