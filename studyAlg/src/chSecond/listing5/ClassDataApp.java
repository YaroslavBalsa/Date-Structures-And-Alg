package chSecond.listing5;

public class ClassDataApp {
    public static void main(String[] args) {

        ClassDataArray arr = new ClassDataArray(100);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.display();

        String searchName = "Stimson";
        Person found;
        found = arr.find(searchName);

        if(found != null){
            System.out.println("Found: ");
            found.displayPerson();
        } else {
            System.out.println("Can`t find " + searchName);
        }

        System.out.println("Delete: Smith, Yee and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.display();
    }
}
