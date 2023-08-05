package chThird.listing4;

public class objectSortApp {
    public static void main(String[] args) {
        ArrayInOb arr = new ArrayInOb(100);

        arr.insert(new Person("Evans", "Patty", 24));
        arr.insert(new Person("Smith", "Lorraine", 37));
        arr.insert(new Person("Yee", "Tom", 43));
        arr.insert(new Person("Adams", "Henry", 63));
        arr.insert(new Person("Hashimoto", "Sato", 21));
        arr.insert(new Person("Smith", "Henry", 29));
        arr.insert(new Person("Velasquez", "Jose", 72));
        arr.insert(new Person("Lamarque", "Henry", 54));
        arr.insert(new Person("Vang", "Minh", 22));
        arr.insert(new Person("Creswell", "Lucinda", 18));

        arr.display();

        arr.insertionSort();
        arr.display();
    }
}
