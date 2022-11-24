public class Main {
    public static void main(String[] args) {
        ScopeCheck obj = new ScopeCheck();
        String privateVar = "This is private String";

        System.out.println(obj.getPrivateVar());
        obj.setPrivateVar(12);
        System.out.println(privateVar);
        System.out.println(obj.getPrivateVar());
    }
}