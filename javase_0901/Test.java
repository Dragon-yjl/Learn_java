package javase_0901;

import javafx.embed.swt.SWTFXUtils;

import java.util.Arrays;

class Value{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class Test {
    public static void swap(Value v1,Value v2){
        int tmp = v1.getValue();
        v1.setValue(v2.getValue());
        v2.setValue(tmp);

    }
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.setValue(10);
        v2.setValue(20);
        System.out.println(v1.getValue()+" "+v2.getValue());
        swap(v1,v2);
        System.out.println(v1.getValue()+" "+v2.getValue());

    }


    public static void main11(String[] args) {
        for(int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("cool");//cool
    }


    public static void main2(String[] args) {
        System.out.println(Arrays.toString(args));//[]
    }


    public static void main1(String[] args) {
        System.out.println("Hello,Java");
        System.out.println("My name is"+args[0]);//ArrayIndexOutOfBoundsException
    }
}
