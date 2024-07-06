package Inning;

import ScoreUpdater.BattingScoreUpdater;
import ScoreUpdater.BowlingScoreUpdater;
import ScoreUpdater.ScoreUpdaterObserver;
import Team.Player.PlayerDetails;
import Team.Team;
import Team.Wicket;
import Team.WicketType;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails playedBy;
    public PlayerDetails bowledBy;

    public Wicket wicket;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList = new ArrayList<>();

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
        scoreUpdaterObserverList.add(new BowlingScoreUpdater());
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
    }

    public void startBallDelivery(Team battingTeam , Team bowlingTeam , OverDetails over) {
        playedBy = battingTeam.getStriker();
        this.bowledBy = over.bowledBy;

        ballType = BallType.NORMAL;

        if(isWicketTaken()) {
            runType = RunType.ZERO;

            wicket = new Wicket(WicketType.BOLD,bowlingTeam.getCurrentBowler(),this,over);
            battingTeam.setStriker(null);
        } else {
            runType = getRunType();

            if(runType == RunType.ONE || runType == RunType.THREE) {
                // swap striker and non striker.
                PlayerDetails temp = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }
    }

    private void notifyUpdaters(BallDetails balldetails) {
        for(ScoreUpdaterObserver observer : scoreUpdaterObserverList) {
            observer.update(balldetails);
        }
    }

    private RunType getRunType() {
        double val = Math.random();
        if(val <= 0.2) {
            return RunType.ONE;
        } else if(val >= 0.3 && val <= 0.5) {
            return RunType.TWO;
        } else if(val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

    private boolean isWicketTaken() {
        if(Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }
}
