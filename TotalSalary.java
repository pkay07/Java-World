package Module1;
import java.util.Scanner;
public class TotalSalary
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double Basic = s.nextDouble();
        char Grade = s.next().charAt(0);

        double hra = 0.2*Basic;
        double da = 0.5*Basic;
        double pf = 0.11*Basic;

       if( Grade == 'A')
        {
            double TotalSalary = Basic + hra + da - pf + 1700;
            System.out.println(Math.round(TotalSalary));
        }
       else if(Grade == 'B')
       {
           double TotalSalary = Basic + hra + da - pf + 1500;
           System.out.println(Math.round(TotalSalary));
       }
       else
       {
           double TotalSalary = Basic + hra + da - pf + 1300;
           System.out.println(Math.round(TotalSalary));

       }

    }

}
