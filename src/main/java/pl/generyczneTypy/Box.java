package pl.generyczneTypy;

import java.util.ArrayList;

public class Box<T> {
    private T content;

    public void put(T person) {
        this.content = person;
    }

    public T get() {
        return content;
    }


}
