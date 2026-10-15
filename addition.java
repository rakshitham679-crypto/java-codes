public class addtionOfNo {
    int a,b;
    int add(){
        return a+b;
    }
    public static void main(String[] args) {
        addtionOfNo A = new addtionOfNo();
        A.a = 10;
        A.b = 20;
        System.out.println(A.add());
    }
}
