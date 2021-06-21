package ArrayList6_21;


import java.util.Arrays;

/**
 * 顺序表
 * 是一种数据结构，底层是由数组构成的
 * 数据结构是用来描述数据的组织方式
 */

public class MyArrayList {

    public int[] elem;//底层数组  null
    public int usedSize;//有效的数据个数

    //构造方法
    public MyArrayList() {
        this.elem = new int[5];//定义底层数组长度
        this.usedSize = 0;//有效数据0个
    }

    /**
     * 打印顺序表
     */

    public void display() {
        for(int i = 0;i<usedSize;i++) {
            System.out.print(elem[i]+" ");
        }

        System.out.println();
    }

    /**\
     * pos位置添加元素
     * @param pos 要添加元素的位置
     * @param data  要添加的元素
     *
     *  1.判断pos位置是否合法
     *  2.如果pos位置已经有数据，我们需要移开pos位置的元素，然后添加进去，整体往后移一个位置
     */

    public void add(int pos,int data) {

        if(pos < 0 || pos >this.usedSize) {//pos位置不合适，不在则个顺序表范围之内
            System.out.println("插入位置不合法");
            return;
        }

        //给顺序表扩容
        if(this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);

        }


        //让顺序表从后面开始遍历，从最后面到pos位置的元素整体往后移一个位置
        for(int i = this.usedSize-1;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];//吧前一个位置的数据赋值给后面一个数据，吧pos位置空出来
        }

        this.elem[pos] = data;//pos位置空出来之后，吧data数据赋值给pos位置
        usedSize++;//pos位置赋上值之后，顺序表的有效数据就多了一个，所以++


    }

    /**
     * 判断顺序表中是否包含了这个元素
     * @param toFind 找这个元素
     * @return 找到返回true、找不到返回false
     */
    public boolean contains(int toFind) {

        for(int i = 0;i<usedSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }

        return false;

    }

    /**
     * 查找某个元素对应的位置
     * @param toFind 元素
     * @return 找到返回该位置，找不到返回-1
     */

    public int search(int toFind) {

        for(int i = 0;i<usedSize;i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }

        return -1;

    }


    /**
     * 获取pos位置的元素
     * @param pos 位置
     * @return 找得到返回pos位置上的这个元素，找不到返回-1
     */
    public int getPos(int pos) {
        if(pos < 0 || pos > usedSize-1) {
            //pos>usedSize的话，有效数据为6的话，pos最大只能取到5，当pos为6，就会返回第七个无效数据0
            return -1;
        }

        return this.elem[pos];
    }


    /**
     * 给pos位置的值设置为value
     * @param pos  pos位置
     * @param value 改之后的值
     *
     */
    public void setPos(int pos,int value) {

        if(pos < 0 || pos > usedSize-1) {
            //pos>usedSize的话，有效数据为6的话，pos最大只能取到5，当pos为6，就会返回第七个无效数据0
            System.out.println("该位置不合法!");

        }

        this.elem[pos] = value;
    }


    /**
     * 获取顺序表长度
     * @return 返回长度
     */
    public int size() {

        int count = 0;
        for(int i = 0;i<usedSize;i++) {
            count++;
        }

        return count;
    }


    /**
     * 清空顺序表
     * 如果顺序表底层数组里面是引用数据类型，光使有效数据为0的话会造成内存泄漏
     * 就需要循环遍历顺序表然后置为null
     */
    public void clear() {

        this.usedSize = 0;

        //如果是引用数据类型
//        for(int i = 0;i < this.usedSize;i++) {
//            this.elem[i] =null;
//        }
    }


    /**
     * 删除toRemove这个值
     * @param toRemove 需要删除的第一次出现的值
     */

    public void remove(int toRemove) {
        //1.找到toRemove所在位置
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有该数字！ ");
            return;
        }

        for(int i = index;i<this.usedSize-1;i++) {
            this.elem[i] = this.elem[i+1];
        }

        this.usedSize--;
    }
}
