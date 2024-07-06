package Inning;

import Match.MatchType;
import Team.Player.PlayerDetails;
import Team.Team;

import java.util.ArrayList;
import java.util.List;

public class InnningDetails {
    Team battingTeam;
    Team bowlingTeam;
    MatchType matchType;
    List<OverDetails> overs;

    public InnningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void start(int runsToWin) {
        try {
            battingTeam.chooseNextBatsMan();
        } catch(Exception e) {

        }

        int noOfOvers = matchType.noOfOvers();

        for(int overNumber = 1 ; overNumber <= noOfOvers ; overNumber++) {
            bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());

            OverDetails over = new OverDetails(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);
            try {
                boolean won = over.startOver(battingTeam,bowlingTeam,runsToWin);
                if(won == true) {
                    break;
                }
            } catch(Exception e) {
                break;
            }
        }

        // swap striker and non striker.
        PlayerDetails temp = battingTeam.getStriker();
        battingTeam.setStriker(battingTeam.getNonStriker());
        battingTeam.setNonStriker(temp);
    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }
}
