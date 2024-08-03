package Task2;

import java.util.ArrayList;
import java.util.List;

public class ManageDocuments {
    private List<Document> docList = new ArrayList<>();

    public void addDocument(Document doc) {
        this.docList.add(doc);
    }

    public List<Documentt> findDocuments( ) {

    }

    public void displayDocList() {
        for(Document doc : docList) {
            System.out.println(doc.toString());
        }
    }
}
