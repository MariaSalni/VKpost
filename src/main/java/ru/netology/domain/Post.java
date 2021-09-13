package ru.netology.domain;

public class Post {
    private String id;
    private String publicationDate;
    private String imageUrl;
    private String videoUrl;
    private String textOfPublication;
    private String likes;
    private String repost;
    private String numberOfViews;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate (String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getImageUrl() {
        return  imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return  videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTextOfPublication() {
        return  textOfPublication;
    }
    public void setTextOfPublication(String textOfPublication) {
        this.textOfPublication = textOfPublication;
    }

    public String getLikes() {
        return likes;
    }
    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getRepost() {
        return repost;
    }
    public void setRepost(String repost) {
        this.repost = repost;
    }

    public String getNumberOfViews() {
        return numberOfViews;
    }
    public void setNumberOfViews(String numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
