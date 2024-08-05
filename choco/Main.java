package choco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AI ai1 = new AI(1, "Artificial Intelligence", "2021-01-01", "AI");
        AI ai2 = new AI(2, "Machine Learning", "2021-01-01", "ML");
        Application app1 = new Application(3, "Computer Vision", "2021-01-01", "CV");
        Application app2 = new Application(4, "Natural Language Processing", "2021-01-01", "NLP");
        Data data1 = new Data(5, "Web Application", "2021-01-01", "Web");
        Data data2 = new Data(6, "Mobile Application", "2021-01-01", "Mobile");

        System.out.println("Added AI Major: " + ai1.toString());
        addMajor(ai1);
        addMajor(ai2);

        System.out.println("Added APP Major: " + ai1.toString());
        addMajor(app1);
        addMajor(app2);

        System.out.println("Added DATA Major: " + ai1.toString());
        addMajor(data1);
        addMajor(data2);

        System.out.println("Major List:");
        displayMajorList();
    }

    public static List<Major> mj = new ArrayList<>();

    public static void addMajor(Major major) {
        mj.add(major);
    }

    public static void displayMajorList() {
        for (Major major : mj) {
            System.out.println(major.toString());
        }
    }
}
