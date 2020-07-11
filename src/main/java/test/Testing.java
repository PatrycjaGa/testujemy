package test;

public class Testing {

    public static void helloUsers(String[] users){
        for (String name: users) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        String[] table = {"Michał", "Jan", "Anna"};
        helloUsers(table);


    }
}
