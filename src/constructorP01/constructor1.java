package constructorP01;

public class constructor1 {
    public static void main(String[] args) {
        C1 ob = new C1();
        System.out.println(ob.a);

    }
}

class C1{
    int a;
    C1(){
        a = 10;

    }
}