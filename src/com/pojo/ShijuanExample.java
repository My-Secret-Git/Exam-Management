package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShijuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShijuanExample() {
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

        public Criteria andShijuanmingchengIsNull() {
            addCriterion("shijuanmingcheng is null");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengIsNotNull() {
            addCriterion("shijuanmingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengEqualTo(String value) {
            addCriterion("shijuanmingcheng =", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengNotEqualTo(String value) {
            addCriterion("shijuanmingcheng <>", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengGreaterThan(String value) {
            addCriterion("shijuanmingcheng >", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("shijuanmingcheng >=", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengLessThan(String value) {
            addCriterion("shijuanmingcheng <", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengLessThanOrEqualTo(String value) {
            addCriterion("shijuanmingcheng <=", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengLike(String value) {
            addCriterion("shijuanmingcheng like", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengNotLike(String value) {
            addCriterion("shijuanmingcheng not like", value, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengIn(List<String> values) {
            addCriterion("shijuanmingcheng in", values, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengNotIn(List<String> values) {
            addCriterion("shijuanmingcheng not in", values, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengBetween(String value1, String value2) {
            addCriterion("shijuanmingcheng between", value1, value2, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andShijuanmingchengNotBetween(String value1, String value2) {
            addCriterion("shijuanmingcheng not between", value1, value2, "shijuanmingcheng");
            return (Criteria) this;
        }

        public Criteria andTimuIsNull() {
            addCriterion("timu is null");
            return (Criteria) this;
        }

        public Criteria andTimuIsNotNull() {
            addCriterion("timu is not null");
            return (Criteria) this;
        }

        public Criteria andTimuEqualTo(String value) {
            addCriterion("timu =", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuNotEqualTo(String value) {
            addCriterion("timu <>", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuGreaterThan(String value) {
            addCriterion("timu >", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuGreaterThanOrEqualTo(String value) {
            addCriterion("timu >=", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuLessThan(String value) {
            addCriterion("timu <", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuLessThanOrEqualTo(String value) {
            addCriterion("timu <=", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuLike(String value) {
            addCriterion("timu like", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuNotLike(String value) {
            addCriterion("timu not like", value, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuIn(List<String> values) {
            addCriterion("timu in", values, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuNotIn(List<String> values) {
            addCriterion("timu not in", values, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuBetween(String value1, String value2) {
            addCriterion("timu between", value1, value2, "timu");
            return (Criteria) this;
        }

        public Criteria andTimuNotBetween(String value1, String value2) {
            addCriterion("timu not between", value1, value2, "timu");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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