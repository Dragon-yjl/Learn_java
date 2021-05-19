package exer518;

//此代码是对StudentTset的改进,将操作数组的功能封装到方法中

public class StudentTest1 {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student1[] stus = new Student1[20];//String arr = new String[10];

        for (int i = 0; i < stus.length ; i++) {
            //给数组赋值
            stus[i] = new  Student1();
            //给Student对象的属性赋值
            stus[i].number = (i+1);
            stus[i].state =(int) (Math.random() * (6-1+1)+1);
            stus[i].score = (int) (Math.random() * (100+1));

        }

        StudentTest1 test = new StudentTest1();

        //遍历学生数组
        test.print(stus);

        System.out.println("****************");

        //打印3年级学生信息state为3

        test.searchState(stus,3);

        System.out.println("****************");

        //对学生成绩冒泡排序，并遍历所有学生信息
        test.sort(stus);
        //遍历学生数组
        test.print(stus);

    }

    //遍历Student1数组的操作
    public void print(Student1[] stus){
        for (int i = 0; i <stus.length ; i++) {
            System.out.println(stus[i].info());

        }
    }

    /**
     * 查找Student1数组中指定年级的学生信息
     * @param stus 要查找的数组
     * @param state 要查找的年级
     */
    public void searchState(Student1[] stus,int state){
        for (int i = 0; i <stus.length ; i++) {
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }

        }
    }

    /**
     * 给Student1数组排序
     * @param stus
     */
    public void sort(Student1[] stus){
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j <stus.length-1-i ; j++) {
                if(stus[j].score>stus[j+1].score){
                    //如果需要交换，换的是数组元素，Student对象
                    Student1 temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }

            }

        }
    }
}

class Student1{

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){

        return "学号"+number+"，年级"+state+"，成绩"+score;
    }

}
