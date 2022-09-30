public class Animal implements Display{
    @Override
    public void showName(String name) {
        System.out.println("Animal's Name " + name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("Animal's Age " + age);
    }
}
