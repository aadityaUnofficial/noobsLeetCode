public class SelectionSort{
    private int[] arr;
    SelectionSort(int [] arr){
        this.arr=arr;
    }
    public void sort(){

        for(int i=0;i<= arr.length-2; i++){// loop till secondlast index inclusive
            int minIndex = i;
            for(int j=i;j<=arr.length-1;j++){// loop till last index inclusive
                if(arr[j]<arr[minIndex]){ //compare if current min val(via index) is smaller or not
                    minIndex=j; // update minIndex if not
                }
            }
            //Swap min with arr[i];
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public String toString() {
        for(int i: this.arr){
            System.out.println(i);
        }
        return "";
    }

    public static void main(String[] args){
        SelectionSort ss = new SelectionSort(new int[]{4,2,4,12,1});
        ss.sort();
        ss.toString();
    }
}