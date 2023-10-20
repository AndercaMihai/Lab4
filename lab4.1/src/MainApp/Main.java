package MainApp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List echipamente = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMeniu:");

            System.out.println("1. Afisare imprimante");
            System.out.println("2. Afisare copiatoare");
            System.out.println("3. Afisare sisteme de calcul");
            System.out.println("4. Modificare starea unui echipament");
            System.out.println("5. Setare mod de scriere pentru o imprimanta");
            System.out.println("6. Setare format de copiere pentru copiatoare");
            System.out.println("7. Instalare sistem de operare pe un sistem de calcul");
            System.out.println("8. Afisare echipamente vandute");
            System.out.println("9. Ieșire");

            System.out.print("Alegeți o opțiune: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:


                    System.out.println("Introduceti detaliile noii imprimante:");
                    System.out.print("Pagini pe minut : ");
                    int ppm = scanner.nextInt();
                    System.out.print("Rezolutie : ");
                    int dpi = scanner.nextInt();
                    System.out.print("Pagini pe cartus: ");
                    int pCar = scanner.nextInt();
                    System.out.print("Mod de tiparire : ");
                    String modTiparire = scanner.next();

                    Imprimante imprimantaNoua = new Imprimante(ppm, dpi, pCar, modTiparire);
                    echipamente.add(imprimantaNoua);
                    imprimantaNoua.afisareimprimante();
                    break;
                case 2:

                    System.out.println("Introduceti detaliile noului copiator:");
                    System.out.print("Pagini pe toner :");
                    int p_ton= scanner.nextInt();
                    System.out.println("Format");
                    String format= scanner.next();

                    Copiatoare copiatornou=new Copiatoare(p_ton,format);
                    echipamente.add(copiatornou);
                    copiatornou.afisareCopiatoare();



                    break;
                case 3:
                    System.out.println("Introduceti detaliile noului Sistem de calcul:");

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    System.out.println("Programul s-a incheiat.");
                    break;
                default:
                    System.out.println("Optiune invalida. Va rugam sa alegeti din nou.");
            }
        } while (option != 10);
    }
}