public class Main {
    int x;
    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        Main myObj3 = new Main();
        myObj1.x = 12;
        myObj2.x = 23;
        myObj3.x = 45;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);
    }
}