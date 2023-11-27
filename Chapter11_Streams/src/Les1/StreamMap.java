package Les1;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jai","Hanesh","Vishal","Hemant","Naren");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
