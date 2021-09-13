package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; // из документации VK
    private int fromId; // из документации VK
    private int createdBy; // из документации VK
    private int publicationDate;
    private String imageUrl;
    private String videoUrl;
    private String textOfPublication;
    private int replyOwnerId; // из документации VK
    private int replyPostId; // из документации VK
    private int friendsOnly; // из документации VK
    private CommentsInfo commentsInfo; // создан отдельный класс
    private Copyright copyright; // создан отдельный класс
    private LikesInfo likesinfo; // создан отдельный класс
    private RepostsInfo repostsInfo; // создан отдельный класс
    private ViewsInfo viewsInfo; // создан отдельный класс
    private String postType; // из документации VK
    private PostSource postSource; // создан отдельный класс
    private Geo geo; // создан отдельный класс
    private int signerId; // из документации VK
    private int canPin; // из документации VK
    private int canDelete; // из документации VK
    private int canEdit; // из документации VK
    private int isPinned; // из документации VK
    private int markedAsAds; // из документации VK
    private boolean isFavorite; // из документации VK
    private int postponedId; // из документации VK
    private Donut donut; // создан отдельный класс


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }
    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(int publicationDate) {
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

    public int getReplyOwnerId() {
        return replyOwnerId;
    }
    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }
    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }
    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return  postType;
    }
    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }
    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }
    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }
    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }
    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }
    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }
    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getPostponedId() {
        return postponedId;
    }
    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public boolean getIsFavourite() {
        return isFavorite;
    }
    public void setIsFavourite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }


}
