public class MethodOverloadExample {
    public static void main(String[] args) {
        int myIntFromMethod1 = myMethod();
        int myIntFromMethod2 = myMethod(5);

        System.out.println("myIntFromMethod: " + myIntFromMethod1);
        System.out.println("myIntFromMethod(int add): " + myIntFromMethod2);
    }

    public static int myMethod() {
        System.out.println("myMethod()");
        int myInt = 4;
        return myInt;
    }

    public static int myMethod(int add) {
        System.out.println("myMethod(int add)");
        int myInt = 4 + add;
        return myInt;
    }

}
