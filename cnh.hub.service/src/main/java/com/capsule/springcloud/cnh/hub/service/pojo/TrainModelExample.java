package com.capsule.springcloud.cnh.hub.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainModelExample() {
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

        public Criteria andTrainModelPathIsNull() {
            addCriterion("train_model_path is null");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathIsNotNull() {
            addCriterion("train_model_path is not null");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathEqualTo(String value) {
            addCriterion("train_model_path =", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathNotEqualTo(String value) {
            addCriterion("train_model_path <>", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathGreaterThan(String value) {
            addCriterion("train_model_path >", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathGreaterThanOrEqualTo(String value) {
            addCriterion("train_model_path >=", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathLessThan(String value) {
            addCriterion("train_model_path <", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathLessThanOrEqualTo(String value) {
            addCriterion("train_model_path <=", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathLike(String value) {
            addCriterion("train_model_path like", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathNotLike(String value) {
            addCriterion("train_model_path not like", value, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathIn(List<String> values) {
            addCriterion("train_model_path in", values, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathNotIn(List<String> values) {
            addCriterion("train_model_path not in", values, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathBetween(String value1, String value2) {
            addCriterion("train_model_path between", value1, value2, "trainModelPath");
            return (Criteria) this;
        }

        public Criteria andTrainModelPathNotBetween(String value1, String value2) {
            addCriterion("train_model_path not between", value1, value2, "trainModelPath");
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