package Team;

import Inning.BallDetails;
import Inning.OverDetails;
import Team.Player.PlayerDetails;

public class Wicket {
    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetails;
    public BallDetails ballDetails;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, BallDetails ballDetails, OverDetails overDetails) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.ballDetails = ballDetails;
        this.overDetails = overDetails;
    }
}
