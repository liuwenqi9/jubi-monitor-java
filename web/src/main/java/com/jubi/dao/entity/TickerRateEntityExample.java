package com.jubi.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class TickerRateEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TickerRateEntityExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(String value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(String value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(String value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(String value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(String value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(String value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLike(String value) {
            addCriterion("coin like", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotLike(String value) {
            addCriterion("coin not like", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<String> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<String> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(String value1, String value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(String value1, String value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andPkIsNull() {
            addCriterion("pk is null");
            return (Criteria) this;
        }

        public Criteria andPkIsNotNull() {
            addCriterion("pk is not null");
            return (Criteria) this;
        }

        public Criteria andPkEqualTo(Integer value) {
            addCriterion("pk =", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotEqualTo(Integer value) {
            addCriterion("pk <>", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThan(Integer value) {
            addCriterion("pk >", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk >=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThan(Integer value) {
            addCriterion("pk <", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThanOrEqualTo(Integer value) {
            addCriterion("pk <=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkIn(List<Integer> values) {
            addCriterion("pk in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotIn(List<Integer> values) {
            addCriterion("pk not in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkBetween(Integer value1, Integer value2) {
            addCriterion("pk between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotBetween(Integer value1, Integer value2) {
            addCriterion("pk not between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
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