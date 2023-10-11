package chFourth.listing1;

public class StackApp {
    public static void main(String[] args) {
//        StackX stackX = new StackX(10);
//
//        stackX.push(10);
//        stackX.push(20);
//        stackX.push(40);
//        stackX.push(60);
//        stackX.push(80);
//
//        while (!stackX.isEmpty()){
//            long value = stackX.pop();
//            System.out.print(value + " ");
//        }
//        System.out.println("");

        StackDeque stackDeque = new StackDeque(5);
        
        stackDeque.pushD(10);
        stackDeque.pushD(20);
        stackDeque.pushD(30);


        for (int i = 0; i < 2; i++){
            long n = stackDeque.popR();

            System.out.println(n + " ");
        }
        System.out.println("");
    }
}
