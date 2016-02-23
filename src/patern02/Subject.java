/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patern02;

import java.util.ArrayList;

/**
 *
 * @author 1410453
 */
public class Subject {

    // private Observer[] observers = new Observer[9];  // 3. Coupled to base class
    ArrayList<Observer> observers = new ArrayList<>();

    private int totalObs = 0;
    private int state;

    public void attach(Observer o) {
        observers.add(totalObs++, o);
    } // 3. Coupled

    public int getState() {
        return state;
    }

    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    private void notifyObservers() {
//        for (int i = 0; i < totalObs; i++) {
//            observers.get(i).update();         // 3. Coupled to base class
//        }
        for (Observer u : observers) {
            u.update();
        }

    }
}
