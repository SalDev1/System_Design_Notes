package LLD.DesignStackOverFlow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class PostEntity {
    String title;
    String description;
    Map<VoteType, Integer> votes;
    Date createdDate;

    List<Tag> tags; // specific tags assigned to a Stackoverflow post.
    List<Answer> answers; // specific tags assigned to a Stackoverflow post.

    public boolean flagPostEntity(PostEntity entity) { return false;};
    public boolean votePostEntity(VoteType voteType) { return false;};
    public boolean addComment(Comment comment) { return false;}
}
