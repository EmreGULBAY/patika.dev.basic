import java.util.*;

public class ticTacToe {
            static ArrayList<Integer> playerPos=new ArrayList<Integer>();
    static ArrayList<Integer> computerPos=new ArrayList<Integer>();
    public static void main(String[] args) {
	        char [][] gameBoard={{' ','|',' ','|',' '},
                                 {'-','+','-','+','-'},
                                 {' ','|',' ','|',' '},
                                 {'-','+','-','+','-'},
                                 {' ','|',' ','|',' '}};
	        printBoard(gameBoard);

                while(true){
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Enter your decision (1-9) :");
                    int dec = scn.nextInt();
                    while(playerPos.contains(dec)||computerPos.contains(dec)){
                        System.out.println("Please enter a valid value");
                        dec = scn.nextInt();
                    }

                    decision(gameBoard, dec, "player");
                    Random random=new Random();
                    if(computerPos.size()+playerPos.size()<9){
                    int compDec= random.nextInt(9)+1;
                    while(playerPos.contains(compDec)||computerPos.contains(compDec)){
                        compDec= random.nextInt(9)+1;
                        }
                        decision(gameBoard, compDec, "computer");
                    }
                    printBoard(gameBoard);
                    String result= checkWinner();
                    if(result.length()>0){
                        System.out.println(result);
                        break;
                    }
                }


    }



    public static void printBoard(char[][] gameBoard){
        for(char []row :gameBoard){
            for(char c:row){
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
    public static void decision(char[][] gameBoard,int dec,String player){
        char symbol=' ';
        if(player.equals("player")){
            symbol='X';
            playerPos.add(dec);
        }
        else if(player.equals("computer")){
            symbol='O';
            computerPos.add(dec);
        }
        switch (dec){
            case 1:
                gameBoard[0][0]=symbol;
                break;
            case 2:
                gameBoard[0][2]=symbol;
                break;
            case 3:
                gameBoard[0][4]=symbol;
                break;
            case 4:
                gameBoard[2][0]=symbol;
                break;
            case 5:
                gameBoard[2][2]=symbol;
                break;
            case 6:
                gameBoard[2][4]=symbol;
                break;
            case 7:
                gameBoard[4][0]=symbol;
                break;
            case 8:
                gameBoard[4][2]=symbol;
                break;
            case 9:
                gameBoard[4][4]=symbol;
                break;
            default:
                System.out.println("Enter valid value!");
                break;


        }

    }
    public static String checkWinner(){
           List topRow=Arrays.asList(1,2,3);
        List middleRow=Arrays.asList(4,5,6);
        List bottomRow=Arrays.asList(7,8,9);
         List leftCol=Arrays.asList(1,4,7);
          List midCol=Arrays.asList(2,5,8);
        List rightCol=Arrays.asList(3,6,9);
        List cross1=Arrays.asList(1,5,9);
        List cross2=Arrays.asList(7,5,3);
            List<List>winCon=new ArrayList<List>();
            winCon.add(topRow);
            winCon.add(middleRow);
            winCon.add(bottomRow);
            winCon.add(leftCol);
            winCon.add(midCol);
            winCon.add(rightCol);
            winCon.add(cross1);
            winCon.add(cross2);
            for(List a:winCon){
               if(playerPos.containsAll(a)){
                   return "Well done!";
               }
               else if(computerPos.containsAll(a))
                   return "Computer wins!";
            }
        if(playerPos.size()+computerPos.size()==9)
            return "It's a tie!";

        return "";
    }
}
