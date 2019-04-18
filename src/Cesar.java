import java.lang.String;
import java.util.Scanner;

class Cesar{
    public static void main(String args[]){
        String str_al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner in = new Scanner(System.in);
        System.out.println("[1]Decrypt\n[2]Encrypt - ");
        byte mode = in.nextByte();
        in.nextLine();
        if (mode == 1){
            System.out.println("Enter the text - ");
            String text = in.nextLine();
            text = text.toUpperCase();
            int key = 1;
            char decrypt_text[] = new char[text.length()];
            for(int j = 1; j <= 25;j++){
                for (int i = 0; i < text.length(); i++) {
                    if(text.toCharArray()[i] == ' ') {
                        decrypt_text[i] = ' ';
                        continue;
                    }
                    decrypt_text[i] = str_al.toCharArray()[(str_al.indexOf(text.toCharArray()[i]) + key) % 26 ];

                }
                System.out.print(j + " :  ");
                System.out.println(decrypt_text);
                key++;
            }
        }
        else if(mode == 2){
            System.out.println("Enter the text - ");
            String text = in.nextLine();
            System.out.println("Enter the key - ");
            byte key = in.nextByte();
            text = text.toUpperCase();
            char crypt_text[] = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                if(text.toCharArray()[i] == ' ') {
                    crypt_text[i] = ' ';
                    continue;
                }
                crypt_text[i] = str_al.toCharArray()[(str_al.indexOf(text.toCharArray()[i]) + key) % 26 ];
            }
            System.out.print("Encrypted text - ");
            System.out.println(crypt_text);
        }
    }
}

