package BookScan;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static List<Document> dc = new ArrayList<>();

    public static void addDocument(Document doc) {
        dc.add(doc);
    }

    public static void displayDocument() {
        for(Document doc : dc) {
            System.out.println(doc);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1 for adding Books");
            System.out.println("2 for adding Magazines");
            System.out.println("3 for adding Newspaper");
            System.out.println("4 for displaying all documents in the system");
            System.out.println("5 to exit");
            System.out.print("Your input: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("You are adding a Book.");
                    //id
                    System.out.println("Input id: ");
                    int id = sc.nextInt();
                    //name
                    System.out.println("Input publisher name: ");
                    sc.nextLine();
                    String pubName = sc.nextLine();
                    //amount
                    System.out.println("Input amount: ");
                    int amount = sc.nextInt();
                    //author
                    System.out.println("Input author name: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    //pages
                    System.out.println("Input total pages: ");
                    int pages = sc.nextInt();
                    // create book
                    Book book = new Book(id, pubName, amount, author, pages);
                    dc.add(book);
                    System.out.println("Book sucessfully added!");
                    break;
                }
                case 2: {
                    System.out.println("You are adding a Magazine.");
                    System.out.println("Input id: ");
                    int id = sc.nextInt();
                    System.out.println("Input publisher name: ");
                    sc.nextLine();
                    String pubName = sc.nextLine();
                    System.out.println("Input amount: ");
                    int amount = sc.nextInt();
                    System.out.println("Input publish number: ");
                    sc.nextLine();
                    int pubNum = sc.nextInt();
                    System.out.println("Input publishing month: ");
                    sc.nextLine();
                    String month = sc.nextLine();
                    Magazine mg = new Magazine(id, pubName, amount, pubNum, month);
                    dc.add(mg);
                    System.out.println("Magazine sucessfully added!");
                    break;
                }
                case 3: {
                    System.out.println("You are adding a Newspaper.");
                    System.out.println("Input id: ");
                    int id = sc.nextInt();
                    System.out.println("Input publisher name: ");
                    String pubName = sc.nextLine();
                    System.out.println("Input amount: ");
                    int amount = sc.nextInt();
                    System.out.println("Input publish date (DD/MM/YY): ");
                    String pubDate = sc.nextLine();
                    Newspaper np = new Newspaper(id, pubName, amount, pubDate);
                    dc.add(np);
                    System.out.println("Newspaper sucessfully added!");
                    break;
                }
                case 4: {
                    displayDocument();
                    System.out.println("--------------------------------");
                    break;
                }
                case 5: {
                    sc.close();
                    return;
                }
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
        }
    }
}

