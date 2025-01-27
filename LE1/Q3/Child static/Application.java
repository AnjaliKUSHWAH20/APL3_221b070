class Application {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show();  // Calls Mother's non-static show(), Child's static method is not inherited
    }
}