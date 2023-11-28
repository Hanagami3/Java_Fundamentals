package les1.Oefeningen;

public class Pair<T> {

    T waard1;
    T waard2;

    public Pair (T waard1, T waard2){
        this.waard1 = waard1;
        this.waard2 = waard2;
    }

    public T getWaard1() {
        return waard1;
    }

    public void setWaard1(T waard1) {
        this.waard1 = waard1;
    }

    public T getWaard2() {
        return waard2;
    }

    public void setWaard2(T waard2) {
        this.waard2 = waard2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "waard1=" + waard1 +
                ", waard2=" + waard2 +
                '}';
    }
}
