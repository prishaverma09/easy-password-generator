//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 12;
        if (args.length > 0) {
            try {
                length = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid length provided. Using default: 12");
            }
        }

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        System.out.println("\n==================================");
        System.out.println(" Generated Password: " + password.toString());
        System.out.println("==================================\n");
    }
}

