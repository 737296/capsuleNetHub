package com.capsule.springcloud.cnh.hub.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainAccuracyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainAccuracyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdIsNull() {
            addCriterion("train_history_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdIsNotNull() {
            addCriterion("train_history_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdEqualTo(String value) {
            addCriterion("train_history_id =", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdNotEqualTo(String value) {
            addCriterion("train_history_id <>", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdGreaterThan(String value) {
            addCriterion("train_history_id >", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("train_history_id >=", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdLessThan(String value) {
            addCriterion("train_history_id <", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("train_history_id <=", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdLike(String value) {
            addCriterion("train_history_id like", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdNotLike(String value) {
            addCriterion("train_history_id not like", value, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdIn(List<String> values) {
            addCriterion("train_history_id in", values, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdNotIn(List<String> values) {
            addCriterion("train_history_id not in", values, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdBetween(String value1, String value2) {
            addCriterion("train_history_id between", value1, value2, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andTrainHistoryIdNotBetween(String value1, String value2) {
            addCriterion("train_history_id not between", value1, value2, "trainHistoryId");
            return (Criteria) this;
        }

        public Criteria andEpochIsNull() {
            addCriterion("epoch is null");
            return (Criteria) this;
        }

        public Criteria andEpochIsNotNull() {
            addCriterion("epoch is not null");
            return (Criteria) this;
        }

        public Criteria andEpochEqualTo(String value) {
            addCriterion("epoch =", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotEqualTo(String value) {
            addCriterion("epoch <>", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochGreaterThan(String value) {
            addCriterion("epoch >", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochGreaterThanOrEqualTo(String value) {
            addCriterion("epoch >=", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochLessThan(String value) {
            addCriterion("epoch <", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochLessThanOrEqualTo(String value) {
            addCriterion("epoch <=", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochLike(String value) {
            addCriterion("epoch like", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotLike(String value) {
            addCriterion("epoch not like", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochIn(List<String> values) {
            addCriterion("epoch in", values, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotIn(List<String> values) {
            addCriterion("epoch not in", values, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochBetween(String value1, String value2) {
            addCriterion("epoch between", value1, value2, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotBetween(String value1, String value2) {
            addCriterion("epoch not between", value1, value2, "epoch");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNull() {
            addCriterion("accuracy is null");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNotNull() {
            addCriterion("accuracy is not null");
            return (Criteria) this;
        }

        public Criteria andAccuracyEqualTo(String value) {
            addCriterion("accuracy =", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotEqualTo(String value) {
            addCriterion("accuracy <>", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThan(String value) {
            addCriterion("accuracy >", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThanOrEqualTo(String value) {
            addCriterion("accuracy >=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThan(String value) {
            addCriterion("accuracy <", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThanOrEqualTo(String value) {
            addCriterion("accuracy <=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLike(String value) {
            addCriterion("accuracy like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotLike(String value) {
            addCriterion("accuracy not like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyIn(List<String> values) {
            addCriterion("accuracy in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotIn(List<String> values) {
            addCriterion("accuracy not in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyBetween(String value1, String value2) {
            addCriterion("accuracy between", value1, value2, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotBetween(String value1, String value2) {
            addCriterion("accuracy not between", value1, value2, "accuracy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}