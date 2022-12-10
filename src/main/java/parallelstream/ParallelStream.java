package parallelstream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) throws IOException {
   //Using parallel() method on a stream
        //Creating a File object
        File fileName = new File("C:\\Desktop\\Textfile.txt");
        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        Stream<String> text = Files.lines(fileName.toPath());

        // Creating parallel streams using parallel() method
        // later using forEach() to print on console
        text.parallel().forEach(System.out::println);

        // Closing the Stream
        // using close() method
        text.close();

        System.out.println("--------------------------->>>>");
        System.out.println("--------------------------->>>>");
        //Method 2: Using parallelStream() on a Collection
        // Creating a File object
        File file = new File("C:\\Desktop\\Textfile.txt");

        // Reading the lines of the text file by
        // create a List using readAllLines() method
        List<String> content = Files.readAllLines(file.toPath());

        // Creating parallel streams by creating a List
        //  using readAllLines() method
        content.parallelStream().forEach(System.out::println);
    }
}
