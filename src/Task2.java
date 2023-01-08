public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,5,6,8,9,1,5,10,6};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}