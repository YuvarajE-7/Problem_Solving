public class count_pos_neg_zero_elements {
    public static void main(String[] args) {
        int[] arr = {3, -2, 0, 7, -5, 0, 4, -1};
        int p_count =0;
        int n_count =0;
        int z_count =0;
        for (int i =0; i<arr.length;i++){
            if(arr[i] > 0){
                p_count = p_count +1;
            }
            else if (arr[i] < 0){
                n_count = n_count+1;
            }
            else{
                z_count = z_count+1;
            }
        }
System.out.println("+  " + p_count );
System.out.println("-  " + n_count );
System.out.println("0  " + z_count );
    }

}
