public class Main {
    public static void main(String[] args) {
       Employee emp = new Employee("aa", 10, 20);
       Student stu = new Student(5.5, "bhbh", "ojjiio", 60);
       
       emp.greeting();
       stu.passExam();
       stu.greeting();
    }    
}
