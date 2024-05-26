
class MyOtherClass {

    public int myMethod() {
        int i = 10;
        i = i * 10;
        return i;

    }

}

public class MyClass {

    public static void main(String[] args) {
        MyOtherClass mOC = new MyOtherClass();
        System.out.println(mOC.myMethod());
    }

}