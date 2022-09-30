public class Human implements Display{
    private int action;

    @Override
    public void showName(String name) {
        System.out.println("Name " + name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("Age " + age);
    }
}
