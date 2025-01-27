class Application {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show();  // Calls Mother's static show() due to method hiding
        Child ch = new Child();
        ch.show();  // Calls Child's static show()
    }
}