import java.util.Scanner;
class check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
    
        if(a>b){
            System.out.println(">");
        }
        else if(a<b){
            System.out.println("<");

        }
        else{
            System.out.println("=");
        }
    }
    }   
}