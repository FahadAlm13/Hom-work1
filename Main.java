import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Q1) Develop a program that takes the weight (in kilograms) and height (in meters) as
        //input and calculates the BMI, then prints it.
        //• Input: Weight (kg) = 70, Height (m) = 1.75
        //• Expected Output: BMI = 22.86
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your weight : ");
//        double weight = sc.nextDouble();
//
//        System.out.println("Enter your height in meters : ");
//        double height = sc.nextDouble();
//
//        double bmi = weight/(height*height);
//        System.out.println("Your BMI is : " + bmi);

        // Q2) Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        //• Input: Obtained Marks = 85, Total Marks = 100
        //• Expected Output: Percentage = 85.0%

//        System.out.println("Enter your total marks : ");
//        double totalMark = sc.nextDouble();
//        System.out.println("Enter your mark :");
//        double mark = sc.nextDouble();
//
//        double obtainedMark = (mark/totalMark)*100;
//        System.out.println("your percentage is : " + obtainedMark+"%");


        // .Q3) Create a program that takes an amount in one currency and an exchange rate as
        //input, then converts and prints the amount in another currency.
        //• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        //• Expected Output: Amount in EUR = 85.0
//
//        System.out.println("Enter how much want to exchange from USD to EUR : ");
//        double amount = sc.nextDouble();
//        double exchangeRate = 0.85;
//        double total = amount*exchangeRate;
//        System.out.println("Exchange Rate (USD to EUR) =" + exchangeRate);
//        System.out.println("Amount in EUR =" + total);


        // Q4) 4. Create a program that takes a string as input, calculates its length, and then reverses
        //the string using the StringBuilder class, finally printing both the length and reversed
        //string.
        //• Input: "Hello, World!"
        //• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
        //,olleH"

//        System.out.println("Please write your sentence");
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        StringBuilder reverses = sb.reverse();
//        System.out.println("the length is : " + s.length());
//        System.out.println("The reverses is : "+reverses);

        //Q5) . Develop a program that takes a sentence as input and extracts a substring from it,
        //then prints the extracted substring.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
        //= 10, End Index = 20
        //• Expected Output: "brown fox"

//        System.out.println("please enter your sentence ");
//        String sentence = sc.nextLine();
//
//        System.out.println("Please enter the start index:");
//        int startIndex = sc.nextInt();
//        System.out.println("Please enter the end index:");
//        int endIndex = sc.nextInt();
//
//        if (startIndex >= 0 && endIndex <= sentence.length() && startIndex < endIndex) {
//            String substring = sentence.substring(startIndex, endIndex);
//            System.out.println("The extracted substring is: " + substring);
//        } else {
//            System.out.println("Invalid indices.");
//        }

        //Q6) Write a program that takes a sentence and a keyword as input, then check if the
        //keyword is present in the sentence and prints the result.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
        //"jumps"
        //• Expected Output: Keyword "jumps" is present in the sentence

//        System.out.println("Please enter the sentence:");
//        String sentence = sc.nextLine();
//
//        System.out.println("Please enter the keyword:");
//        String keyword = sc.nextLine();
//
//        if (sentence.contains(keyword)) {
//            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
//        } else {
//            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
//        }
//

        //Q7) 7. Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
        //Replace = "fox", Replacement Word = "cat"
        //• Expected Output: "The quick brown cat jumps over the lazy dog"

//        System.out.println("Please enter the sentence:");
//        String sentence = sc.nextLine();
//
//
//        System.out.println("Please enter the word to replace:");
//        String wordToReplace = sc.nextLine();
//
//        System.out.println("Please enter the replacement word:");
//        String replacementWord = sc.nextLine();
//
//        String modifiedSentence = sentence.replace(wordToReplace, replacementWord);
//
//        System.out.println("The modified sentence is: " + modifiedSentence);


        //Q8) Write a program that takes two strings as input and check if they are equal, ignoring
        //the case, then prints whether they are equal or not.
        //• Input: String 1 = "Hello", String 2 = "hello"
        //• Expected Output: Strings are equal (ignoring case).

        System.out.println("Please enter the first string:");
        String string1 = sc.nextLine();

        System.out.println("Please enter the second string:");
        String string2 = sc.nextLine();

        String result = string1.equalsIgnoreCase(string2)
                ? "Strings are equal."
                : "Strings are not equal.";

        System.out.println(result);
    }
   }


