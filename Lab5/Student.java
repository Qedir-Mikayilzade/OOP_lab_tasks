
public class Student extends Person{
    private double GPA;
    private String groupNumber ;
    private String enteranceYear;

    public Student(double GPA, String groupNumber, String enterance, int id) {
        super(id);
        this.GPA = GPA;
        this.groupNumber = groupNumber;
        this.enteranceYear = enteranceYear;
    }
    
    public double getGPA(){
        return GPA;
    }
    public void setGPA(){
    
    this.GPA = GPA;
    }
    public String getgroupNumber (){
        return groupNumber;
    }

    public void setgroupNumber (){
        this.groupNumber = groupNumber;
    }

    public String getenteranceYear(){
        return enteranceYear;
    }
    
    public void setenteranceYear(){
        this.enteranceYear = enteranceYear;
    }

    @Override
    public void greeting() {
        System.out.println("student greeting");
    }
    
    public boolean passExam(){
        return true;
    }
    
    
}