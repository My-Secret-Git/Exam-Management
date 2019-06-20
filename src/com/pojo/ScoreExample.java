package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("userID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("userID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andCourseIDIsNull() {
            addCriterion("courseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIDIsNotNull() {
            addCriterion("courseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIDEqualTo(String value) {
            addCriterion("courseID =", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDNotEqualTo(String value) {
            addCriterion("courseID <>", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDGreaterThan(String value) {
            addCriterion("courseID >", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDGreaterThanOrEqualTo(String value) {
            addCriterion("courseID >=", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDLessThan(String value) {
            addCriterion("courseID <", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDLessThanOrEqualTo(String value) {
            addCriterion("courseID <=", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDLike(String value) {
            addCriterion("courseID like", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDNotLike(String value) {
            addCriterion("courseID not like", value, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDIn(List<String> values) {
            addCriterion("courseID in", values, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDNotIn(List<String> values) {
            addCriterion("courseID not in", values, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDBetween(String value1, String value2) {
            addCriterion("courseID between", value1, value2, "courseID");
            return (Criteria) this;
        }

        public Criteria andCourseIDNotBetween(String value1, String value2) {
            addCriterion("courseID not between", value1, value2, "courseID");
            return (Criteria) this;
        }

        public Criteria andCjIsNull() {
            addCriterion("cj is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("cj is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(Integer value) {
            addCriterion("cj =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(Integer value) {
            addCriterion("cj <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(Integer value) {
            addCriterion("cj >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(Integer value) {
            addCriterion("cj >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(Integer value) {
            addCriterion("cj <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(Integer value) {
            addCriterion("cj <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<Integer> values) {
            addCriterion("cj in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<Integer> values) {
            addCriterion("cj not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(Integer value1, Integer value2) {
            addCriterion("cj between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(Integer value1, Integer value2) {
            addCriterion("cj not between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andPscjIsNull() {
            addCriterion("pscj is null");
            return (Criteria) this;
        }

        public Criteria andPscjIsNotNull() {
            addCriterion("pscj is not null");
            return (Criteria) this;
        }

        public Criteria andPscjEqualTo(Integer value) {
            addCriterion("pscj =", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjNotEqualTo(Integer value) {
            addCriterion("pscj <>", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjGreaterThan(Integer value) {
            addCriterion("pscj >", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjGreaterThanOrEqualTo(Integer value) {
            addCriterion("pscj >=", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjLessThan(Integer value) {
            addCriterion("pscj <", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjLessThanOrEqualTo(Integer value) {
            addCriterion("pscj <=", value, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjIn(List<Integer> values) {
            addCriterion("pscj in", values, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjNotIn(List<Integer> values) {
            addCriterion("pscj not in", values, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjBetween(Integer value1, Integer value2) {
            addCriterion("pscj between", value1, value2, "pscj");
            return (Criteria) this;
        }

        public Criteria andPscjNotBetween(Integer value1, Integer value2) {
            addCriterion("pscj not between", value1, value2, "pscj");
            return (Criteria) this;
        }

        public Criteria andKscjIsNull() {
            addCriterion("kscj is null");
            return (Criteria) this;
        }

        public Criteria andKscjIsNotNull() {
            addCriterion("kscj is not null");
            return (Criteria) this;
        }

        public Criteria andKscjEqualTo(Integer value) {
            addCriterion("kscj =", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotEqualTo(Integer value) {
            addCriterion("kscj <>", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjGreaterThan(Integer value) {
            addCriterion("kscj >", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjGreaterThanOrEqualTo(Integer value) {
            addCriterion("kscj >=", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjLessThan(Integer value) {
            addCriterion("kscj <", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjLessThanOrEqualTo(Integer value) {
            addCriterion("kscj <=", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjIn(List<Integer> values) {
            addCriterion("kscj in", values, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotIn(List<Integer> values) {
            addCriterion("kscj not in", values, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjBetween(Integer value1, Integer value2) {
            addCriterion("kscj between", value1, value2, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotBetween(Integer value1, Integer value2) {
            addCriterion("kscj not between", value1, value2, "kscj");
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