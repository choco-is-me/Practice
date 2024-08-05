package Box;

public class Major {
   private int departmentId;
   private String name;
   private String creationDate;
   
   public Major(int departmentId, String name, String creationDate){
    this.departmentId=departmentId;
    this.name=name;
    this.creationDate=creationDate;
   }

   public int getDepartmentId() {
       return departmentId;
   }
   public String getName() {
       return name;
   }
   public String getCreationDate() {
       return creationDate;
   }

   public void setDepartmentId(int departmentId) {
       this.departmentId = departmentId;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void setCreationDate(String creationDate) {
       this.creationDate = creationDate;
   }

}
