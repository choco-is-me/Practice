package Task1;

import java.util.ArrayList;
import java.util.List;

public class ManageStaff {
    private List<Staff> staffList = new ArrayList<>();

    public void addStaff(Staff staff) {
        this.staffList.add(staff);
    }

    public List<Staff> findStaffByName(String name) {
        List<Staff> result = new ArrayList<>();
        for (Staff staff : staffList) {
            if (staff.getName().equals(name)) {
                result.add(staff);
            }
        }
        return result;
    }

    public void displayStaffList() {
        for (Staff staff : staffList) {
            System.out.println(staff.toString());
        }
    }
}
