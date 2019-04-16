import java.lang.String;
import java.util.Scanner;

class Cesar{
    public static void main(String args[]){
        String str_al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text - ");
        String text = in.nextLine();
        text = text.toUpperCase();
        int key = 25;
        char crypt_text[] = new char[text.length()];
        for (int j = 1; j<=25; j++) {
            for (int i = 0; i < text.length(); i++) {
                try{
                    crypt_text[i] = str_al.toCharArray()[(str_al.indexOf(text.toCharArray()[i]) - key) % 26];
                }
                catch(ArrayIndexOutOfBoundsException ex){
                    crypt_text[i] = str_al.toCharArray()[(str_al.indexOf(text.toCharArray()[i]) + key) % 26];
                }

            }
            System.out.println(crypt_text);
            key--;
        }
    }
}

