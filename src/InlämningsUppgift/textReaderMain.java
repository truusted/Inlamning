package InlämningsUppgift;

import java.util.Scanner;

public class textReaderMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        textReader counter = new textReader();

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            counter.addLine(line);
        }

        scanner.close();


        System.out.println("Antal tecken (exklusive 'stop'): " + counter.AntalTecken());
        System.out.println("Antal rader (exklusive 'stop'): " + counter.AntalRader());
        System.out.println("Det längsta ordet är: " + counter.longestWord());

    }
}




