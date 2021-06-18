package ClassTest;

 class Human {
    protected String sex;
    protected String name;
    protected int age;

    public Human(){
        this.sex = "男";
        this.name = "顾陌";
        this.age = 22;

    }

    public Human(String name, int sex, int age) {
        this.age=age;
        this.setName(name);
        this.setAge(age);
    }

    public void print(){
        System.out.print("name: "+this.getName()+" "+"sex: "+this.sex+" "+"age: "+this.age+" ");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }

 class Student extends Human{
    private int id;

    public Student(int id,String name,int age,int sex) {
        super(name,sex,age);
//		super()
        this.id = id;
    }
    public Student(){
        super();
        this.id = 10;
    }
    public void print(){
        super.print();
        System.out.println("id: "+this.id);

    }


    public static void main(String[] args) {
        int id = 18060207;
        int age = 15;
        int sex = 0 ;
        String name ="顾奈";

        Student s1 = new Student(id, name, age, sex);
        Student s2 = new Student();

        s1.print();
        s2.print();


    }

}

public class StudentTest {
}
