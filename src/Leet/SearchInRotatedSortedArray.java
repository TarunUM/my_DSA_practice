package Leet;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 7;
        System.out.println(search(nums, target));
    }
    
    public static int search(int[] nums, int target) {
        int pivot = pivotNumber(nums);
        System.out.println(pivot);

        // normal BinarySearch
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        int mid;
        while(start<=end){
            mid = start + (end -start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }


    public static int pivotNumber(int[] nums){
        int start = 0, end = nums.length-1, mid;
        while(start <= end){
            mid = start + (end -start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            } if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            } if(nums[mid] <= nums[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

