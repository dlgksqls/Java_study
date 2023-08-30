package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        for (Student i : list) {
            if (i.license == "자바")
                System.out.println(i.name);
        }
        System.out.println("-------------------------------");

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            if (s.license == "자바")
                System.out.println(s.name);
        }

    }

}

class Student{
    String name;
    String license;

    public Student(String name, String license) {
        this.name = name;
        this.license = license;
    }
}
