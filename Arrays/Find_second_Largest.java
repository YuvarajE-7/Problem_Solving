public class Find_second_Largest {
     public static void main(String[] args) {
        int[] arr = {12, 5, 20};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean found_secondLargest = false;
        for(int i = 1; i< arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
                found_secondLargest = true;
            }
            else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
                found_secondLargest = true;
            }
        
        }
if(found_secondLargest){
    System.out.print(secondLargest);
}
else{
    System.out.print("No second largest element");
}
    }

}
