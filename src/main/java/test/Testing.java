package test;

public class Testing {

    public static void helloUsers(String[] users) {
        for (String name : users) {
            System.out.println("Hello " + name);
        }
    }

    public static String getShoppingList(String[] shoppingList) {
        String list = "";
        for (String names : shoppingList) {
            list += names;
            list += ", ";

        }
        return list;
    }


    public static void main(String[] args) {
        String[] table = {"Michał", "Jan", "Anna"};
        helloUsers(table);
        String[] lists = {"masło", "marchew"};
        String shoppingList = getShoppingList(lists);
        System.out.println(shoppingList);
    }


}
