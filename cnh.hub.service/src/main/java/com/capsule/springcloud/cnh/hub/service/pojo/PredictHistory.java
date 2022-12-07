package com.capsule.springcloud.cnh.hub.service.pojo;

public class PredictHistory {
    private String id;

    private String userId;

    private String imageName;

    private String predictReslut;

    private String predictTime;

    private String userName;

    private String image;

    private String startTime;

    private String trainModelId;

    private String trainModelName;

    public String getTrainModelName() {
        return trainModelName;
    }

    public void setTrainModelName(String trainModelName) {
        this.trainModelName = trainModelName == null ? null : trainModelName.trim();;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getPredictReslut() {
        return predictReslut;
    }

    public void setPredictReslut(String predictReslut) {
        this.predictReslut = predictReslut == null ? null : predictReslut.trim();
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime == null ? null : predictTime.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getTrainModelId() {
        return trainModelId;
    }

    public void setTrainModelId(String trainModelId) {
        this.trainModelId = trainModelId == null ? null : trainModelId.trim();
    }
}
