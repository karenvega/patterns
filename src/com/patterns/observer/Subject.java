package com.patterns.observer;

/**
 * Created by karenvega on 13/09/16.
 */
public interface Subject {

    public void registerObserver(Observer b);
    public void removeObserver(Observer b);
    public void notifyObserver();
}
