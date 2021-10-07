package classesAndObjects;

public class Design {

    private interface Run {
        void doSomething();
    }

    private static class Person implements Run {

        @Override
        public void doSomething() {
            System.out.println("C do something");
        }
    }


    private static class X{
        private Run i;

        public X(Run i) {
            this.i = i;
        }

        public void doX() {
            System.out.println("do x");
            i.doSomething();
        }
    }


    public static void main(String[] args) {

        Run i = new Person();
        X x = new X(i);
        x.doX();

        /**
         * do x
         * C do something
         */
    }
}
