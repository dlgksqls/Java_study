package chap_10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    // 스트림
    int[] scores = {100,95,90,85,80};
    IntStream scoreStream = Arrays.stream(scores);

    String[] langs = {"python","java","javascript","c","c++","c#"};
    Stream<String> stream = Arrays.stream(langs);

    List<String> langList = new ArrayList<>();
    // langList = Arrays.asList("python","java","javascript","c","c++","c#");
}
