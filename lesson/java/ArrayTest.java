public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[3];
        int length = array.length;
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        for (int i = 0; i < length; i++) {
            int val = array[i];
            System.out.println(val);
        }
    }
}