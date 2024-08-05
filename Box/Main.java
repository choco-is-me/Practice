package Box;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        AiTech ai1= new AiTech(01, "Boxbot", "20/05/2020", "12ABE");
        AiTech ai2= new AiTech(02, "BaoBot", "22/05/2019", "12ABD");

        Application ap1= new Application(03, "Baxbot", "11/05/2021", "ios");
        Application ap2= new Application(04, "Boostbot", "12/05/2021", "adr");

        Data d1= new Data(05, "Data1", "2/01/2010", "exe");
        Data d2= new Data(06, "Data2", "12/01/2000", "exe");

        addMajor(ai1);
        addMajor(ai2);
        addMajor(ap1);
        addMajor(ap2);
        addMajor(d1);
        addMajor(d2);
        display();
    }

    public static List<Major> mj = new ArrayList<>();
    
    public static void addMajor(Major major){
        mj.add(major);
    }

    public static void display(){
        for (Major major : mj){
            System.out.println("\n\n"+major.toString());
        }
    }
}
