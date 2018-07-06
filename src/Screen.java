public class Screen {
    private static String bar = "************************************************************";

    public static void displayLogin() {
        System.out.println(bar);
        System.out.println("Please enter your account to login:");
        System.out.println(bar);
        System.out.println("Username: ");
        System.out.println("Password: ");
        System.out.println();
        System.out.println("----------------");
        System.out.println("Not registered yet? Type “Register” and press enter to start the registration process!");
    }

    public static void displayLoginCorrect() {
        System.out.println(bar);
        System.out.println("Welcome to Cornerstone International College of Canada.");
        System.out.println(bar);
    }

    public static void displayLoginWrong() {
        System.out.println(bar);
        System.out.println("Your account does not exist. Please try again!");
        System.out.println(bar);
    }

    public static void displayRegister() {
        System.out.println(bar);
        System.out.println("Welcome to Cornerstone International College of Canada.");
        System.out.println(bar);
    }
    public static void displayMainMenu() {
        System.out.println(bar);
        System.out.println("Select from the options:");
        System.out.println(bar);
        System.out.println("[1] Print my enrolment certificate");
        System.out.println("[2] Print my courses");
        System.out.println("[3] Print my transcript");
        System.out.println("[4] Print my GPA");
        System.out.println("[5] Print my ranking among all students in the college");
        System.out.println("[6] List all available courses");
        System.out.println("[7] List all students");
        System.out.println("[8] Show My Profile");
        System.out.println("[9] Logout");
        System.out.println("[10] Exit");
        System.out.println(bar);
        System.out.println("Enter the number corresponding to each item to proceed:");
    }
    public static void displaySuccessRegister(Student s) {
        System.out.println("Thanks, your account and profile has been created successfully.");
        System.out.print("Welcome Aboard ");
        System.out.print(s.getAccount().getUsername());
        System.out.println(" !");
    }
}
