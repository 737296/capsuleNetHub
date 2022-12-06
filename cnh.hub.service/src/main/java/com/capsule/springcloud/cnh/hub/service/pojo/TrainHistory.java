package com.capsule.springcloud.cnh.hub.service.pojo;

public class TrainHistory {
    private String id;

    private String userId;

    private String userName;

    private String trainEpochs;

    private String trainTime;

    private String startTime;

    private String trainModelName;

    private String trainModelId;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTrainEpochs() {
        return trainEpochs;
    }

    public void setTrainEpochs(String trainEpochs) {
        this.trainEpochs = trainEpochs == null ? null : trainEpochs.trim();
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime == null ? null : trainTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getTrainModelName() {
        return trainModelName;
    }

    public void setTrainModelName(String trainModelName) {
        this.trainModelName = trainModelName == null ? null : trainModelName.trim();
    }

    public String getTrainModelId() {
        return trainModelId;
    }

    public void setTrainModelId(String trainModelId) {
        this.trainModelId = trainModelId == null ? null : trainModelId.trim();
    }
}