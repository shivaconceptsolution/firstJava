public class EmpSal
{
    public static void main(String args[])
    {
          float sal=3000;
          float pf;
          if(sal>=15000)
          {
             pf = sal*.12F;
             sal = sal-pf;
             System.out.println("Total PF Deduction is"+pf); 
          } 

         System.out.println("Salary is "+sal);

    }



}
