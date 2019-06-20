package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class BanjiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BanjiExample() {
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

        public Criteria andBjdhIsNull() {
            addCriterion("bjdh is null");
            return (Criteria) this;
        }

        public Criteria andBjdhIsNotNull() {
            addCriterion("bjdh is not null");
            return (Criteria) this;
        }

        public Criteria andBjdhEqualTo(String value) {
            addCriterion("bjdh =", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotEqualTo(String value) {
            addCriterion("bjdh <>", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhGreaterThan(String value) {
            addCriterion("bjdh >", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhGreaterThanOrEqualTo(String value) {
            addCriterion("bjdh >=", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLessThan(String value) {
            addCriterion("bjdh <", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLessThanOrEqualTo(String value) {
            addCriterion("bjdh <=", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhLike(String value) {
            addCriterion("bjdh like", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotLike(String value) {
            addCriterion("bjdh not like", value, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhIn(List<String> values) {
            addCriterion("bjdh in", values, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotIn(List<String> values) {
            addCriterion("bjdh not in", values, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhBetween(String value1, String value2) {
            addCriterion("bjdh between", value1, value2, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjdhNotBetween(String value1, String value2) {
            addCriterion("bjdh not between", value1, value2, "bjdh");
            return (Criteria) this;
        }

        public Criteria andBjmcIsNull() {
            addCriterion("bjmc is null");
            return (Criteria) this;
        }

        public Criteria andBjmcIsNotNull() {
            addCriterion("bjmc is not null");
            return (Criteria) this;
        }

        public Criteria andBjmcEqualTo(String value) {
            addCriterion("bjmc =", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotEqualTo(String value) {
            addCriterion("bjmc <>", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcGreaterThan(String value) {
            addCriterion("bjmc >", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcGreaterThanOrEqualTo(String value) {
            addCriterion("bjmc >=", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLessThan(String value) {
            addCriterion("bjmc <", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLessThanOrEqualTo(String value) {
            addCriterion("bjmc <=", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcLike(String value) {
            addCriterion("bjmc like", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotLike(String value) {
            addCriterion("bjmc not like", value, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcIn(List<String> values) {
            addCriterion("bjmc in", values, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotIn(List<String> values) {
            addCriterion("bjmc not in", values, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcBetween(String value1, String value2) {
            addCriterion("bjmc between", value1, value2, "bjmc");
            return (Criteria) this;
        }

        public Criteria andBjmcNotBetween(String value1, String value2) {
            addCriterion("bjmc not between", value1, value2, "bjmc");
            return (Criteria) this;
        }

        public Criteria andXydhIsNull() {
            addCriterion("xydh is null");
            return (Criteria) this;
        }

        public Criteria andXydhIsNotNull() {
            addCriterion("xydh is not null");
            return (Criteria) this;
        }

        public Criteria andXydhEqualTo(String value) {
            addCriterion("xydh =", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhNotEqualTo(String value) {
            addCriterion("xydh <>", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhGreaterThan(String value) {
            addCriterion("xydh >", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhGreaterThanOrEqualTo(String value) {
            addCriterion("xydh >=", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhLessThan(String value) {
            addCriterion("xydh <", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhLessThanOrEqualTo(String value) {
            addCriterion("xydh <=", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhLike(String value) {
            addCriterion("xydh like", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhNotLike(String value) {
            addCriterion("xydh not like", value, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhIn(List<String> values) {
            addCriterion("xydh in", values, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhNotIn(List<String> values) {
            addCriterion("xydh not in", values, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhBetween(String value1, String value2) {
            addCriterion("xydh between", value1, value2, "xydh");
            return (Criteria) this;
        }

        public Criteria andXydhNotBetween(String value1, String value2) {
            addCriterion("xydh not between", value1, value2, "xydh");
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