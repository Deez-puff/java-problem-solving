public class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        System.out.println("Can Drive: " + (age >= 18 && hasLicense));

        System.out.println("Student Discount: " + (age < 25 || age > 60));

        System.out.println("Not Licensed: " + (!hasLicense));
    }
}
