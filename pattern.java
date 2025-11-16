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
        String capE = "E";
        String capO = "O";
        if(maxE%2==0){
            System.out.println(capE);
            for(int i =0 ; i< maxE ;i++){
            }
        }
        else {
            for (int i = 0;i < maxE ;i++){}
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
    }
}