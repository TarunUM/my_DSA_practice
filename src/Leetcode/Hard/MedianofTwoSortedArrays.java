package Leetcode.Hard;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[]{3};
        int[] b = new int[]{-2,-1};
        System.out.println(calculateFindMedianSortedArrays(a, b));
    }

//        [1,2,3,4,5]
//          [6,7,8]
    static double calculateFindMedianSortedArrays(int[] nums1, int[] nums2){
        double ans = 0.0;
        // find whether the size of the arrays is combined is odd or even
        int size = nums1.length + nums2.length;
        int mid = size/2;

        if(nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        // nums2 will always be smaller

        int l = 0, r = nums1.length-1;
        while(true){
            int m = (l+r)/2; // last index of nums2 after binary search
            int n = mid - m - 2; // highest index of nums1 after subtracting nums2 elements

            // A is smaller array and B is Large array

            int Aleft, Aright, Bleft, Bright;
            Bleft = m<0 ? Integer.MIN_VALUE : nums2[m];
            Bright = m+1< nums2.length ? Integer.MAX_VALUE : nums2[m+1];

            Aleft = n<0?Integer.MIN_VALUE:nums1[n];
            Aright = (n+1)<nums2.length ? Integer.MAX_VALUE : nums1[n+1];

            if(Aleft <= Bright && Bleft <= Aright){
                if(size%2 != 0){
                    return Math.min(Bright, Aright);
                }
                return (double) (Math.max(Bright,Aright)+Math.min(Aleft,Bleft))/2;
            } else if(Aright > Bleft){
                r = m-1;
            } else {
                l = m+1;
            }
        }
    }

    // O(m+n) = Time Complexity and O(m+n) = Space Complexity
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0 , k = 0;
        int[] newArray = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]) {
                newArray[k++] = nums1[i++];
            } else if(nums1[i] >= nums2[j]) {
                newArray[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            newArray[k++] = nums1[i++];
        }
        while(j < nums2.length){
            newArray[k++] = nums2[j++];
        }
        int mid = newArray.length / 2;
        if(newArray.length % 2 == 0){
            return ((double) newArray[mid]  + (double) newArray[mid-1]) / 2;
        }
        return newArray[mid];
    }
}
