class student {
    int RollNumber;
    String Name;
    student(int roll, String name){
        RollNumber = roll;
        Name = name;
    }    
    public void Show() {
        System.out.println("RollNumber is :" + RollNumber);
        System.out.println("Name is :" + Name);
    }
}
// Yahan par question1 Test se change kardena file me
public class question2 {
    public static void main(String[] args) {
        student stu2 = new student(10, "Anuksha");
        stu2.Show();
    }
}

