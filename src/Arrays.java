import java.util.stream.IntStream;
public class Arrays
{
    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {31,65,12,54,12,89};

        int sum1 = java.util.Arrays.stream(array1).sum();
        int sum2 = java.util.Arrays.stream(array2).sum();
        System.out.println("Sum of numbers from Array 1: " + sum1);
        System.out.println("Sum of numbers from Array 2: " + sum2);

        int max1 = java.util.Arrays.stream(array1).max().getAsInt();
        int min1 = java.util.Arrays.stream(array1).min().getAsInt();
        int max2 = java.util.Arrays.stream(array2).max().getAsInt();
        int min2 = java.util.Arrays.stream(array2).min().getAsInt();
        System.out.println("\nMaximum number from Array 1: " + max1 + "\nMinimum number from Array 1: " + min1);
        System.out.println("Maximum number from Array 2: " + max2 + "\nMinimum number from Array 2: " + min2);

        double average1 = java.util.Arrays.stream(array1).average().getAsDouble();
        double average2 = java.util.Arrays.stream(array2).average().getAsDouble();
        System.out.println("\nAverage number from Array 1: " + average1);
        System.out.println("Average number from Array 2: " + average2);

        int[] array3 = {11, 94, 17, 44, 72, 58, 29, 29, 63, 57, 1, 30};
        int[] copyofarray3 = java.util.Arrays.copyOf(array3, array3.length);
        System.out.println("\nCopied Array 3: " + java.util.Arrays.toString(copyofarray3));

        int[] filteredarray3_1 = java.util.Arrays.stream(array3).filter(element -> element > 50).toArray();
        int[] filteredarray3_2 = java.util.Arrays.stream(array3).filter(element -> element < 50).toArray();
        System.out.println("\nFiltered Array 3 with numbers >50: " + java.util.Arrays.toString(filteredarray3_1));
        System.out.println("Filtered Array 3 with numbers <50: " + java.util.Arrays.toString(filteredarray3_2));

        int[] array3withoutanelement = java.util.Arrays.stream(array3).filter(element -> element != 29).toArray();
        System.out.println("\nArray 3 without a number 29: " + java.util.Arrays.toString(array3withoutanelement));

        int[] mergedarrays = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();
        System.out.println("\nMerged Array 1 and Array 2: " + java.util.Arrays.toString(mergedarrays));

        long occurrence = java.util.Arrays.stream(array2).filter(element -> element == 12).count();
        System.out.println("\nNumber of occurrences of number 2 in Array 2: " + occurrence);
    }
}
