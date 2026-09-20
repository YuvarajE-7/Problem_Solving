public class Move_all_zeros_to_end {
    public static void main(String[] args) {
        int[] arr = {0,0,1,3,0,12};
        int index = 0;
        int temp = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
 for(int i = 0 ; i<arr.length;i++){
    System.out.print(arr[i] + " ");   } 
    }

}
