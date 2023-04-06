package homework_log;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 3, 5, 6, 9, 14};


        System.out.println(binarySearch(9, array));


}

    public static int binarySearch(int search, int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {

                return middle;
            }
        }
        return -1;

    }
}
