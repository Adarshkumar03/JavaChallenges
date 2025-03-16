package Arrays;

public class ArrayOps {
    public double arrayAvg(int[] arr){
        if(arr.length == 0) return 0;
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
