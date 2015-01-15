/* The following exercises are adapted from:
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through 
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education.
 * ISBN: 978-0-13-285583-9
 */
package assign2.pkg2014f;

import java.util.Scanner;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign22014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [4,9,10,12,16] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 4:
                    doExercise4();
                    break;
                case 9:
                    doExercise9();
                    break;
                case 10:
                    doExercise10();
                    break;
                case 12:
                    doExercise12();
                    break;
                case 16:
                    doExercise16();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #4
     * Write a program that displays the following pattern:
     *     *
     *    ***
     *   *****
     *  *******
     *   *****
     *    ***
     *     *
     *
     * - Gaddis pg. 106
     */
    public static void doExercise4() {
        // TODO: Complete Exercise #4 Below
        System.out.println("   * ");
        System.out.println("  *** ");
        System.out.println(" ***** ");
        System.out.println("******* ");
        System.out.println(" ***** ");
        System.out.println("  *** ");
        System.out.println("   * ");

    }

    /* Exercise #9
     * A car's miles-per-gallon (MPG) can be calculated 
     * with the following formula:
     *   MPG = Miles Driven / Gallons of Gas Used
     * Write a program that asks the user for the number 
     * of miles driven and the gallons of gas used. It 
     * should calculate the car's miles-per-gallon and 
     * display the result on the screen.
     *
     * - Gaddis pg. 106-7
     */
    public static void doExercise9() {
        // TODO: Complete Exercise #9 Below

        float miles, gallons, mpg;

        Scanner s = new Scanner(System.in);

        System.out.println("Numbers of miles Driven:");
        miles = s.nextFloat();

        System.out.println("Gallons of gas used:");
        gallons = s.nextFloat();

        mpg = miles / gallons;

        System.out.println("A car's miles-per-gallon :" + mpg);

    }

    /* Exercise #10
     * Write a program that asks the user to enter three 
     * test scores. The program should display each test 
     * score, as well as the average of the scores.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise10() {
        // TODO: Complete Exercise #10 Below

        int score1, score2, score3;
        float avg;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the score of first test:");
        score1 = in.nextInt();

        System.out.println("Enter the score of second test:");
        score2 = in.nextInt();
        System.out.println("Enter the score of third test:");
        score3 = in.nextInt();

        avg = (score1 + score2 + score3) / 3;
        System.out.println("First test score:" + score1);
        System.out.println("First test score:" + score2);
        System.out.println("First test score:" + score3);
        System.out.println("averege of 3 test:" + avg);
    }

    /* Exercise #12
     * Write a program that asks the user to enter the name 
     * of his or her favourite city. Use a String variable 
     * to store the input. The program should display the 
     * following:
     * - The number of characters in the city name
     * - The name of the city in all uppercase letters
     * - The name of the city in all lowercase letters
     * - The first character in the name of the city
     *
     * - Gaddis pg. 107
     */
    public static void doExercise12() {
        // TODO: Complete Exercise #12 Below
        String city, firstletter = "";
        String cityuppercase, citylowercase = "";

        int length;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your favourite city");
        city = c.next();
        System.out.println("Enter your favourite city:" + city);
        length = city.length();
        System.out.println("Number of character in the city name:" + length);
        cityuppercase = city.toUpperCase();
        System.out.println("Name of the city in upper case:" + cityuppercase);

        citylowercase = city.toLowerCase();
        System.out.println("Name of the city in lower case:" + citylowercase);

        firstletter = String.valueOf(city.charAt(0));
        System.out.println("First character of city:" + firstletter);

    }

    /* Exercise #16
     * Write a program that plays a word game with the 
     * user. The program should ask the user to enter 
     * the following:
     * - His or her name
     * - His or her age
     * - The name of a city
     * - The name of a college
     * - A profession
     * - A type of animal
     * - A pet's name
     * After the user has entered these items, the program 
     * should display the following story, inserting the 
     * user's input into appropriate locations:
     *
     * There once was a person named NAME who lived in CITY. At the age of AGE,
     * NAME went to college at COLLEGE. NAME graduated and went to work as a
     * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both
     * lived happily ever after.
     *
     * - Gaddis pg. 108
     */
    public static void doExercise16() {
        // TODO: Complete Exercise #16 Below
        String name, city, college, profession, animaltype, petname = "";
        int age;

        Scanner story = new Scanner(System.in);

        System.out.println("Enter your name");
        name = story.next();
        System.out.println("Enter your age");
        age = story.nextInt();
        System.out.println("Enter your city");
        city = story.next();
        System.out.println("Enter your college");
        college = story.next();
        System.out.println("Enter your profession");
        profession = story.next();
        System.out.println("Enter your animal type");
        animaltype = story.next();
        System.out.println("Enter your pet's name");
        petname = story.next();

        System.out.println(" There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n"
                + "      " + name + " went to college at " + college + ". " + name + " graduated and went to work as a\n"
                + "     " + profession + ". Then, " + name + " adopted a(n) " + animaltype + " named " + petname + ". They both\n"
                + "      lived happily ever after.");

    }
}
