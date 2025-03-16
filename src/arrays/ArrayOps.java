package arrays;

public class ArrayOps {
    private double arrayAvg(int[] arr){
        double sum = 0;
        for(int num: arr){
            sum+=num;
        }
        return sum/arr.length;
    }

    public void sortBubble(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public int linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
