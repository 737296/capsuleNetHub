package com.capsule.springcloud.cnh.hub.service.pojo;

public class TrainAccuracy {
    private String id;

    private String trainHistoryId;

    private String epoch;

    private String accuracy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTrainHistoryId() {
        return trainHistoryId;
    }

    public void setTrainHistoryId(String trainHistoryId) {
        this.trainHistoryId = trainHistoryId == null ? null : trainHistoryId.trim();
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch == null ? null : epoch.trim();
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy == null ? null : accuracy.trim();
    }
}