package chFifth.task5;

import chFifth.task3.CycleLinkedList;

public class JosephF {
    CycleLinkedList<Integer> list;

    public JosephF(int amount) {
        this.list = new CycleLinkedList<>();
        int data = 1;

        do {
            list.insert(data);
            data++;
        } while (data != amount + 1);
    }
    public void printList() {
        for (int i = list.getAmount(); i > 0; i--){
            System.out.print(list.getCurrent() + " ");
            list.step();
        }
        System.out.println();
    }
}
