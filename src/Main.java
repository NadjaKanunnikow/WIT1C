import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        String name = "Nadja";
//        final String DATEN_SATZ = "lALELEU";
//        int age = 33;
//        double happyNumber = 10.5;
//        boolean isGameOver = false;
//        char character = 'a';
//        char character2 = 'b';
//        int resultChars = character + character2;
//        System.out.println(resultChars);
//
//
//        //System.out.printf("Hello and welcome!");
//        System.out.println("Hallo" + name + "djhgfkjhdgkj");
//        System.out.println("lerjlerkl");
//        System.out.println("test " + (char) resultChars);
//
//
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//        System.out.printf("Wie heißt Du?\n");
//        name = reader.readLine();
//        System.out.printf("Wie alt bist Du?\n");
//        age = Integer.parseInt(reader.readLine());
//        System.out.printf("Was ist Deine Glückszahl?\n");
//        happyNumber = Double.parseDouble(reader.readLine());
//        System.out.printf("Hallo %s. ", name);
//        System.out.printf("Du bist %s Jahre alt. ", age);
//        System.out.printf("Deine Glückszahl ist %s: ", happyNumber);

        // SCANNER

//        Scanner s = new Scanner(System.in);
//        name = s.nextLine();
//        age = s.nextInt();
//        happyNumber = s.nextDouble();
//        //System.out.printf("Hallo " + name + ". Du bist " + age + " Jahre alt. Deine Glückszahl ist " + happyNumber);
//        System.out.printf("Hallo %s, Du bist %d Jahre alt und Deine Glückszahl ist %f.1", name, age, happyNumber);

        Scanner s = new Scanner(System.in);
        System.out.printf("Zahl von 2 bis 9:\n");
        int numberZahl = s.nextInt();
        int numberMatrix = 99;
        int schleife = 9;
        int z = 0;
        for (int i = 0; i <= numberMatrix; i++) {
            String stringZahl = Integer.toString(i);
            if (stringZahl.length() == 1) {
                stringZahl += " ";
            }
            String numberZahlString = Integer.toString(numberZahl);
            for (int h = 0; h < stringZahl.length(); h++) {
                if (stringZahl.contains(numberZahlString)) {
                    stringZahl = "* ";
                }
            }
            if (i % numberZahl == 0) {
                stringZahl = "* ";
            }
            if (i == 0) {
                stringZahl = "0 ";
            }
            if (z < schleife) {
                System.out.printf("%s ", stringZahl);
                z++;
            }
            else {
                System.out.printf("%s \n", stringZahl);
                z = 0;
            }
        }
    }
}