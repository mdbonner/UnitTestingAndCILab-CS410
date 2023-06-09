public class Main {
    public static void main(String[] args) {
        CILab testString = new CILab();

        testString.setString("Hello");
        System.out.println(testString.getString());
        System.out.println(testString.detectCapitalUse());

    }
}
