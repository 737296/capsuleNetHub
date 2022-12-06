package com.capsule.springcloud.cnh.hub.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainHistoryExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsIsNull() {
            addCriterion("train_epochs is null");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsIsNotNull() {
            addCriterion("train_epochs is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsEqualTo(String value) {
            addCriterion("train_epochs =", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsNotEqualTo(String value) {
            addCriterion("train_epochs <>", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsGreaterThan(String value) {
            addCriterion("train_epochs >", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsGreaterThanOrEqualTo(String value) {
            addCriterion("train_epochs >=", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsLessThan(String value) {
            addCriterion("train_epochs <", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsLessThanOrEqualTo(String value) {
            addCriterion("train_epochs <=", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsLike(String value) {
            addCriterion("train_epochs like", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsNotLike(String value) {
            addCriterion("train_epochs not like", value, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsIn(List<String> values) {
            addCriterion("train_epochs in", values, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsNotIn(List<String> values) {
            addCriterion("train_epochs not in", values, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsBetween(String value1, String value2) {
            addCriterion("train_epochs between", value1, value2, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainEpochsNotBetween(String value1, String value2) {
            addCriterion("train_epochs not between", value1, value2, "trainEpochs");
            return (Criteria) this;
        }

        public Criteria andTrainTimeIsNull() {
            addCriterion("train_time is null");
            return (Criteria) this;
        }

        public Criteria andTrainTimeIsNotNull() {
            addCriterion("train_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrainTimeEqualTo(String value) {
            addCriterion("train_time =", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeNotEqualTo(String value) {
            addCriterion("train_time <>", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeGreaterThan(String value) {
            addCriterion("train_time >", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeGreaterThanOrEqualTo(String value) {
            addCriterion("train_time >=", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeLessThan(String value) {
            addCriterion("train_time <", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeLessThanOrEqualTo(String value) {
            addCriterion("train_time <=", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeLike(String value) {
            addCriterion("train_time like", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeNotLike(String value) {
            addCriterion("train_time not like", value, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeIn(List<String> values) {
            addCriterion("train_time in", values, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeNotIn(List<String> values) {
            addCriterion("train_time not in", values, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeBetween(String value1, String value2) {
            addCriterion("train_time between", value1, value2, "trainTime");
            return (Criteria) this;
        }

        public Criteria andTrainTimeNotBetween(String value1, String value2) {
            addCriterion("train_time not between", value1, value2, "trainTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameIsNull() {
            addCriterion("train_model_name is null");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameIsNotNull() {
            addCriterion("train_model_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameEqualTo(String value) {
            addCriterion("train_model_name =", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameNotEqualTo(String value) {
            addCriterion("train_model_name <>", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameGreaterThan(String value) {
            addCriterion("train_model_name >", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("train_model_name >=", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameLessThan(String value) {
            addCriterion("train_model_name <", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameLessThanOrEqualTo(String value) {
            addCriterion("train_model_name <=", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameLike(String value) {
            addCriterion("train_model_name like", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameNotLike(String value) {
            addCriterion("train_model_name not like", value, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameIn(List<String> values) {
            addCriterion("train_model_name in", values, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameNotIn(List<String> values) {
            addCriterion("train_model_name not in", values, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameBetween(String value1, String value2) {
            addCriterion("train_model_name between", value1, value2, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelNameNotBetween(String value1, String value2) {
            addCriterion("train_model_name not between", value1, value2, "trainModelName");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIsNull() {
            addCriterion("train_model_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIsNotNull() {
            addCriterion("train_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdEqualTo(String value) {
            addCriterion("train_model_id =", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotEqualTo(String value) {
            addCriterion("train_model_id <>", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdGreaterThan(String value) {
            addCriterion("train_model_id >", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("train_model_id >=", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdLessThan(String value) {
            addCriterion("train_model_id <", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdLessThanOrEqualTo(String value) {
            addCriterion("train_model_id <=", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdLike(String value) {
            addCriterion("train_model_id like", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotLike(String value) {
            addCriterion("train_model_id not like", value, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdIn(List<String> values) {
            addCriterion("train_model_id in", values, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotIn(List<String> values) {
            addCriterion("train_model_id not in", values, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdBetween(String value1, String value2) {
            addCriterion("train_model_id between", value1, value2, "trainModelId");
            return (Criteria) this;
        }

        public Criteria andTrainModelIdNotBetween(String value1, String value2) {
            addCriterion("train_model_id not between", value1, value2, "trainModelId");
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