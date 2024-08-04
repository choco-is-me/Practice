package Java_B;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Major> mj = new ArrayList<>();

    public static void addMajor(Major major) {
        mj.add(major);
    }

    public static void displayMajor() {
        for (Major major : mj) {
            System.out.println(major.toString());
        }
    }
    public static void main(String[] args) {
        AiTech ai1 = new AiTech(101, "Bao", "1/1/2024", "AIMODEL");
        AiTech ai2 = new AiTech(102, "Phat", "2/1/2024", "AIMODEL");
        AiTech ai3 = new AiTech(103, "Binh", "3/1/2024", "AIMODEL");

        Application app1 = new Application(104, "Phat2", "2/1/2024", "iOS");

        Data data1 = new Data(105, "Binh2", "4/1/2024", "SQL");

        addMajor(ai1);
        addMajor(ai2);
        addMajor(ai3);
        addMajor(app1);
        addMajor(data1);

        System.out.println("Major list:");
        displayMajor();
    }
}
