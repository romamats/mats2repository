package bean;

public class Counter {
    public int value;
    public int step;

    public Counter(int value, int step) {
        this.value = 0;
        this.step = 1;
    }

    public int increment() {
        if (value < 100) value += step;
        return value;
    }

    public int decrement() {
        if (value > 100) value -= step;
        return value;
    }

    public int reset() {
        if (value > 0);
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}

