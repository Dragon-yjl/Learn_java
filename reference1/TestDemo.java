package reference1;


import java.time.Year;

class  Teacher {
    String name;
    int age;
    int height;
    int weight;

    public Teacher(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Teacher t) {
        if(this.age < t.age) {
            return -1;
        }else if(this.age == t.age) {
            return 0;
        }else {
            return 1;
        }
    }

}
public class TestDemo {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("gao",20,180,70);
        Teacher t2 = new Teacher("cehg",32,178,56);
        Teacher t3 = new Teacher("tan1",20,167,67);
        Teacher t4 = new Teacher("ggumo",19,170,78);

        System.out.println(t1.compareTo(t2));//-1
        System.out.println(t1.compareTo(t3));//0
        System.out.println(t1.compareTo(t4));//1
    }
}
