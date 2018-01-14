import java.util.List;
import java.util.Map;

public class Item {

    private AccessControl accessControl;
    private String aspectRatio;
    private String category;
    private Long commentCount;

    private Map<String, String> content;
    private String description;
    private Long duration;
    private Long favoriteCount;
    private String id;

    private Map<String, String> player;
    private Double rating;
    private Long ratingCount;
    private Status status;
    private List<String> tags;
    private Map<String, String> thumbnail;
    private String title;
    private String updated;
    private String uploaded;
    private String uploader;
    private Long viewCount;

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Map<String, String> getContent() {
        return content;
    }

    public void setContent(Map<String, String> content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getPlayer() {
        return player;
    }

    public void setPlayer(Map<String, String> player) {
        this.player = player;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Long getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Long ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Map<String, String> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Item() {
    }

    public Item(AccessControl accessControl, String aspectRatio, String category, Long commentCount, Map<String, String> content, String description, Long duration, Long favoriteCount, String id, Map<String, String> player, Double rating, Long ratingCount, Status status, List<String> tags, Map<String, String> thumbnail, String title, String updated, String uploaded, String uploader, Long viewCount) {
        this.accessControl = accessControl;
        this.aspectRatio = aspectRatio;
        this.category = category;
        this.commentCount = commentCount;
        this.content = content;
        this.description = description;
        this.duration = duration;
        this.favoriteCount = favoriteCount;
        this.id = id;
        this.player = player;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.status = status;
        this.tags = tags;
        this.thumbnail = thumbnail;
        this.title = title;
        this.updated = updated;
        this.uploaded = uploaded;
        this.uploader = uploader;
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "accessControl=" + accessControl +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", category='" + category + '\'' +
                ", commentCount=" + commentCount +
                ", content=" + content +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", favoriteCount=" + favoriteCount +
                ", id='" + id + '\'' +
                ", player=" + player +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", status=" + status +
                ", tags=" + tags +
                ", thumbnail=" + thumbnail +
                ", title='" + title + '\'' +
                ", updated='" + updated + '\'' +
                ", uploaded='" + uploaded + '\'' +
                ", uploader='" + uploader + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }
}
