package Leet;

import java.util.ArrayList;

//605 = https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        ArrayList<Integer> flowerbed2 = new ArrayList<>();
        flowerbed2.add(1);
        flowerbed2.add(0);
        flowerbed2.add(0);
        flowerbed2.add(0);
        flowerbed2.add(1);
        System.out.println(canPlaceFlowers(flowerbed,2).toString());
        System.out.println(canPlaceFlowers2(flowerbed2,2).toString());


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

    public static returnData canPlaceFlowers2(ArrayList<Integer> flowerbed, int n) {
        long start = System.nanoTime();
        int i = 1;
        int len = flowerbed.size() - 1;

        flowerbed.add(0, 0);

        while(i<len && n > 0){
            if(flowerbed.get(i - 1) == 0 && flowerbed.get(i) == 0 && flowerbed.get(i + 1) == 0){
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
