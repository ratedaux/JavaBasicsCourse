package homework26;

public class Pair<T> {

    private T firstValue;
    private T secondValue;

    public Pair(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public T getSecondValue() {
        return secondValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(T secondValue) {
        this.secondValue = secondValue;
    }

    void swap() {
        T temp;
        temp = firstValue;
        this.firstValue = secondValue;
        this.secondValue = temp;
    }
}
