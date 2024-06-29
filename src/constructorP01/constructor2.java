package constructorP01;

public class constructor2 {
    String name;
    int age;
    public constructor2(String x, int y){
        name = x;
        age = y;
    }
    public void display( ){
        System.out.println("Name is " + name);
        System.out.println("Age is : " + age);
    }

    public static void main(String[] args) {
        constructor2 ob1 = new constructor2("Muntaha" , 8);
        constructor2 ob2 = new constructor2("Mithu", 42);
        ob1.display();
        ob2.display();
    }
}

