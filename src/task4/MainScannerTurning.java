package task4;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MainScannerTurning {

    //stream and line method
    public static Stream getStreamOfWords(Scanner scanner) {
        Spliterator<String> split = Spliterators.spliterator(scanner, Long.MAX_VALUE, Spliterator.NONNULL | Spliterator.ORDERED);
        return StreamSupport.stream(split, false);

    }

    //int method
    public static IntStream getStreamOfInt(Scanner scanner) {
        Spliterator.OfInt split = Spliterators.spliterator(new PrimitiveIterator.OfInt() {

            @Override
            public boolean hasNext() {
                return scanner.hasNextInt();
            }

            @Override
            public int nextInt() {
                return scanner.nextInt();
            }
        }, Long.MAX_VALUE, Spliterator.NONNULL | Spliterator.ORDERED);
        return StreamSupport.intStream(split, false);

    }

    //double method
    public static DoubleStream getStreamOfDouble(Scanner scanner) {
        Spliterator.OfDouble split = Spliterators.spliterator(new PrimitiveIterator.OfDouble() {

            @Override
            public boolean hasNext() {
                return scanner.hasNextDouble();
            }

            @Override
            public double nextDouble() {
                return scanner.nextDouble();
            }
        }, Long.MAX_VALUE, Spliterator.NONNULL | Spliterator.ORDERED);
        return StreamSupport.doubleStream(split, false);

    }

    public static void main(String[] args) {
        MainScannerTurning main = new MainScannerTurning();
//        String s = "asdasdd s 56 3 777 adsadssd";         //words
        String s = " 56 3 777  ";                         //int
//        String s = "56.335 0.2 3.2  ";                    //double
//        String s = "asdasdd /n s 56/n 3 777/n adsadssd";  //lines

        //use "/n" for lines instead of " "
        try (Scanner scanner = new Scanner(s).useDelimiter(" ").useLocale(new Locale("US"));) {

//            Stream stream = getStreamOfWords(scanner);
         IntStream stream = getStreamOfInt(scanner);
//            DoubleStream stream = getStreamOfDouble(scanner);

            stream.forEach(System.out::println);
        }
    }
}

