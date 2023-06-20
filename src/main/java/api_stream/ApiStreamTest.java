package api_stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApiStreamTest {

    @Test
    public void checkApiStreamTest() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();
        // stream.filter(x -> x.toString().length() == 3).forEach(x-> System.out.println(x));
        // stream.filter(x->x.toString().length() == 4).map(x-> "result : " + x).forEach(System.out::println);

//        String[] array = {"Java", "Ruuuuussshhh"};
//        Stream <String> streamOfArray = Arrays.stream(array);
//        streamOfArray.map(s->s.split(""))
//                .map(Arrays::stream).distinct()
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}