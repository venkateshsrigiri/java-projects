import java.util.*;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for playing with the computer and 2 for playing with a friend and type 'exit' to exit the game :");
        String a = sc.nextLine();
        while(!a.equals("exit")){
            if(a.equals("1")){

                playbot();
        }
            else if(a.equals("2")){
                System.out.println("User1: ");
                String user1 = sc.nextLine().toLowerCase();
                System.out.println("User2: ");
                String user2 = sc.nextLine().toLowerCase();

                decideWin(user1,user2);

            }
            else{
                System.out.println("Invalid input!! put either 1 or 2 or type 'exit' to exit the game");

                
            }
            System.out.println("Wanna play again?? press 1 for computer,2 for friend or type 'exit' to exit the game:");
            a = sc.nextLine();
            sc.close();

            

        

            }
            System.out.println("Thanks for playing!!");
        }
    public static void playbot(){
        Scanner sc = new Scanner(System.in);
        String[] arr = {"rock","paper","scissors"};
        Random r = new Random();
        int a = r.nextInt(arr.length);
        System.out.println("User1: ");
        String user1 = sc.nextLine();
        System.out.println("User2: "+arr[a]);
        String user2 = arr[a];
        decideWin(user1, user2);
    }
    public static void decideWin(String  user1, String user2){
        if(user1.equals(user2)){
                System.out.println("Draw");
            }
            else if(user1.equals("rock")&& user2.equals("scissors")||user1.equals("paper")&&user2.equals("rock")||user1.equals("scissors")&&user2.equals("paper")){
                System.out.println("User1 wins!!");
            }
            else{
                System.out.println("User2 wins!!");
            }
    }


    
    

       

        
    
    
}
