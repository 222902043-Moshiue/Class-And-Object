public class Student {
    String name,dept;
    int id;
    void printinfo(){
        System.out.println("Name :"+name);
        System.out.println("Department :"+dept);
        System.out.println("Id :"+id);

        System.out.println("\n"); 

    }
    public static void main(String[] args) {
        System.out.println("Let's do it.");

        Student s1=new Student();
        s1.name="Jibon Khan";
        s1.dept="CSE";
        s1.id=222902043;
        s1.printinfo();

        Student s2=new Student();
        s2.name="Tarik Hasan";
        s2.dept="EEE";
        s2.id=222903050;
        s2.printinfo();
    }
}
