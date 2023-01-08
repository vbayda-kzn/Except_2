import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[]{1, 2, 4, 5};
            abc[6] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Вы пытаетесь присвоить значение несуществующему элементу массива!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }

    public static void printSum (Integer a, Integer b) {
        System.out.println(a + b);
    }

}
