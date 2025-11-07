//Name Akhil Palli
//Date 11/6/2025
//Brief Description: these are a set of patterns created by manipulating loops 
public class Pattern{

    //Precondition: Prints a triangle made of stars
    //Postcondition: Prints a triangle made of stars that iterates by adding 2 more stars to the pattern.
    public static void stars(int rows){
        
        int i = 1;
        int stars = 1;

        while (i <= rows) {
            int j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            stars += 2;
            i++;
        }
    }
        

// num triangle 
    public static void triangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }



// odd num triangle 
      public static void odds(int start) {
        for (int i = start; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


//Max E  ;-; 





//Pyramid 
     public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (rows * 2 - (2 * i - 1)); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        stars(5);


          System.out.println();


        triangle(9);

            System.out.println();

        odds(9);

              System.out.println();
        pyramid(5);

        

    }



//Sorry i  coudlnt get the other one done, time and brain constraint, i wasnt able to complete the whole thing and its my fault.


}