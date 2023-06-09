package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // 다형성을 이용해 List 사용하여 필요할때 뒤에만 변경
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        ListIterator<String> iter = names.listIterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("---------------------------------------------");
        while(iter.hasPrevious()){
            String name = iter.previous();
            System.out.println(name);
        }
        System.out.println("---------------------------------------------");
        names.stream().forEach(System.out::println);
    }
}
