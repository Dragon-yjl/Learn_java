package exer518;

public class StudentTest {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student[] stus = new Student[20];//String arr = new String[10];

        for (int i = 0; i < stus.length ; i++) {
            //给数组赋值
            stus[i] = new  Student();
            //给Student对象的属性赋值
            stus[i].number = (i+1);
            stus[i].state =(int) (Math.random() * (6-1+1)+1);
            stus[i].score = (int) (Math.random() * (100+1));

        }

        //遍历学生数组
        for (int i = 0; i <stus.length ; i++) {
            //System.out.println(stus[i]);输出地址值
            //System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);显示三列数字有点乱
            System.out.println(stus[i].info());//类中加入一个方法，调用方法
        }
        System.out.println("****************");

        //打印3年级学生信息state为3
        for (int i = 0; i <stus.length ; i++) {
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }

        }

        System.out.println("****************");
        //对学生成绩冒泡排序，并遍历所有学生信息

        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j <stus.length-1-i ; j++) {
                if(stus[j].score>stus[j+1].score){
                    //如果需要交换，换的是数组元素，Student对象
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }

            }

        }
        //遍历学生数组
        for (int i = 0; i <stus.length ; i++) {
            //System.out.println(stus[i]);输出地址值
            //System.out.println(stus[i].number+","
            //+stus[i].state+","+stus[i].score);显示三列数字有点乱
            System.out.println(stus[i].info());
        }

    }
}

class Student{

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){

        return "，学号"+number+"，年级"+state+"，成绩"+score;
    }
}