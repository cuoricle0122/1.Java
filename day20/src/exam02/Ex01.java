package exam02;

import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        System.out.println(names); // [이름3, 이름2, 이름1, 이름5, 이름4]
        // 검색을 빨리할 수 있도록 배치를 재구성

    }
}
