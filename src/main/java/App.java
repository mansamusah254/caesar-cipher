import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runCipher = true;

        while (runCipher) {

            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("============================");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

            switch (choice) {
                case "encrypt" -> {
                    System.out.println("To decrypt a message enter the message below");
                    String input = myScanner.nextLine();
                    System.out.println("============================");
                    System.out.println("Enter a key");
                    int key = myScanner.nextInt();
                    System.out.println("============================");
                    Encrypt cipher = new Encrypt(input, key);
                    String encrypted = Encrypt.encrypt(cipher);
                    System.out.println("Encrypted message: " + encrypted);
                    System.out.println("============================");
                    System.out.println("============================");
                    System.out.println("============================");
                }
                case "decrypt" -> {
                    System.out.println("To decrypt a message enter the message below");
                    String sema = myScanner.nextLine();
                    System.out.println("============================");
                    System.out.println("Enter the key you used");
                    int namba = myScanner.nextInt();
                    System.out.println("============================");
                    Decrypt ceaser = new Decrypt(sema, namba);
                    String decrypted = Decrypt.decrypt(ceaser);
                    System.out.println("Decrypted message: " + decrypted);
                    System.out.println("============================");
                    System.out.println("============================");
                    System.out.println("============================");
                }
                case "exit" -> runCipher = false;
            }
        }
    }
}
