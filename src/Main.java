import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        System.out.println("This program will guess your last name based on your first name");
        System.out.println("Please enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        String lastName = "Trump";
        if(name.toLowerCase().equals("ben")){
            lastName = "Black";
        }
        else if(name.toLowerCase().equals("alex")  || name.toLowerCase().equals("oleksii")){
            lastName = "Fedorenko";
        }
        else if(name.toLowerCase().equals("zach") ||  name.toLowerCase().equals("zachary")){
            lastName = "Peterson";
        }


        System.out.println("Hmm...let me guess! Your last name is " + lastName + "! Am I correct? ");



    }
}
