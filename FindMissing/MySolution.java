class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> lst = new HashMap<Integer,Integer>();

        for(int i=1;i<=nums.length;i++){

            lst.put(i,1);
        }
        for(int i=0;i<nums.length;i++){
            if(lst.containsKey(nums[i])){
                lst.remove(nums[i]);
            }
        }
        return new ArrayList<Integer>(lst.keySet());
    }
}