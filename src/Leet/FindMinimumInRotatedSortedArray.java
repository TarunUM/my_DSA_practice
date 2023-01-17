package Leet;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,1};
//                {4,5,6,7,8,9,10,12,13,14,15,16,17,5156,0,1,2};
//        {11,13,15,17};
//        {5,1,2,3,4};
//        {4,5,6,7,0,1,2};
//        {3,4,5,1,2};
        System.out.println(findMin(arr));
        System.out.println(findMin2(arr));
    }

    public static int findMin(int[] nums) {
        int min = nums[0],c=0,bsc=0;
        int start = 0, end = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            c++;
        }

        while (start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] < min){
                min = nums[mid];
            }

            if(nums[mid] <= nums[end]){
                end = mid-1;
            } else {
                start = mid+1;
            }
            bsc++;
        }
        System.out.println(c+"  "+bsc);
        return min;
    }

    public static int findMin2(int[] nums) {
        int l = 0,bsc=0;
        int h = nums.length-1;
        int ans = Integer.MAX_VALUE;
        if(nums[0]<nums[h]){
            return nums[0];
        }
        if(nums.length==1){
            return nums[0];
        }
        while(l<=h){
            int mid = l+(h-l)/2;

            if(nums[mid]>=nums[0]){
                l = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                h = mid-1;
            }
            bsc++;
        }
        System.out.println(bsc);
        return ans;
    }

}
