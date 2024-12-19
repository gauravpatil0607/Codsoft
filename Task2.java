package gradecalculator;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input_Student_Info(sc);

        sc.close();
    }
    static void input_Student_Info(Scanner sc){
        System.out.println("\nGive Details to calculate your result\n");

        System.out.print("Enter your name : ");  
        String name = sc.nextLine().trim();      

        System.out.print("Enter your class (In which class do you study,Ex..,9th,10th,11th,12th,only provide neumeric value(If you are in 12th class,provide 12)): ");
        int std = sc.nextInt();       //input you class
        System.out.println();

        System.out.println("Enter your marks of each subject out of 100");

        System.out.print("Mathematics = ");
        int maths = sc.nextInt();                   
        System.out.print("Science = ");
        int sci = sc.nextInt();                    
        System.out.print("Hindi = ");
        int hindi = sc.nextInt();                   
        System.out.print("History = ");
        int history = sc.nextInt();                 
        System.out.print("Political Science = ");
        int polity = sc.nextInt();                   
        System.out.print("Geography = ");
        int geog = sc.nextInt();                

        System.out.println("\n");


        double percent = calculate_percentage(maths,sci,hindi,history,polity,geog); 

        print_Student_Info(name,std,percent,maths,sci,hindi,history,polity,geog); 
    }
    static void total_marks(int maths,int sci,int hindi,int history,int polity,int geog){
        double total = maths + sci + hindi + history + polity + geog;
        System.out.println("Total marks (out of 600) = " + total);
    }
    static double calculate_percentage(int maths,int sci,int hindi,int history,int polity,int geog){
        return (maths + sci + hindi + history + polity + geog)/6;
    }
    static void print_Student_Info(String name,int std,double percent,int maths,int sci,int hindi,int history,int polity,int geog){
        System.out.println("RESULT\n");

        System.out.println("Name : " + name);
        System.out.println("Class : " + std);

        System.out.print("Mathematics = " + maths);
        System.out.println();
        System.out.print("Science = " + sci);
        System.out.println();
        System.out.print("Hindi = " + hindi);
        System.out.println();
        System.out.print("History = " + history);
        System.out.println();
        System.out.print("Political Science = " +polity );
        System.out.println();
        System.out.print("Geography = " + geog);
        System.out.println("\n");

       
        total_marks(maths,sci,hindi,history,polity,geog);

      
        System.out.print("percentage (%) = " + percent + " %");
        System.out.println();

     
        if(percent < 40 )
            System.out.println("Grade : F (Fail)");
        else if(percent < 60 )
            System.out.println("Grade : D");
        else if(percent < 70 )
            System.out.println("Grade : C");
        else if(percent < 80 )
            System.out.println("Grade : B");
        else if(percent < 90 )
            System.out.println("Grade : A");
        else
            System.out.println("Grade : A+");

        System.out.println();

    }
}


