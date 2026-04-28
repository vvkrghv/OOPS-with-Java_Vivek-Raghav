class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Q1{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        try {
            int index = 10;

            if (index >= arr.length) {
                throw new MyException("Custom Exception: Index out of range!");
            }

            System.out.println("Element: " + arr[index]);
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Built-in Exception caught: " + e);
        }

    }
}