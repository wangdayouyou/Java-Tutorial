package test;

public class Singleton {
    private Singleton(){

    }
    private static class Sin{
        private static final Singleton singleton = new Singleton();
    }
    private enum Single{
        INSTANCE,
        SINGLE;

        private final Singleton singleton;

        Single() {
            singleton = new Singleton();
        }

        public Singleton getSingleton() {
            return singleton;
        }
    }

    private enum wha{
        ;
        private String a;
        private String b;


        public String getA() {
            return a;
        }

        public String getB() {
            return b;
        }
    }
}
