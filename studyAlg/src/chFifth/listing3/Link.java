package chFifth.listing3;

public class Link {
    private long data;
    public Link next;

    public Link(long data) {
        this.data = data;
    }
    public void displayLink() {
        System.out.print(data + " ");
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}
