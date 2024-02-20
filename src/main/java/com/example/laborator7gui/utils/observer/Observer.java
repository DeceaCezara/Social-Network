package com.example.laborator7gui.utils.observer;
import com.example.laborator7gui.utils.events.Event;

public interface Observer<E extends Event> {
    void update(E e);
}