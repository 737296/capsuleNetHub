package com.capsule.springcloud.cnh.hub.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class PredictHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PredictHistoryExample() {
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

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andPredictReslutIsNull() {
            addCriterion("predict_reslut is null");
            return (Criteria) this;
        }

        public Criteria andPredictReslutIsNotNull() {
            addCriterion("predict_reslut is not null");
            return (Criteria) this;
        }

        public Criteria andPredictReslutEqualTo(String value) {
            addCriterion("predict_reslut =", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutNotEqualTo(String value) {
            addCriterion("predict_reslut <>", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutGreaterThan(String value) {
            addCriterion("predict_reslut >", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutGreaterThanOrEqualTo(String value) {
            addCriterion("predict_reslut >=", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutLessThan(String value) {
            addCriterion("predict_reslut <", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutLessThanOrEqualTo(String value) {
            addCriterion("predict_reslut <=", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutLike(String value) {
            addCriterion("predict_reslut like", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutNotLike(String value) {
            addCriterion("predict_reslut not like", value, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutIn(List<String> values) {
            addCriterion("predict_reslut in", values, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutNotIn(List<String> values) {
            addCriterion("predict_reslut not in", values, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutBetween(String value1, String value2) {
            addCriterion("predict_reslut between", value1, value2, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictReslutNotBetween(String value1, String value2) {
            addCriterion("predict_reslut not between", value1, value2, "predictReslut");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(String value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(String value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(String value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(String value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(String value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLike(String value) {
            addCriterion("predict_time like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotLike(String value) {
            addCriterion("predict_time not like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<String> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<String> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(String value1, String value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(String value1, String value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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