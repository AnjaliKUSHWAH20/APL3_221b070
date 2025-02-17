/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RedHeadDuck();
        Duck ld = new LakeDuck();
        Duck rubber = new RubberDuck();
        Duck wd = new WoodenDuck();

        rd.swim();
        ((Flyable) rd).fly();
        ((Quackable) rd).quack();

        ld.swim();
        ((Flyable) ld).fly();
        ((Quackable) ld).quack();

        rubber.swim();
        ((Quackable) rubber).quack();

        wd.swim();
    }
}
