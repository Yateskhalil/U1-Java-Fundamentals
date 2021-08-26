-3,7 +3,10 @@
public class L8 {

    public static void main(String[] args) {
        String name;

        Scanner read = new Scanner(System.in);

        /* String name;
        int hours;
        double payRate;
        double grossPay;
@@ -28,5 +31,40 @@ public static void main(String[] args) {
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        */

        //Bugaboo #1
        /*int age;
        String name;
        System.out.println("What is your age?");
        age = read.nextInt();
        System.out.println("What is your name?");
        name = read.next();
        System.out.println("What is your graduation year");
        int year  = read.nextInt();
        read.nextLine(); //Eats up the hanging carriage return
        System.out.println("Hello " + name + ", you are " + age + " years old!"); */

        //Bugaboo #2 - Tokens
        String firstName;
        String lastName;

        System.out.println("What is you full name with age");
        firstName = read.nextLine();
        lastName = read.next();
        String age = read.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + "you are " + age + " years old.");





    }
}}