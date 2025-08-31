package LLD.DesignStackOverFlow;

import java.util.List;

public class Question extends PostEntity{

    List<EditHistory> editHistories;
    List<Answer> answers;
    List<Tag> tags;
    String name;
    String description;
    QuestionStatus status;

    public boolean addQuestion(Question question) { return false;};
    public boolean addTag(Tag tag) {return false;};
}
