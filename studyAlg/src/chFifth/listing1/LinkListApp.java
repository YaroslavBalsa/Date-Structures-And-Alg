package chFifth.listing1;

public class LinkListApp {
    public static void main(String[] args) {

        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();

        Link f = theList.find(44);
        if (f != null) {
            System.out.println("Найден элемент c ключём " + f.getiDate());
        } else {
            System.out.println("Данный элемент не найден");
        }

        Link d = theList.delete(66);
        if (d != null) {
            System.out.println("Удален элемент с ключём " + d.getiDate());
        } else {
            System.out.println("Данный элемент не найден");
        }

        while(!theList.isEmpty()) {
            Link link = theList.deleteFirst();
            System.out.print("Delete ");
            link.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
