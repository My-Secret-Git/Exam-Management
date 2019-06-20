package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionIDIsNull() {
            addCriterion("questionID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIDIsNotNull() {
            addCriterion("questionID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIDEqualTo(Integer value) {
            addCriterion("questionID =", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDNotEqualTo(Integer value) {
            addCriterion("questionID <>", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDGreaterThan(Integer value) {
            addCriterion("questionID >", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionID >=", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDLessThan(Integer value) {
            addCriterion("questionID <", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDLessThanOrEqualTo(Integer value) {
            addCriterion("questionID <=", value, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDIn(List<Integer> values) {
            addCriterion("questionID in", values, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDNotIn(List<Integer> values) {
            addCriterion("questionID not in", values, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDBetween(Integer value1, Integer value2) {
            addCriterion("questionID between", value1, value2, "questionID");
            return (Criteria) this;
        }

        public Criteria andQuestionIDNotBetween(Integer value1, Integer value2) {
            addCriterion("questionID not between", value1, value2, "questionID");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNull() {
            addCriterion("choiceA is null");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNotNull() {
            addCriterion("choiceA is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceAEqualTo(String value) {
            addCriterion("choiceA =", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotEqualTo(String value) {
            addCriterion("choiceA <>", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThan(String value) {
            addCriterion("choiceA >", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThanOrEqualTo(String value) {
            addCriterion("choiceA >=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThan(String value) {
            addCriterion("choiceA <", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThanOrEqualTo(String value) {
            addCriterion("choiceA <=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALike(String value) {
            addCriterion("choiceA like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotLike(String value) {
            addCriterion("choiceA not like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAIn(List<String> values) {
            addCriterion("choiceA in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotIn(List<String> values) {
            addCriterion("choiceA not in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceABetween(String value1, String value2) {
            addCriterion("choiceA between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotBetween(String value1, String value2) {
            addCriterion("choiceA not between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNull() {
            addCriterion("choiceB is null");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNotNull() {
            addCriterion("choiceB is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceBEqualTo(String value) {
            addCriterion("choiceB =", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotEqualTo(String value) {
            addCriterion("choiceB <>", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThan(String value) {
            addCriterion("choiceB >", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThanOrEqualTo(String value) {
            addCriterion("choiceB >=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThan(String value) {
            addCriterion("choiceB <", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThanOrEqualTo(String value) {
            addCriterion("choiceB <=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLike(String value) {
            addCriterion("choiceB like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotLike(String value) {
            addCriterion("choiceB not like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBIn(List<String> values) {
            addCriterion("choiceB in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotIn(List<String> values) {
            addCriterion("choiceB not in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBBetween(String value1, String value2) {
            addCriterion("choiceB between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotBetween(String value1, String value2) {
            addCriterion("choiceB not between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNull() {
            addCriterion("choiceC is null");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNotNull() {
            addCriterion("choiceC is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceCEqualTo(String value) {
            addCriterion("choiceC =", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotEqualTo(String value) {
            addCriterion("choiceC <>", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThan(String value) {
            addCriterion("choiceC >", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThanOrEqualTo(String value) {
            addCriterion("choiceC >=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThan(String value) {
            addCriterion("choiceC <", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThanOrEqualTo(String value) {
            addCriterion("choiceC <=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLike(String value) {
            addCriterion("choiceC like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotLike(String value) {
            addCriterion("choiceC not like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCIn(List<String> values) {
            addCriterion("choiceC in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotIn(List<String> values) {
            addCriterion("choiceC not in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCBetween(String value1, String value2) {
            addCriterion("choiceC between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotBetween(String value1, String value2) {
            addCriterion("choiceC not between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNull() {
            addCriterion("choiceD is null");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNotNull() {
            addCriterion("choiceD is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceDEqualTo(String value) {
            addCriterion("choiceD =", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotEqualTo(String value) {
            addCriterion("choiceD <>", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThan(String value) {
            addCriterion("choiceD >", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThanOrEqualTo(String value) {
            addCriterion("choiceD >=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThan(String value) {
            addCriterion("choiceD <", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThanOrEqualTo(String value) {
            addCriterion("choiceD <=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLike(String value) {
            addCriterion("choiceD like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotLike(String value) {
            addCriterion("choiceD not like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDIn(List<String> values) {
            addCriterion("choiceD in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotIn(List<String> values) {
            addCriterion("choiceD not in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDBetween(String value1, String value2) {
            addCriterion("choiceD between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotBetween(String value1, String value2) {
            addCriterion("choiceD not between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andTypeIDIsNull() {
            addCriterion("typeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIDIsNotNull() {
            addCriterion("typeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIDEqualTo(String value) {
            addCriterion("typeID =", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotEqualTo(String value) {
            addCriterion("typeID <>", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDGreaterThan(String value) {
            addCriterion("typeID >", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDGreaterThanOrEqualTo(String value) {
            addCriterion("typeID >=", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDLessThan(String value) {
            addCriterion("typeID <", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDLessThanOrEqualTo(String value) {
            addCriterion("typeID <=", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDLike(String value) {
            addCriterion("typeID like", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotLike(String value) {
            addCriterion("typeID not like", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDIn(List<String> values) {
            addCriterion("typeID in", values, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotIn(List<String> values) {
            addCriterion("typeID not in", values, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDBetween(String value1, String value2) {
            addCriterion("typeID between", value1, value2, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotBetween(String value1, String value2) {
            addCriterion("typeID not between", value1, value2, "typeID");
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