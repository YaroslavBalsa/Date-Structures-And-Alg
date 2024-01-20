package chFifth.listing1;

public class Link {
    private int iDate;
    private double dData;
    public Link next;

    public Link(int iDate, double dData) {
        this.iDate = iDate;
        this.dData = dData;
    }
    public void displayLink() {
        System.out.print("{" + iDate + ", " + dData + "} ");
    }
    public int getiDate() {
        return iDate;
    }

    public void setiDate(int iDate) {
        this.iDate = iDate;
    }

    public double getdData() {
        return dData;
    }

    public void setdData(double dData) {
        this.dData = dData;
    }
}
