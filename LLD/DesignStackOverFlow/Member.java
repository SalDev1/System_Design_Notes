package LLD.DesignStackOverFlow;

import java.util.List;

public class Member extends User{
    Account account;
    List<Badge> badges;


    public void addQuestion(Question question) {}
    public void addAnswer(Question question , Answer answer) {};
    public void addComment(Question question, Comment comment) {};
    public void addTag(Question question, Tag tag) {};
    public void flagQuestion(Question question) {};
    public List<Badge> getBadges() {
        return null;
    }
}
