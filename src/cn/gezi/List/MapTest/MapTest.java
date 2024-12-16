package cn.gezi.List.MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Student student = new Student("xiaoming","男");
        Map<String,Student> map =  new HashMap<>();
        map.put("xiaoming",student);

        Student target = map.get("xiaoming");

        System.out.println(target.name);

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(0,"AAAA");

        System.out.println(map1.get(0));
    }
}
