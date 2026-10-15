public class StudentDetails {
    int rollNo = 202;
    String name= "Rakshitha";
    void display(){
        System.out.println(rollNo);
        System.out.println(name);
    }
    public static void main(String[] args){
        StudentDetails s = new StudentDetails();
        s.display();
    }
}
