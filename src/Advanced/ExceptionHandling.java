package Advanced;

public class ExceptionHandling {
    public void divideNumbers(int a, int b){
        try{
            int result = a/b;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public void accessArrayElements(int[] arr, int index){
        try{
            System.out.println("Element at index " + index + ": " + arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
