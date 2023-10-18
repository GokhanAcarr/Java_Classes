import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        if(word.length()>=3){
            String firstThereLetter=word.substring(0,3);
            System.out.println("First 3 letter of the word is: "+firstThereLetter);
        }
        else{
            int k=word.length();
            System.out.print(word);
            for(int i=0;i<3-k;i++){
                System.out.print("#");
            }
        }



    }
}