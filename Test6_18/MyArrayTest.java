package Test6_18;

import java.util.Arrays;

/**
 * 顺序表
 */
public class MyArrayTest {

    public int[] elem;//null;
    public int userSize;//0

    //构造方法
    public MyArrayTest() {
        this.elem = new int[5];
        this.userSize = 0;
    }

    //在pos位置新增元素
    public void add(int pos,int data) {
        //1.判断pos位置是否合法
        //2.移开pos位置内容  i = this.userSize-1;[i+1] = [i];i--;
        if(pos<0 || pos>this.userSize) {
            System.out.println("该位置不合法！");
            return;
        }

        //扩容
        if(this.userSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for(int i = this.userSize-1;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];

        }
        this.elem[pos] = data;
        this.userSize++;
//        if(pos>0 && pos<userSize) {
//            int i = this.userSize-1;
//            while(i>=pos) {
//                elem[i+1] = elem[i];
//                i--;
//            }
//            elem[pos] = elem[data];
//            userSize++;
//        }


    }

    //打印顺序表
    public void display() {
        for(int i =0;i<this.userSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }


    //判断是否包含某个元素

    public boolean contains(int toFind) {
        for(int i = 0;i<this.userSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }

        return false;

    }

    //查找某个元素对应的位置

    public int search(int toFind) {
        for(int i = 0;i<this.userSize;i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;

    }

    //获取pos的位置

    public int getPos (int pos) {
        if(pos<0 || pos>this.userSize) {
           // System.out.println("该位置不合法！");
            return -1;
        }

        return this.elem[pos];
        //  或
//        for(int i = 0;i<this.userSize;i++) {
//            if(pos == i) {
//                return this.elem[i];
//            }
//        }
//        return -1;

    }

    //给pos位置的值设置为value

    public void setPos(int pos,int value) {
        if(pos<0 || pos>this.userSize) {
            System.out.println("该位置不合法！");
            return;
        }

        this.elem[pos] = value;
//        for(int i = 0;i<this.userSize;i++) {
//            this.elem[pos] = value;
//
//            System.out.println(this.elem[i] + " ");
//        }

    }

    //获取顺序表长度

    public int size() {
        int count = 0;
        for(int i = 0;i<this.userSize;i++) {
            count++;
        }
        return  count;
    }

    //清空顺序表

    /*
    如果数组里面是引用数据类型，光this.userSize = 0是不够的，造成内存泄漏
    我们必须使用循环把数组元素全部置为null
     */
    public void clear() {
        this.userSize = 0;

        //如果数组里面是引用数据类型
//        for(int i = 0;i<this.userSize;i++) {
//            this.elem[i] = null;
//        }
    }


    //删除一个数据
    public void remove(int toRemove) {

        //1.找到是否含有toRemove
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有该数字");
            return;
        }

        for(int i =index;i<this.userSize-1;i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.userSize--;

    }
}
