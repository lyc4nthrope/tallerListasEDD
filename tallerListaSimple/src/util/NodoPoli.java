package util;

public class NodoPoli {
    private int num;
    private int expo;
    private NodoPoli next;

    public NodoPoli(int num, int expo) {
        this.num = num;
        this.expo = expo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getExpo() {
        return expo;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }

    public NodoPoli getNext() {
        return next;
    }

    public void setNext(NodoPoli next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoPoli{" +
                "num=" + num +
                ", expo=" + expo +
                '}';
    }
}
