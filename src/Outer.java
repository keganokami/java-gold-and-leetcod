public class Outer {
    private String message = "Hello";
    class Inner {
        String str = "a";
        public void test() {
            System.out.println(message + str);
        }
    }
}