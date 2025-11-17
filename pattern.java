public class pattern {
    public static void stars(int rows){
        
        for (int i = 1  ; i<= rows ; i++){
            System.out.println();
            for( int j  = 0 ; j <i  ; j++){
                System.out.print("*");
            }
        }
    }

    public static void triangle(int rows){
        for(int i =  1 ; i<= rows ; i++){
            System.out.println();
            for (int j = 0; j < i ; j++){
                System.out.print(i);
            }
        }

    } 

    public static void odds(int start ){
        for (int i = start ; i>0; i =i-2){
          System.out.println();
            for(int j = 0 ; j< i; j++ ){
                System.out.print(i);
            }      
        }
        
    }

    
    public static void eo(int maxE){
        String letter = "";
        if (maxE % 2 == 0)
        {
            System.out.println("********");
            for (int i = 1;i<= maxE; i++){
                //System.out.println( i + " "+ i%2);
                System.out.println();
                if(i%2 == 1) {
                    letter ="O "; 
                    for(int j = 0; i>j ; j++){
                    System.out.print(letter); 
                    }
                }
                 else if(i%2 == 0){
                    letter = "E ";
                    for(int j = 0; i>j ; j++){
                        System.out.print(letter);
                    }
                }
            } 
                
            }
         else{
            System.out.println("********");
                for (int i = 1;i<= maxE; i++){
                        //System.out.println( i + " "+ i%2);
                    System.out.println();
                    if(i%2 == 1) {
                        letter ="E "; 
                        for(int j = 0; i>j ; j++){
                            System.out.print(letter); 
                        }
                    }
                    else if(i%2 == 0){
                        letter = "O ";
                        for(int j = 0; i>j ; j++){
                            System.out.print(letter);
                        }
                    }
                } 
                 
            }
       
        //// dESSSSSSING////
        /// 
        /// 
        /// 
        if (maxE % 2 == 0)
        {
           // System.out.println("********");
            for (int i = (maxE-1);i> 0; i--){
                //System.out.println( i + " "+ i%2);
                System.out.println();
                if(i%2 == 1) {
                    letter ="O "; 
                    for(int j = 0; i>j ; j++){
                    System.out.print(letter); 
                    }
                }
                 else if(i%2 == 0){
                    letter = "E ";
                    for(int j = 0; i>j; j++){
                        System.out.print(letter);
                    }
                }
            } 
                
            }
         else{
            //System.out.println("********");
                for (int i = (maxE-1);i> 0; i--){
                        //System.out.println( i + " "+ i%2);
                    System.out.println();
                    if(i%2 == 1) {
                        letter ="E "; 
                        for(int j = 0; j< i ; j++){
                            System.out.print(letter); 
                        }
                    }
                    else if(i%2 == 0){
                        letter = "O ";
                        for(int j = 0; j< i; j++){
                            System.out.print(letter);
                        }
                    }
                } 
                 
            }
            
    }




    public static void pyramid(int rows){
        for(int i = 0; i< rows; i++){
            for (int j = 0; j < i;j++){
                System.out.print("  ");
            }
            for (int k  = 0; k< ((2*(rows)))-((2*(i))+1); k++ ){
                System.out.print( i + 1 +" ");

            }
            System.out.println();
        }

    
    }

    


    public static void main (String [] args){
        stars(9);
        System.out.println();
        triangle(9);
        System.out.println();
        odds(9);
        System.out.println();
        System.out.println();
        eo(6);
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        pyramid(100);
    }
}