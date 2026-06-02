import java.util.Scanner;
class Code
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while(T-- >0)
{
int n = sc.nextInt();
int result = (int)Math.sqrt(n);
System.out.println(result);
}
}
}