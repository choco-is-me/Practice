package BookScan;

import java.util.ArrayList;
import java.util.List;

import Books.Document;

public class ManageDocuments {
    public static List<Document> dc = new ArrayList<>();

    public static void addDocument(Document doc) {
        dc.add(doc);
    }

    public static void displayDocument() {
        for(Document doc : dc) {
            System.out.println(doc);
        }
    }
}
