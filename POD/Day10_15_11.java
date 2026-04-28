package POD;

public class Day10_15_11 {
    
    public static int checkLargestElement(){
        int arr[] = {12, 34, 65, 76, 34};

        int large = arr[0];
        int secondLarge = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(secondLarge > arr[i] && secondLarge != large){
                secondLarge = arr[i];
            }else{
                return -1;
            }

            
        }
        System.out.println(secondLarge);
        return  secondLarge;
    }

    public static void main(String[] args) {
        
        Day10_15_11.checkLargestElement();
    }
}
