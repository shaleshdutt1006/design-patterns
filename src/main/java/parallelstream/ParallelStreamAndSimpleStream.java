package parallelstream;

import java.util.stream.IntStream;
//Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor.
// Normally any java code has one stream of processing, where it is executed sequentially. Whereas by using parallel
// streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the
// final result is the combination of the individual outcomes.
public class ParallelStreamAndSimpleStream {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(1, 700).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream take time " + (end - start));
        System.out.println("------------------------=>");
//Here we are using parallel stream where order of execution doesn't matter
        start = System.currentTimeMillis();
        IntStream.range(1, 700).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parllel stream take time " + (end - start));

    }
}
