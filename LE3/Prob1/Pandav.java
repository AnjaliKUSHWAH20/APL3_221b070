abstract class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println(getClass().getSimpleName() + " is a great fighter.");
    }

    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }

    void kind() {
        System.out.println(getClass().getSimpleName() + " is kind.");
    }
}