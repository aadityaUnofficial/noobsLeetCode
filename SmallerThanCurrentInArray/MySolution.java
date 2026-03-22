class MySolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] op = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            count=0;
            for(int j:nums){
                if(c>j){
                    count++;
                }
            }
            op[i]=count;
        }
        return op;
    }
}