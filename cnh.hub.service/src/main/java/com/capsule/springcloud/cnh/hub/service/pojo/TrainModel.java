package com.capsule.springcloud.cnh.hub.service.pojo;

public class TrainModel {
    private String id;

    private String trainModelName;

    private String trainModelPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTrainModelName() {
        return trainModelName;
    }

    public void setTrainModelName(String trainModelName) {
        this.trainModelName = trainModelName == null ? null : trainModelName.trim();
    }

    public String getTrainModelPath() {
        return trainModelPath;
    }

    public void setTrainModelPath(String trainModelPath) {
        this.trainModelPath = trainModelPath == null ? null : trainModelPath.trim();
    }
}