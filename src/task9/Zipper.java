package task9;

import javafx.util.Pair;

import java.util.Iterator;
import java.util.stream.Stream;

public class Zipper {
    public static void main(String[] args) {

        Stream stream1 = Stream.of("program", "creek", "program", "creek", "java",
                "web", "program");

        Stream stream2 = Stream.of("pro", "crk", "gram", "cek", "web", "pogr");
        Stream streamFinal = zip(stream1, stream2);

        streamFinal.forEach(i -> System.out.println(i));
    }

    private static <A, B> Stream<Pair<A, B>> zip(Stream<A> first, Stream<B> second) {
        Iterator<A> i = first.iterator();
        return second.filter(x -> i.hasNext()).map(b -> new Pair<>(i.next(), b));
    }
}