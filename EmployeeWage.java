public class EmployeeWage
{
        public static final int  PRESNT=2;
        public static void main(String[] args)
        {
        int random=(int)Math.floor(Math.random()*10)%3;

                if(random == PRESENT)
                {
                        System.out.println("Employee is PRESENT");
                else
                        System.out.println("Employee is ABSENT");
                }
        }
}
