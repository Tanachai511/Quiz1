public class Quiz_1{
    public static void main(String[] args) {
        Student student = new Student(123, "John", 5, 3.99);
        student.getID();
        student.getName();
        student.getaddmissinYear();
        student.getGPA();

        student.showdetails();
    }
}

class Student {
    private int ID;
    private String Name;
    private int addmissionYear ;
    private Double GPA;

    public Student(int ID,String Name,int addmissionYear,Double GPA){
        this.ID = ID;
        this.Name = Name;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return Name;
    }

    public int getaddmissinYear(){
        return addmissionYear;
    }

    public Double getGPA(){
        return GPA;
    }

    public void showdetails(){
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.addmissionYear);
        System.out.println("GPA : " + this.GPA);
    }
}    