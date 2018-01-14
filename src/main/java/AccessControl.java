public class AccessControl {

    private String comment;
    private String commentVote;
    private String embed;
    private String list;
    private String rate;
    private String syndicate;
    private String videoRespond;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentVote() {
        return commentVote;
    }

    public void setCommentVote(String commentVote) {
        this.commentVote = commentVote;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(String syndicate) {
        this.syndicate = syndicate;
    }

    public String getVideoRespond() {
        return videoRespond;
    }

    public void setVideoRespond(String videoRespond) {
        this.videoRespond = videoRespond;
    }

    public AccessControl() {
    }

    public AccessControl(String comment, String commentVote, String embed, String list, String rate, String syndicate, String videoRespond) {
        this.comment = comment;
        this.commentVote = commentVote;
        this.embed = embed;
        this.list = list;
        this.rate = rate;
        this.syndicate = syndicate;
        this.videoRespond = videoRespond;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "comment='" + comment + '\'' +
                ", commentVote='" + commentVote + '\'' +
                ", embed='" + embed + '\'' +
                ", list='" + list + '\'' +
                ", rate='" + rate + '\'' +
                ", syndicate='" + syndicate + '\'' +
                ", videoRespond='" + videoRespond + '\'' +
                '}';
    }
}
