
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vänligen ange antal poster du vill mata in: ");
        int antalvaror= scanner.nextInt();
        List<Entry> entries = new ArrayList<>();
        for (int i = 1; i <= antalvaror; i++) {
            System.out.println();
            System.out.println("1) TextEntry ");
            System.out.println("2) ImageEntry");
            System.out.println();
            System.out.print("Gör ditt val för post: " );
            String typ= scanner.next();
            if (typ.equals("1")) {
                System.out.print("Ange varans namn: ");
                scanner.nextLine(); // rensa bufferten
                String name = scanner.nextLine();
                System.out.print("Ange varans pris: ");
                double price = scanner.nextDouble();
                System.out.print("Ange antal:");
                int count = scanner.nextInt();
                TextEntry textEntry = new TextEntry(name, price, count);
                entries.add(textEntry);
                System.out.println();
            } else if (typ.equals("2")) {
                System.out.print("Ange bildens sökväg: ");
                String imagePath = scanner.next();
                System.out.print("Ange varans pris: ");
                double price = scanner.nextDouble();
                System.out.print("Ange antal: ");
                int count = scanner.nextInt();
                ImageEntry imageEntry = new ImageEntry(imagePath, price, count);
                entries.add(imageEntry);
                System.out.println();
            } else {
                System.out.println("Fel input, vänligen försök igen");

            }
        }



        printReceipt(entries);
    }

    public static void printReceipt(List<Entry> entries) {
        double total = 0;

        System.out.println("------------- Here is your receipt ------------");

        for (Entry entry : entries) {
            entry.printEntry();
            total += entry.getPrice() * entry.getCount();
        }
        String totalLinenn = String.format("%47s", "-----------------------------------------------");
        System.out.println(totalLinenn);

        String totalLine = String.format("%44.2f kr", total);
        System.out.println(totalLine);

    }
}
