public class Student1 {
    private String name;
    private int age;

    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("Shivakumar");
        s.setAge(22);
        System.out.println(s.getName() + " - " + s.getAge());
    }
}
