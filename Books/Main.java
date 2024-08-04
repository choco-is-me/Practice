package Books;

import java.util.List;
import java.util.ArrayList;

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
        //ManageDocuments d = new ManageDocuments();
        Book bk1 = new Book(01, "NXB KD", 10, "Gia Han", 100);
        Book bk2 = new Book(02, "NXB KD", 15, "Gia Han", 15);

        Magazine mg1 = new Magazine(03, "NXB TN", 50, 15, 12);

        Newspaper np1 = new Newspaper(07, "NXB KD", 10, "30/12/2023");

        addDocument(bk1);
        addDocument(bk2);
        addDocument(np1);
        addDocument(mg1);

        displayDocument();
    }
}

