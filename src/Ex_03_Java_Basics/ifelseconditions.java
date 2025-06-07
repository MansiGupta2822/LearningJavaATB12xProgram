package Ex_03_Java_Basics;

public class ifelseconditions {
    public static void main(String[] args) {
        //Write a Java program that checks if a person is eligible to vote.

        int age=20;
        if (age>=18)
            System.out.println("Eligible for vote");
        else
            System.out.println("not eligible for vote");

        //Determine a student's grade based on their score.

        int score=80;

        if (score>=90)
         {
             System.out.println("Grade: A");
         }
         else if(score>=80 && score<=89)
        {
            System.out.println("Grade B");
        }
         else if(score>=70 && score<=79)
        {
            System.out.println("Grade C");
        }
          else if(score>=60 && score<=69)
        {
            System.out.println("Grade D");
        }
          else if(score<60)
        {
            System.out.println("Grade F");
        }
         else{
            System.out.println("fail");
       }

//Write a Java program for ifelse check

         String username="admin";
         String password="password123";
         String inputusername="admin";
         String inputpassword= "password123";

         if (!inputusername.equals(username))
         {
             System.out.println("invalid username");
         }
         else if (!inputpassword.equals(password))
         {
             System.out.println("invalid password");
         }
         else
         {
             System.out.println("Login Successful");
         }

         //OR
        String username1="admin";
        String password1="password123";
        String inputusername1="admin";
        String inputpassword1= "Password123";

        boolean isusernamecorrect= inputusername1.equals(username1);
        boolean ispasswordcorrect= inputpassword1.equals(password1);

        if (isusernamecorrect && ispasswordcorrect)
        {
            System.out.println("Login Successful");
        }
        else if (!isusernamecorrect && !ispasswordcorrect)
        {
            System.out.println("invalid username or passward");
        }
        else if (!ispasswordcorrect)
        {
            System.out.println("invalid password");
        }
        else
        {
            System.out.println("invalid username");
        }



    }
}




