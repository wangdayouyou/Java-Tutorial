package test;

public class TestA implements defaultT {
    @Override
    public void a() {
        System.out.println("fdff");
    }

    public static void main(String[] args) {
        TestA a = new TestA();
        a.a();
    }
}
