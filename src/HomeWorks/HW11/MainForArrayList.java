package HomeWorks.HW11;

public class MainForArrayList {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();

        list.add("Custom");
        list.add("Array");
        list.add("List");

        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("Contains 'Custom': " + list.contains("Custom"));

        list.remove(1);

        System.out.println("Size after removal: " + list.size());

        list.clear();
        System.out.println("Size after clearing: " + list.size());
    }
}
