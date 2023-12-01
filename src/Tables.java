import java.util.Arrays;
import java.util.stream.IntStream;
public class Tables
{
    public static void main(String[] args)
    {
        //Tworzymy tabele
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {31,65,12,54,12,89};

        //Sumujemy tabele i wypisujemy wynik
        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        System.out.println("Sum of numbers from Array 1: " + sum1);
        System.out.println("Sum of numbers from Array 2: " + sum2);

        //Znajdujemy minimum i maksimum tabel i wypisujemy wynik
        int max1 = Arrays.stream(array1).max().getAsInt();
        int min1 = Arrays.stream(array1).min().getAsInt();
        int max2 = Arrays.stream(array2).max().getAsInt();
        int min2 = Arrays.stream(array2).min().getAsInt();
        System.out.println("\nMaximum number from Array 1: " + max1 + "\nMinimum number from Array 1: " + min1);
        System.out.println("Maximum number from Array 2: " + max2 + "\nMinimum number from Array 2: " + min2);

        //Znajdujemy średnią liczbę tabel i wypisujemy wynik
        double average1 = Arrays.stream(array1).average().getAsDouble();
        double average2 = Arrays.stream(array2).average().getAsDouble();
        System.out.println("\nAverage number from Array 1: " + average1);
        System.out.println("Average number from Array 2: " + average2);

        //Tworzymy tabelę, kopiujemy ją i wypisujemy wynik
        int[] array3 = {11, 94, 17, 44, 72, 58, 29, 29, 63, 57, 1, 30};
        int[] copyofarray3 = Arrays.copyOf(array3, array3.length);
        System.out.println("\nCopied Array 3: " + Arrays.toString(copyofarray3));

        //Wybieramy elementy większe niż 50 i mniejsze niż 50 i wypisujemy wynik
        int[] filteredarray3_1 = Arrays.stream(array3).filter(element -> element > 50).toArray();
        int[] filteredarray3_2 = Arrays.stream(array3).filter(element -> element < 50).toArray();
        System.out.println("\nFiltered Array 3 with numbers >50: " + Arrays.toString(filteredarray3_1));
        System.out.println("Filtered Array 3 with numbers <50: " + Arrays.toString(filteredarray3_2));

        //Usuwamy liczbę 29 z tabeli i wypisujemy wynik
        int[] array3withoutanelement = Arrays.stream(array3).filter(element -> element != 29).toArray();
        System.out.println("\nArray 3 without a number 29: " + Arrays.toString(array3withoutanelement));

        //Łączymy dwie tabeli i wypisujemy wynik
        int[] mergedarrays = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();
        System.out.println("\nMerged Array 1 and Array 2: " + Arrays.toString(mergedarrays));

        //Znajdujemy liczbę wystąpień liczby 12 w tabeli 2 i wypisujemy wynik
        long occurrence = Arrays.stream(array2).filter(element -> element == 12).count();
        System.out.println("\nNumber of occurrences of number 2 in Array 2: " + occurrence);
    }
}
