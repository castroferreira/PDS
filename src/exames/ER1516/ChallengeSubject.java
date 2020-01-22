package Exame;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Beatriz Marques
 */
class ChallengeSubject {

    private Challenge challenge;
    private GregorianCalendar date;
    private List<Observer> observer = new ArrayList<>();

    private int state;

    public ChallengeSubject(Challenge challenge, GregorianCalendar date) {
        this.challenge = challenge;
        this.date = date;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void attach(Observer o) {
        observer.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observer) {
            observer.update();
        }
    }

    @Override
    public String toString() {
        return "ChallengeSubject:" + challenge.getTitle().toString();
    }

    void close() {
        
        
    }

    void setWinner(Solver solver2) {
        
    }

}
