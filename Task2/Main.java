package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageDocuments d = new ManageDocuments();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add new document (Books, magazines or newspapers)");
            System.out.println("2. Find documents by type (Books, magazines or newspapers)");
            System.out.println("3. Display all documents");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("What type of documents would you like to add?");
                    System.out.println("1. Books");
                    System.out.println("2. Magazines");
                    System.out.println("3. Newspaper");
                    int docChoice = sc.nextInt();
                    sc.nextLine();
                    switch (docChoice) {
                        case 1: {
                            //ID
                            System.out.println("Enter id: ");
                            int id = sc.nextInt();
                            //Publisher name
                            System.out.println("Enter publisher name: ");
                            String publisherName = sc.nextLine();
                            //Published amount
                            System.out.println("Enter the amount published: ");
                            int amount = sc.nextInt();
                            //Author
                            System.out.println("Enter the author's name: ");
                            String author = sc.nextLine();
                            //Pages
                            System.out.println("Enter the number of pages in the book: ");
                            int pages = sc.nextInt();
                            Book book = new Book(id, publisherName, amount, author, pages);
                            d.addDocument(book);
                            System.out.println("Book with following information:" + book.toString() + "succesfully added!");
                            break;
                        }
                        case 2: {
                            //ID
                            System.out.println("Enter id: ");
                            int id = sc.nextInt();
                            //Publisher name
                            System.out.println("Enter publisher name: ");
                            String publisherName = sc.nextLine();
                            //Published amount
                            System.out.println("Enter the amount published: ");
                            int amount = sc.nextInt();
                            //Author
                            System.out.println("Enter the publishing number: ");
                            int publishNum = sc.nextInt();
                            //Pages
                            System.out.println("Enter the publishing month: ");
                            int publishMonth = sc.nextInt();
                            Magazine magazine = new Magazine(id, publisherName, amount, publishNum, publishMonth);
                            d.addDocument(magazine);
                            System.out.println("Magazine with following information:" + magazine.toString() + "succesfully added!");
                            break;
                        }
                        case 3: {
                            //ID
                            System.out.println("Enter id: ");
                            int id = sc.nextInt();
                            //Publisher name
                            System.out.println("Enter publisher name: ");
                            String publisherName = sc.nextLine();
                            //Published amount
                            System.out.println("Enter the amount published: ");
                            int amount = sc.nextInt();
                            //Author
                            System.out.println("Enter the publishing date: ");
                            int publishDate = sc.nextInt();
                            //Pages
                            Newspaper newspaper = new Newspaper(id, publisherName, amount, publishDate);
                            d.addDocument(newspaper);
                            System.out.println("Magazine with following information:" + newspaper.toString() + "succesfully added!");
                            break;
                        }
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                }
                case 2: {
                    System.out.print("Enter 1 to search a book");
                    System.out.println("Enter 2 to search a magazine");
                    System.out.println("Enter 3 to search a newspaper");
                    int docSearch = sc.nextInt();
                    sc.nextLine();
                    switch (docSearch) {
                        case 1:
                            ManageDocuments.findDocuments();
                            break;
                    
                        default:
                            break;
                    }
                    break;
                }
                default:
                    break;
            }
        }
    }
}
