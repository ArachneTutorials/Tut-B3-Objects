package lesson.classes.examples;

public class Visibility {
    public int var1;
    protected int var2;
    int var3;
    private int var4;

    public void func1() {}
    protected void func2() {}
    void func3() {}
    private void func4() {}

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
