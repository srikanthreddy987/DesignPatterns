package Behavioural_Template_Pattern;

public abstract class Animal {

    abstract void eat();
    abstract void sleep();
    abstract void drink();

    public final void daily()
    {
        eat();
        sleep();
        drink();
    }
}
