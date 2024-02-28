import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");

        String q1 = scan.nextLine();

        if (q1.equals("c")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");

        String q2 = scan.nextLine();

        if (q2.equals("a")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");

        String q3 = scan.nextLine();
        if (q3.equals("d")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");

        String q4 = scan.nextLine();

        if (q4.equals("a") || q4.equals("c")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }
       
        System.out.println("\n5. What national team won the world cup 2022 in Qatar?");
        System.out.println("\ta) France\n\tb) Argentina\n\tc) Brazil\n\td) Japan\n");

        String q5 = scan.nextLine();
        if (q5.equals("b")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n6. Which actor played 'The Grinch'");
        System.out.println("\ta) Adam Smith\n\tb) Jim Carrey\n\tc) Will Smith\n\td) Bradley Copper\n");

        String q6 = scan.nextLine();
        if (q6.equals("b")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n7. What is the biggest country in the world");
        System.out.println("\ta) USA\n\tb) Russia\n\tc) Australia\n\td) China\n");

        String q7 = scan.nextLine();
        if (q7.equals("b")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n8. What is the most popular book in the world?");
        System.out.println("\ta) Holy Bible\n\tb) Dom Queixote\n\tc) The little Prince\n\td) The Republic\n");

        String q8 = scan.nextLine();
        if (q8.equals("a")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n9. What is the first name of 'Trump', former US persident?");
        System.out.println("\ta) George\n\tb) Bill\n\tc) Donald\n\td) Barack\n");

        String q9 = scan.nextLine();
        if (q9.equals("c")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("\n10. What is the first value of the number 'PI'?");
        System.out.println("\ta) 2.31\n\tb) 4.13\n\tc) 4.31\n\td) 3.14\n");

        String q10 = scan.nextLine();
        if (q10.equals("d")) {
            System.out.println("Right Answer"); 
            score += 5;

        } else {
            System.out.println("wrong answer");
        }

        System.out.println("Your final score is: " + score + "/50");

        if (score >= 45) {
            System.out.println("Look at you!!!! You rock!");
        } else if (score >=30) {
            System.out.println("Wow, you know your stuff");            
        } else if (score >= 20) {
            System.out.println("Not bad");
        } else {
            System.out.println("Better luck next time");
        }
        scan.close();

    }
}
