package task8;

import java.util.stream.Stream;

public class MainRandNumGenerator {


    public static void main(String[] args) {

        final long l2pow48 = 281474976710656L;

        final LCG random = new LCG(25214903917L, 11L, l2pow48);

        Stream<Long> stream = Stream.iterate(17L, random::getNext).limit(10);

        stream.forEach(System.out::println);

    }
}