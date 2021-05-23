package test523;

public class Girl {

    private String name;
    private  int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        return  this.age - girl.age;
    }

}
