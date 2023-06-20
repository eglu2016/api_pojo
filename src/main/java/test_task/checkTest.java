package test_task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class checkTest {

    @Test
    public void Test() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(80);
        list.add(170);
        list.add(-6);

        int avrRes = 0;
        int maxRes = 0;
        for (int i=0; i<list.size(); i++) {
            System.out.println("i=" + i);
            avrRes += list.get(i);
            if (list.get(i) > maxRes) {
                maxRes = list.get(i);
            }
        }

        System.out.println("avrRes=" + avrRes/list.size());
        System.out.println("maxRes=" + maxRes);
    }
}