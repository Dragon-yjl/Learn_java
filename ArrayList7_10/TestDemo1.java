package ArrayList7_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestDemo1 {

    static  class Teacher {
        String name;

        Teacher(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            return Objects.equals(name, teacher.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {

        List<Teacher> list = new ArrayList<>();

        Teacher t1 = new Teacher("高波");
        Teacher t2 = new Teacher("高波");
        Teacher t3 = new Teacher("顾陌");
        Teacher t4 = new Teacher("顾陌");

        list.add(t1);
        list.add(t3);
        System.out.println(list);
        //[Teacher{name='高波'}, Teacher{name='顾陌'}]

        list.remove(t1);//删除了高波
        System.out.println(list);
        //[Teacher{name='顾陌'}]


        list.remove(t4);//无法生效 等到类中重写了equals方法 才能吧顾陌删除
        System.out.println(list);
        //[Teacher{name='顾陌'}]
    }
}
