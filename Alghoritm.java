package Boolean;

public class Alghoritm {

    public static void main(String[] args) {
        int[] array = new int[]{22, 33, 22, 10, 3, 4, 22, 3, 174, 2, 1, 10};
        int iteration = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            iteration += 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Iterations " + iteration);
    }
}