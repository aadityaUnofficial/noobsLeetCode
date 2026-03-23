class Solution {
    public List<String> buildArray(int[] target, int n) {
        int matchIndex=0;
        List<String> op = new ArrayList<String>();
        int[] nums = new int[n];
        for(int i=1;i<=n;i++){
            nums[i-1]=i;
        }
        int j=0;
        for(int i=0;i<target.length;i++){
            Boolean acted = false;
            while(!acted){
                if(target[i]==nums[j]){
                    op.add("Push");
                    acted=true;
                }
                else{
                    op.add("Push");
                    op.add("Pop");
                    //acted=true;

                }
                j++;

            }
            //if(acted){
              //  j++;}
        }
        return op;
    }
}