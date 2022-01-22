package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> commentList = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status, List<Comment> commentList) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.commentList = commentList;
    }

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        if (copyMode.equals(CopyMode.WITH_COMMENTS)) {
            this.name = issue.name;
            this.time = issue.time;
            this.status = issue.status;
            this.commentList = new ArrayList<>(issue.commentList);
        } else this.name = issue.name;
        this.time = issue.time;
        this.status = issue.status;

    }


}
