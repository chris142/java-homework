import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainScannerTurning {

    //stream and line method
    public static Stream<String> getStreamOfWords(Scanner scanner) {

        return Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return scanner.next();
            }
        });
    }

    //int method
    public static IntStream getStreamOfInt(Scanner scanner) {

        return IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                return scanner.nextInt();
            }
        });
    }

    public static DoubleStream getStreamOfDouble(Scanner scanner) {

        return DoubleStream.generate(new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return scanner.nextDouble();
            }
        });
    }

    public static void main(String[] args) {
        MainScannerTurning main = new MainScannerTurning();
//        String s = "asdasdd s 56 3 777 adsadssd";         //words
//        String s = " 56 3 777  ";                         //int
        String s = "56.335 0.2 3.2  ";                    //double
//        String s = "asdasdd /n s 56/n 3 777/n adsadssd";  //lines

        //use "/n" for lines instead of " "
        try (Scanner scanner = new Scanner(s).useDelimiter(" ").useLocale(new Locale("US"));) {

//            Stream stream = getStreamOfWords(scanner);
//            IntStream stream = getStreamOfInt(scanner);
            DoubleStream stream = getStreamOfDouble(scanner);

            stream.forEach(i -> System.out.println(i));
        } catch (NoSuchElementException e) {
            System.out.println("Input exceeded");
        }
    }
}

