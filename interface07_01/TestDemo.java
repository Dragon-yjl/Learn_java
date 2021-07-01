package interface07_01;



import java.util.Arrays;

/**
 * 接口使用
 * comparable
 * comparator
 */

//一旦一个类，实现了该接口，那么说明该类才能进行大小的比较
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age) {
            return 1;//当前年龄大于0
        }else if(this.age == o.age) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


public class TestDemo {

    public static void main(String[] args) {

        //对象数组
        Student[] student = new Student[3];
        student[0] = new Student("bit",19,67.5);
        student[1] = new Student("顾陌",22,87.5);
        student[2] = new Student("顾奈",20,47.5);

        System.out.println(Arrays.toString(student));

        Arrays.sort(student);

        System.out.println("排序之后");
        System.out.println(Arrays.toString(student));

    }

}
