package ua.edu.ucu.apps.task2;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    public Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void apply(T arg) {
        this.freeze();
        System.out.println("Task ID: " + this.getId());
        System.out.println("Stamp: " + this.getStamp());
        consumer.accept(arg);
    }
}