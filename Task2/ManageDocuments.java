package Task2;

import java.util.ArrayList;
import java.util.List;

public class ManageDocuments {
    private List<Document> docList = new ArrayList<>();

    public void addDocument(Document doc) {
        this.docList.add(doc);
    }

    public List<Document> findDocuments() {
        // Find document with by type (Book or Magazine or Newspaper)
        List<Document> result = new ArrayList<>();
        for (Document doc : docList) {
            if (doc instanceof Book) {
                result.add(doc);
            } else if (doc instanceof Magazine) {
                result.add(doc);
            } else if (doc instanceof Newspaper) {
                result.add(doc);
            }
        }
        return result;
    }

    public void displayDocList() {
        for(Document doc : docList) {
            System.out.println(doc.toString());
        }
    }
}
