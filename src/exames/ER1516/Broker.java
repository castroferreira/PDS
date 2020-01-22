/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exame;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Beatriz Marques
 */
class Broker {

    List<Challenge> challenges = new ArrayList<>();
    List<Solver> solvers = new ArrayList<>();
    List<Seeker> seekers = new ArrayList<>();
    List<ChallengeSubject> challengeSubjects = new ArrayList<>();

    void addSolver(Solver solver) {
        solvers.add(solver);
    }

    void addSeeker(Seeker seeker) {
        seekers.add(seeker);
    }

    void addChallenge(Challenge challenge) {
        challenges.add(challenge);
    }

    ChallengeSubject addChallenge(Challenge challenge, GregorianCalendar gregorianCalendar) {
        ChallengeSubject challengeSubject = new ChallengeSubject(challenge, gregorianCalendar);
        challengeSubjects.add(challengeSubject);
        return challengeSubject;
    }

    @Override
    public String toString() {

        for (Seeker seeker : seekers) {
            System.out.println(seeker.toString());
        }
        for (Solver solver : solvers) {
            System.out.println(solver.toString());
        }
        
        for(ChallengeSubject challenger : challengeSubjects){
             System.out.println(challenger);
        }
        return "";

    }

}
