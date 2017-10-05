import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Counter {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = scanner.next().trim().charAt(0);

        long charCount = Files.
                lines(Paths.get("test")).       //path to the file
                flatMapToInt(CharSequence::chars).
                filter(x -> x == c).
                count();

        System.out.println(charCount);
    }
}