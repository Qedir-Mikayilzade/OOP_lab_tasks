
public class Employee extends Person{
    
   private String job; 
   private double salary;

    public Employee(String job, double salary, int id) {
        super(id);
        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
   

    @Override
    public void greeting() {
        
        int a = 9;
        System.out.println(a);
    }
    
    
   
   
}
