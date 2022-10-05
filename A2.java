import java.util.*;
public class A2 {

  static class GeneratedCube {

    char[] helper = {'r','b','o','g','y','w'};

    char[][][] data = new char[6][3][3];

    ArrayList<String> moves = new ArrayList<>();


    
    public GeneratedCube(){
            
      for(int color = 0;color<this.data.length;color++){
          for(int row = 0;row<this.data[color].length;row++){
              for(int col = 0;col<this.data[color][row].length;col++){
                  this.data[color][row][col] = this.helper[color];
              }
          }
      }
    }

    public char[][][] getCube(){
      return data;
    }

    public void display(){

      for(int color = 0;color<this.data.length;color++){
        for(int row = 0;row<this.data[color].length;row++){
            for(int col = 0;col<this.data[color][row].length;col++){
                System.out.print(this.data[color][row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
      }
    }
  
    public void move(String movement){

      moves.add(movement);

      char[] moveHelper;
      char[] moveHelperSide1;
      char[] moveHelperSide2;

      moveHelper = new char[12];
      moveHelperSide1 = new char[9];
      moveHelperSide2 = new char[9];
      int counter = 0;

      
      int rowReference = 0;
      int colReference = 0;
      if(movement.equals("d") || movement.equals("d\'")){
        rowReference = 2;
      }
      if(movement.equals("r") || movement.equals("r\'")){
        colReference = 2;
      }
      if(movement.equals("f") || movement.equals("b\'")){
        colReference = 2;
      }
      


    
      if(movement.equals("u") || movement.equals("d\'") || movement.equals("d") || movement.equals("u\'")){
        
        for(int color = 0; color < (this.data.length - 2); color++){
            for(int col = 0;col < this.data[color][rowReference].length; col++){

              moveHelper[counter] = this.data[color][rowReference][col];

              counter++;
            } 
        }

        
        counter = 0;
        for(int color = 0; color < (this.data.length - 2); color++){
          for(int col = 0;col < this.data[color][rowReference].length; col++){
            if (movement.equals("u") || movement.equals("d\'")){
              if ((counter - 3) == -3){
                this.data[color][rowReference][col] = moveHelper[9];
              }
              else if ((counter - 3) == -2){
                this.data[color][rowReference][col] = moveHelper[10];
              }
              else if ((counter - 3) == -1){
                this.data[color][rowReference][col] = moveHelper[11];
              }
              else {
                this.data[color][rowReference][col] = moveHelper[counter - 3];
              }
            }
            else if(movement.equals("d") || movement.equals("u\'")){
              if ((counter + 3) == 14){
                this.data[color][rowReference][col] = moveHelper[2];
              }
              else if ((counter + 3) == 13){
                this.data[color][rowReference][col] = moveHelper[1];
              }
              else if ((counter + 3) == 12){
                this.data[color][rowReference][col] = moveHelper[0];
              }
              else {
                this.data[color][rowReference][col] = moveHelper[counter + 3];
              }
            }
            

            counter++;
          } 
        }
        
        int sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide1[sideCounter] = this.data[4][row][col];
          
            sideCounter++;
          }
        }
        sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide2[sideCounter] = this.data[5][row][col];
          
            sideCounter++;
          }
        }

        
        if(movement.equals("u")){
          this.data[4][0][2] = moveHelperSide1[0];
          this.data[4][1][2] = moveHelperSide1[1];
          this.data[4][2][2] = moveHelperSide1[2];
          this.data[4][0][1] = moveHelperSide1[3];
          this.data[4][1][1] = moveHelperSide1[4];
          this.data[4][2][1] = moveHelperSide1[5];
          this.data[4][0][0] = moveHelperSide1[6];
          this.data[4][1][0] = moveHelperSide1[7];
          this.data[4][2][0] = moveHelperSide1[8];
        }
        else if(movement.equals("u\'")){
          this.data[4][2][0] = moveHelperSide1[0];
          this.data[4][1][0] = moveHelperSide1[1];
          this.data[4][0][0] = moveHelperSide1[2];
          this.data[4][2][1] = moveHelperSide1[3];
          this.data[4][1][1] = moveHelperSide1[4];
          this.data[4][0][1] = moveHelperSide1[5];
          this.data[4][2][2] = moveHelperSide1[6];
          this.data[4][1][2] = moveHelperSide1[7];
          this.data[4][0][2] = moveHelperSide1[8];
        }
        if(movement.equals("d")){
          this.data[5][0][2] = moveHelperSide2[0];
          this.data[5][1][2] = moveHelperSide2[1];
          this.data[5][2][2] = moveHelperSide2[2];
          this.data[5][0][1] = moveHelperSide2[3];
          this.data[5][1][1] = moveHelperSide2[4];
          this.data[5][2][1] = moveHelperSide2[5];
          this.data[5][0][0] = moveHelperSide2[6];
          this.data[5][1][0] = moveHelperSide2[7];
          this.data[5][2][0] = moveHelperSide2[8];
        }
        else if(movement.equals("d\'")){
          this.data[5][2][0] = moveHelperSide2[0];
          this.data[5][1][0] = moveHelperSide2[1];
          this.data[5][0][0] = moveHelperSide2[2];
          this.data[5][2][1] = moveHelperSide2[3];
          this.data[5][1][1] = moveHelperSide2[4];
          this.data[5][0][1] = moveHelperSide2[5];
          this.data[5][2][2] = moveHelperSide2[6];
          this.data[5][1][2] = moveHelperSide2[7];
          this.data[5][0][2] = moveHelperSide2[8];
        }
      }

      

      


      
      if(movement.equals("l") || movement.equals("r\'") || movement.equals("r") || movement.equals("l\'")){
        counter = 0;
       
        for(int color = 0; color < (this.data.length); color++){
            if(color != 1 && color != 3){
              for(int row = 0; row < this.data[color][rowReference].length; row++){

                moveHelper[counter] = this.data[color][row][colReference];

                counter++;
              } 
          }
        }

        
        counter = 0;
        for(int color = 0; color < (this.data.length); color++){
            if(color != 1 && color != 3){
              for(int row = 0; row < this.data[color][rowReference].length; row++){
                if(movement.equals("l") || movement.equals("r\'")){
                  switch (counter) {
                    case 0:
                      this.data[color][row][colReference] = moveHelper[8];
                      break;
                    case 1:
                      this.data[color][row][colReference] = moveHelper[7];
                      break;
                    case 2:
                      this.data[color][row][colReference] = moveHelper[6];
                      break;
                    case 3:
                      this.data[color][row][colReference] = moveHelper[11];
                      break;
                    case 4:
                      this.data[color][row][colReference] = moveHelper[10];
                      break;
                    case 5:
                      this.data[color][row][colReference] = moveHelper[9];
                      break;
                    case 6:
                      this.data[color][row][colReference] = moveHelper[5];
                      break;
                    case 7:
                      this.data[color][row][colReference] = moveHelper[4];
                      break;
                    case 8:
                      this.data[color][row][colReference] = moveHelper[3];
                      break;
                    case 9:
                      this.data[color][row][colReference] = moveHelper[2];
                      break;
                    case 10:
                      this.data[color][row][colReference] = moveHelper[1];
                      break;
                    case 11:
                      this.data[color][row][colReference] = moveHelper[0];
                      break;
                  }
                }
                else if(movement.equals("r") || movement.equals("l\'")){
                  switch (counter) {
                    case 0:
                      this.data[color][row][colReference] = moveHelper[11];
                      break;
                    case 1:
                      this.data[color][row][colReference] = moveHelper[10];
                      break;
                    case 2:
                      this.data[color][row][colReference] = moveHelper[9];
                      break;
                    case 3:
                      this.data[color][row][colReference] = moveHelper[8];
                      break;
                    case 4:
                      this.data[color][row][colReference] = moveHelper[7];
                      break;
                    case 5:
                      this.data[color][row][colReference] = moveHelper[6];
                      break;
                    case 6:
                      this.data[color][row][colReference] = moveHelper[2];
                      break;
                    case 7:
                      this.data[color][row][colReference] = moveHelper[1];
                      break;
                    case 8:
                      this.data[color][row][colReference] = moveHelper[0];
                      break;
                    case 9:
                      this.data[color][row][colReference] = moveHelper[5];
                      break;
                    case 10:
                      this.data[color][row][colReference] = moveHelper[4];
                      break;
                    case 11:
                      this.data[color][row][colReference] = moveHelper[3];
                      break;
                  }
                }
                counter ++;
              } 
            }
          
        }
        
        int sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide1[sideCounter] = this.data[1][row][col];
          
            sideCounter++;
          }
        }
        sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide2[sideCounter] = this.data[3][row][col];
          
            sideCounter++;
          }
        }

        
        if(movement.equals("l")){
          this.data[1][0][2] = moveHelperSide1[0];
          this.data[1][1][2] = moveHelperSide1[1];
          this.data[1][2][2] = moveHelperSide1[2];
          this.data[1][0][1] = moveHelperSide1[3];
          this.data[1][1][1] = moveHelperSide1[4];
          this.data[1][2][1] = moveHelperSide1[5];
          this.data[1][0][0] = moveHelperSide1[6];
          this.data[1][1][0] = moveHelperSide1[7];
          this.data[1][2][0] = moveHelperSide1[8];
        }
        else if(movement.equals("l\'")){
          this.data[1][2][0] = moveHelperSide1[0];
          this.data[1][1][0] = moveHelperSide1[1];
          this.data[1][0][0] = moveHelperSide1[2];
          this.data[1][2][1] = moveHelperSide1[3];
          this.data[1][1][1] = moveHelperSide1[4];
          this.data[1][0][1] = moveHelperSide1[5];
          this.data[1][2][2] = moveHelperSide1[6];
          this.data[1][1][2] = moveHelperSide1[7];
          this.data[1][0][2] = moveHelperSide1[8];
        }
        if(movement.equals("r")){
          this.data[3][0][2] = moveHelperSide2[0];
          this.data[3][1][2] = moveHelperSide2[1];
          this.data[3][2][2] = moveHelperSide2[2];
          this.data[3][0][1] = moveHelperSide2[3];
          this.data[3][1][1] = moveHelperSide2[4];
          this.data[3][2][1] = moveHelperSide2[5];
          this.data[3][0][0] = moveHelperSide2[6];
          this.data[3][1][0] = moveHelperSide2[7];
          this.data[3][2][0] = moveHelperSide2[8];
        }
        else if(movement.equals("r\'")){
          this.data[3][2][0] = moveHelperSide2[0];
          this.data[3][1][0] = moveHelperSide2[1];
          this.data[3][0][0] = moveHelperSide2[2];
          this.data[3][2][1] = moveHelperSide2[3];
          this.data[3][1][1] = moveHelperSide2[4];
          this.data[3][0][1] = moveHelperSide2[5];
          this.data[3][2][2] = moveHelperSide2[6];
          this.data[3][1][2] = moveHelperSide2[7];
          this.data[3][0][2] = moveHelperSide2[8];
        }

      }

      
      if(movement.equals("f") || movement.equals("b\'") || movement.equals("b") || movement.equals("f\'")){
        counter = 0;
        
        for(int color = 0; color < (this.data.length); color++){
            if(color != 0 && color != 2){
              if(movement.equals("f") || movement.equals("f\'")){
                if(color == 1){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    moveHelper[counter] = this.data[color][row][2];
                    counter++;
                  } 
                }
                else if(color == 3){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    moveHelper[counter] = this.data[color][row][0];
                    counter++;
                  } 
                }
                else if(color == 4){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    moveHelper[counter] = this.data[color][2][col];
                    counter++;
                  } 
                }
                else if(color == 5){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    moveHelper[counter] = this.data[color][0][col];
                    counter++;
                  } 
                }
              }
              if(movement.equals("b") || movement.equals("b\'")){
                if(color == 1){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    moveHelper[counter] = this.data[color][row][0];
                    counter++;
                  } 
                }
                else if(color == 3){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    moveHelper[counter] = this.data[color][row][2];
                    counter++;
                  } 
                }
                else if(color == 4){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    moveHelper[counter] = this.data[color][0][col];
                    counter++;
                  } 
                }
                else if(color == 5){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    moveHelper[counter] = this.data[color][2][col];
                    counter++;
                  } 
                }
              }
              
          }
          
        }

        
        counter = 0;
        for(int color = 0; color < (this.data.length); color++){
            if(color != 0 && color != 2){
              if(movement.equals("f") || movement.equals("f\'")){
                if(color == 1){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    if(movement.equals("f\'")){
                      switch (counter) {
                        case 0:
                          this.data[color][row][2] = moveHelper[8];
                          break;
                        case 1:
                          this.data[color][row][2] = moveHelper[7];
                          break;
                        case 2:
                          this.data[color][row][2] = moveHelper[6];
                          break;
                      }
                    }
                    else if(movement.equals("f")){
                      switch (counter) {
                        case 0:
                          this.data[color][row][2] = moveHelper[9];
                          break;
                        case 1:
                          this.data[color][row][2] = moveHelper[10];
                          break;
                        case 2:
                          this.data[color][row][2] = moveHelper[11];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 3){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    if(movement.equals("f\'")){
                      switch (counter) {
                        case 3:
                          this.data[color][row][0] = moveHelper[11];
                          break;
                        case 4:
                          this.data[color][row][0] = moveHelper[10];
                          break;
                        case 5:
                          this.data[color][row][0] = moveHelper[9];
                          break;
                      }
                    }
                    else if(movement.equals("f")){
                      switch (counter) {
                        case 3:
                          this.data[color][row][0] = moveHelper[6];
                          break;
                        case 4:
                          this.data[color][row][0] = moveHelper[7];
                          break;
                        case 5:
                          this.data[color][row][0] = moveHelper[8];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 4){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    if(movement.equals("f\'")){
                      switch (counter) {
                        case 6:
                          this.data[color][2][col] = moveHelper[3];
                          break;
                        case 7:
                          this.data[color][2][col] = moveHelper[4];
                          break;
                        case 8:
                          this.data[color][2][col] = moveHelper[5];
                          break;
                      }
                    }
                    if(movement.equals("f")){
                      switch (counter) {
                        case 6:
                          this.data[color][2][col] = moveHelper[2];
                          break;
                        case 7:
                          this.data[color][2][col] = moveHelper[1];
                          break;
                        case 8:
                          this.data[color][2][col] = moveHelper[0];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 5){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    if(movement.equals("f\'")){
                      switch (counter) {
                        case 9:
                          this.data[color][0][col] = moveHelper[0];
                          break;
                        case 10:
                          this.data[color][0][col] = moveHelper[1];
                          break;
                        case 11:
                          this.data[color][0][col] = moveHelper[2];
                          break;
                      }
                    }
                    if(movement.equals("f")){
                      switch (counter) {
                        case 9:
                          this.data[color][0][col] = moveHelper[5];
                          break;
                        case 10:
                          this.data[color][0][col] = moveHelper[4];
                          break;
                        case 11:
                          this.data[color][0][col] = moveHelper[3];
                          break;
                      }
                    }
                    counter++;
                  }
                }
              }
              if(movement.equals("b") || movement.equals("b\'")){
                if(color == 1){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    if(movement.equals("b")){
                      switch (counter) {
                        case 0:
                          this.data[color][row][0] = moveHelper[8];
                          break;
                        case 1:
                          this.data[color][row][0] = moveHelper[7];
                          break;
                        case 2:
                          this.data[color][row][0] = moveHelper[6];
                          break;
                      }
                    }
                    else if(movement.equals("b\'")){
                      switch (counter) {
                        case 0:
                          this.data[color][row][0] = moveHelper[9];
                          break;
                        case 1:
                          this.data[color][row][0] = moveHelper[10];
                          break;
                        case 2:
                          this.data[color][row][0] = moveHelper[11];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 3){
                  for(int row = 0; row < this.data[color][rowReference].length; row++){
                    if(movement.equals("b")){
                      switch (counter) {
                        case 3:
                          this.data[color][row][2] = moveHelper[11];
                          break;
                        case 4:
                          this.data[color][row][2] = moveHelper[10];
                          break;
                        case 5:
                          this.data[color][row][2] = moveHelper[9];
                          break;
                      }
                    }
                    else if(movement.equals("b\'")){
                      switch (counter) {
                        case 3:
                          this.data[color][row][2] = moveHelper[6];
                          break;
                        case 4:
                          this.data[color][row][2] = moveHelper[7];
                          break;
                        case 5:
                          this.data[color][row][2] = moveHelper[8];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 4){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    if(movement.equals("b")){
                      switch (counter) {
                        case 6:
                          this.data[color][0][col] = moveHelper[3];
                          break;
                        case 7:
                          this.data[color][0][col] = moveHelper[4];
                          break;
                        case 8:
                          this.data[color][0][col] = moveHelper[5];
                          break;
                      }
                    }
                    if(movement.equals("b\'")){
                      switch (counter) {
                        case 6:
                          this.data[color][0][col] = moveHelper[2];
                          break;
                        case 7:
                          this.data[color][0][col] = moveHelper[1];
                          break;
                        case 8:
                          this.data[color][0][col] = moveHelper[0];
                          break;
                      }
                    }
                    counter++;
                  }
                }
                if(color == 5){
                  for(int col = 0; col < this.data[color][rowReference].length; col++){
                    if(movement.equals("b")){
                      switch (counter) {
                        case 9:
                          this.data[color][2][col] = moveHelper[0];
                          break;
                        case 10:
                          this.data[color][2][col] = moveHelper[1];
                          break;
                        case 11:
                          this.data[color][2][col] = moveHelper[2];
                          break;
                      }
                    }
                    if(movement.equals("b\'")){
                      switch (counter) {
                        case 9:
                          this.data[color][2][col] = moveHelper[5];
                          break;
                        case 10:
                          this.data[color][2][col] = moveHelper[4];
                          break;
                        case 11:
                          this.data[color][2][col] = moveHelper[3];
                          break;
                      }
                    }
                    counter++;
                  }
                }
              }
            }
        }
        
        int sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide1[sideCounter] = this.data[0][row][col];
          
            sideCounter++;
          }
        }
        sideCounter = 0;
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){

            moveHelperSide2[sideCounter] = this.data[2][row][col];
          
            sideCounter++;
          }
        }

        
        if(movement.equals("f")){
          this.data[0][0][2] = moveHelperSide1[0];
          this.data[0][1][2] = moveHelperSide1[1];
          this.data[0][2][2] = moveHelperSide1[2];
          this.data[0][0][1] = moveHelperSide1[3];
          this.data[0][1][1] = moveHelperSide1[4];
          this.data[0][2][1] = moveHelperSide1[5];
          this.data[0][0][0] = moveHelperSide1[6];
          this.data[0][1][0] = moveHelperSide1[7];
          this.data[0][2][0] = moveHelperSide1[8];
        }
        else if(movement.equals("f\'")){
          this.data[0][2][0] = moveHelperSide1[0];
          this.data[0][1][0] = moveHelperSide1[1];
          this.data[0][0][0] = moveHelperSide1[2];
          this.data[0][2][1] = moveHelperSide1[3];
          this.data[0][1][1] = moveHelperSide1[4];
          this.data[0][0][1] = moveHelperSide1[5];
          this.data[0][2][2] = moveHelperSide1[6];
          this.data[0][1][2] = moveHelperSide1[7];
          this.data[0][0][2] = moveHelperSide1[8];
        }
        if(movement.equals("b")){
          this.data[2][0][2] = moveHelperSide2[0];
          this.data[2][1][2] = moveHelperSide2[1];
          this.data[2][2][2] = moveHelperSide2[2];
          this.data[2][0][1] = moveHelperSide2[3];
          this.data[2][1][1] = moveHelperSide2[4];
          this.data[2][2][1] = moveHelperSide2[5];
          this.data[2][0][0] = moveHelperSide2[6];
          this.data[2][1][0] = moveHelperSide2[7];
          this.data[2][2][0] = moveHelperSide2[8];
        }
        else if(movement.equals("b\'")){
          this.data[2][2][0] = moveHelperSide2[0];
          this.data[2][1][0] = moveHelperSide2[1];
          this.data[2][0][0] = moveHelperSide2[2];
          this.data[2][2][1] = moveHelperSide2[3];
          this.data[2][1][1] = moveHelperSide2[4];
          this.data[2][0][1] = moveHelperSide2[5];
          this.data[2][2][2] = moveHelperSide2[6];
          this.data[2][1][2] = moveHelperSide2[7];
          this.data[2][0][2] = moveHelperSide2[8];
        }
      }

    }
  
  }

    public static void main(final String[] args){
      GeneratedCube theCube = new GeneratedCube();
      GeneratedCube solvedCube = new GeneratedCube();

      
      Scanner userInput = new Scanner(System.in); 


      
      String[] scrambleHelper = {"u", "d", "l", "r", "f", "b", "d\'", "l\'", "u\'", "f\'", "r\'", "r\'", "b\'"};
      
      for(int scrambleInput = 0; scrambleInput < scrambleHelper.length; scrambleInput++){
        theCube.move(scrambleHelper[scrambleInput]);
      }

      boolean cubeSolved = false;
      boolean argsFailed = false;

      

    
      if(args.length > 0){
        for(String i: args){
            if(i.equals("u") || i.equals("u\'") || i.equals("d") || i.equals("d\'") ||
            i.equals("l") || i.equals("l\'") || i.equals("r") || i.equals("r\'") ||
            i.equals("f") || i.equals("f\'") || i.equals("b") || i.equals("b\'")){
              String input = i;
              theCube.move(input);
            }
            else{
                System.err.println(i + " is not the right code  for this program!\n");
                argsFailed = true;
                break;
            }

            if(theCube.equals(solvedCube)){
              cubeSolved = true;
            }
        }
      }

    theCube.display();

    if(argsFailed == true) {
      System.out.println("You did type a the right code  for the cube!");
      System.exit(0);
    }

    while(cubeSolved == false){
      System.out.println("The possible commands are u, u', d, d', l, l', r, r', f, f', b, b' or s to show how to solve (input anything else to see the cube): ");
      String command = userInput.nextLine(); 
      System.out.println();
    
      if(command.equals("u") || command.equals("u\'") || command.equals("d") || command.equals("d\'") ||
      command.equals("l") || command.equals("l\'") || command.equals("r") || command.equals("r\'") ||
      command.equals("f") || command.equals("f\'") || command.equals("b") || command.equals("b\'")){
        theCube.move(command);
      }
      else if(command.equals("s")){
        System.out.println();
        for (int i = theCube.moves.size(); i > 0; i--) {
            
            if(theCube.moves.get(i-1).contains("'")){
                System.out.print(theCube.moves.get(i-1).substring(0, theCube.moves.get(i-1).length() - 1)+" ");
            }
            else{
                System.out.print(theCube.moves.get(i-1)+"' ");
            }
            theCube.moves.remove(i-1);
        }
        System.out.println();
      }
      else {
        theCube.display();
      }

      if(java.util.Arrays.deepEquals(theCube.getCube(), solvedCube.getCube())){
        cubeSolved = true;
      }
      
    }

    if(cubeSolved == true){
      System.out.println("You solved the cube!");
      System.exit(0);
    }


  }
}
