package chSecond.listing5;

public class ClassDataArray {
    private Person[] a;
    private int nElems;

    public ClassDataArray(int max) {
        a = new Person[max];
        nElems = 0;
    }
    public Person find(String searchName){
        int i;
        for(i = 0; i < nElems; i++){
            if(a[i].getLastName().equals(searchName)){
                break;
            }
        }
        if(i == nElems){
            return null;
        } else {
            return a[i];
        }
    }
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;
    }
    public boolean delete(String searchName){
        int i;
        for(i = 0; i < nElems; i++){
            if(a[i].getLastName().equals(searchName)){
                break;
            }
        }
        if(i == nElems){
            return false;
        } else {
            for(int k = i; k < nElems; k++){
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }
    public void display(){
        for(int i = 0; i < nElems; i++){
            a[i].displayPerson();
        }
    }
}