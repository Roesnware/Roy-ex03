import java.util.Scanner;

public class Solution03 {
    /* Quotation marks are often used to denote the start and end of a string.
    But sometimes we need to print out the quotation marks themselves by using escape characters.

    Create a program
    Scanner 'authorInput' = scanner for author
    Scanner 'quoteInput' = scanner for quote
    print 'What is the quote? '
    String 'quote' = scan in string from user for quote using quoteInput scanner
    print 'Who said it? '
    String 'author' = scan in string form user for author using authorInput scanner
    print in one output using println ' 'author' says, \" 'quote' \"'
    use \" to escape the default
    and print the quotes instead of ending print statement quotes*/
    public static void main(String[] args){
        Scanner authorInput = new Scanner(System.in);
        Scanner quoteInput = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = quoteInput.nextLine();
        System.out.print("Who said it? ");
        String author = authorInput.nextLine();
        System.out.println(" "+author+" says, \""+quote+"\"");
    }
}
