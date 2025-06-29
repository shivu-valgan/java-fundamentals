public class OopsExample1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("shivakumar");
        s1.setGrade(98);
        s1.displayInfo();
    }
}
class Student{
    private String name;
    private double grade;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public void displayInfo(){
        System.out.println(getName());
        System.out.println(getGrade());
    }
}

