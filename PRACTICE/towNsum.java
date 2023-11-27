public class towNsum {

    //My code 
        public int[] twoSum(int[] nums, int target) {
              int n = nums.length;
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] + nums[j] == target) {
                        a = i;
                        b = j;
                    }
                }
            }
            return new int[]{a, b};    
        }
    

        //sol given 
    // public int[] twoSum(int[] nums, int target) {
    //       int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i+1; j < n; j++) {
    //             if (nums[i] + nums[j] == target) {
    //              return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return null;    
    // }
} 
    
