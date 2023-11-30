class student {
    int RollNumber;
    String Name;

    public void Show() {
        System.out.println("RollNumber is :" + RollNumber);
        System.out.println("Name is :" + Name);
    }
}

// Yahan par question1 Test se change kardena file me
public class question1 {
public static void main(String[] args) {
    student stu1 = new student();
    stu1.RollNumber = 10;
    stu1.Name = "Anuksha";
    stu1.Show();
}
}
