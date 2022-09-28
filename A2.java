import java.util.Scanner;
public class A2 {
	public static void main(final String[] args){
        //display the rubic cube 

        //write down the method (u,d,r,l,f,b)
    String[][] cube ={
        {
        "r","r","r",
        "r","r","r",
        "r","r","r",
        },
      {
        "b","b","b",
        "b","b","b",
        "b","b","b",
      },
      {
        "o","o","o",
        "o","o","o",
        "o","o","o",
      },
      {
        "g","g","g",
        "g","g","g",
        "g","g","g",
      },

      {
        "y","y","y",
        "y","y","y",
        "y","y","y",
      },

      {
        "w","w","w",
        "w","w","w",
        "w","w","w",
      },
    };
     for(int x = 0; x<6; x++){
        for(int y = 0; y<3; y++){
            for (int z =0; z<3; z++){
                System.out.print(cube[x][z+y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
     }

     Scanner imput =new Scanner(System.in);
     
     System.out.println("Enter a letter to move: ");
     String move = imput.next();
     System.out.println(move);

     if (move == "u")
     {
        String[][] cube1 = {
            {
            "g","g","g",
            "r","r","r",
            "r","r","r",
            },
          {
            "r","r","r",
            "b","b","b",
            "b","b","b",
          },
          {
            "b","b","b",
            "o","o","o",
            "o","o","o",
          },
          {
            "o","o","o",
            "g","g","g",
            "g","g","g",
          },
    
          {
            "y","y","y",
            "y","y","y",
            "y","y","y",
          },
    
          {
            "w","w","w",
            "w","w","w",
            "w","w","w",
          },
        };
        for(int i = 0; i<6; i++){
            for(int j = 0; j<3; j++){
                for (int k =0; k<3; k++){
                    System.out.print(cube1[i][j+k]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
         }


     }//first if statement

    
        if (move == "u'")
        {
           String[][] cube2 = {
               {
               "b","b","b",
               "r","r","r",
               "r","r","r",
               },
             {
               "o","o","o",
               "b","b","b",
               "b","b","b",
             },
             {
               "g","g","g",
               "o","o","o",
               "o","o","o",
             },
             {
               "r","r","r",
               "g","g","g",
               "g","g","g",
             },
       
             {
               "y","y","y",
               "y","y","y",
               "y","y","y",
             },
       
             {
               "w","w","w",
               "w","w","w",
               "w","w","w",
             },
           };
     }//next if statement
     if (move == "d")
     {
        String[][] cube3 = {
            {
            "r","r","r",
            "r","r","r",
            "b","b","b",
            },
          {
            "b","b","b",
            "b","b","b",
            "o","o","o",
          },
          {
            "o","o","o",
            "o","o","o",
            "g","g","g",
          },
          {
            "g","g","g",
            "g","g","g",
            "r","r","r",
          },
    
          {
            "y","y","y",
            "y","y","y",
            "y","y","y",
          },
    
          {
            "w","w","w",
            "w","w","w",
            "w","w","w",
          },
        };

     }//if statement 
     if (move == "d'")
     {
        String[][] cube4 = {
            {
            "r","r","r",
            "r","r","r",
            "g","g","g",
            },
          {
            "b","b","b",
            "b","b","b",
            "r","r","r",
          },
          {
            "o","o","o",
            "o","o","o",
            "b","b","b",
          },
          {
            "g","g","g",
            "g","g","g",
            "o","o","o",
          },
    
          {
            "y","y","y",
            "y","y","y",
            "y","y","y",
          },
    
          {
            "w","w","w",
            "w","w","w",
            "w","w","w",
          },
        };





    
    }





    }

}