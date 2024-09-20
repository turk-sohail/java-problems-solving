import java.util.ArrayList;

public class ArList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("shit");
        names.add("tus");
        names.add("poas");

        for (String n : names) {
            System.out.print(" " + n);
        }
        System.out.println();

        String name = names.get(2);
        System.out.println(name);

        names.set(0, "name");
        System.out.println();
        for (String n : names) {
            System.out.print(" " + n);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
    }
}
