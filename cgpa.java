import java.util.Scanner;
class CGPA
{
    static int total_grade=0;
    static int total_credit=0;
    void Convert(String grade,int credit)
    {
        int grade_pt=0;
        if(grade.equals("o")||grade.equals("O"))
            grade_pt=10;
        else if(grade.equals("a+")||grade.equals("A+"))
            grade_pt=9;
        else if(grade.equals("a")||grade.equals("A"))
            grade_pt=8;
        else if(grade.equals("b+")||grade.equals("B+"))
            grade_pt=7;
        else if(grade.equals("b")||grade.equals("B"))
            grade_pt=6;
        else if(grade.equals("c")||grade.equals("C"))
            grade_pt=5;
        else
            grade_pt=0;
        total_credit+=credit;
        total_grade+=(grade_pt*credit);
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        CGPA c=new CGPA();
        System.out.print("Enter number of subjects:");
        int no_of_subjects = scan.nextInt();
        for(int i=0;i<no_of_subjects;i++)
        {
                    System.out.print("Enter the Grade of subject :");
                    String grade=scan.next();
                    System.out.print("Enter the Credits :");
                    int credit=scan.nextInt();
                    c.Convert(grade,credit);
        }
        double cgpa=(double) total_grade/total_credit;
        System.out.println("Your CGPA is: "+cgpa);
        scan.close();
    }
}