package me.qingy.dp.behavioral.observer.base;

/**
 * @author qingy
 * @since 2021-08-04
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
