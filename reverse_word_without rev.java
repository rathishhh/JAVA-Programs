import java.util.Scanner;
class reverse_word_without rev
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence: ");
String str = sc.nextLine();
String[] word = str.split(" ");
for(String n : word)
{
for(int i = n.length() - 1; i >= 0; i--)
{
System.out.print(n.charAt(i)+ " ");
}
}
}
}