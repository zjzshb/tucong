package com.bo;

import java.util.ArrayList;
import java.util.List;

public class PicCommentRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicCommentRelExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("COMMENT_ID =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("COMMENT_ID <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("COMMENT_ID >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_ID >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("COMMENT_ID <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_ID <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("COMMENT_ID in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("COMMENT_ID not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdIsNull() {
            addCriterion("PIC_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdIsNotNull() {
            addCriterion("PIC_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdEqualTo(Integer value) {
            addCriterion("PIC_GROUP_ID =", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotEqualTo(Integer value) {
            addCriterion("PIC_GROUP_ID <>", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdGreaterThan(Integer value) {
            addCriterion("PIC_GROUP_ID >", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIC_GROUP_ID >=", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdLessThan(Integer value) {
            addCriterion("PIC_GROUP_ID <", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("PIC_GROUP_ID <=", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdIn(List<Integer> values) {
            addCriterion("PIC_GROUP_ID in", values, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotIn(List<Integer> values) {
            addCriterion("PIC_GROUP_ID not in", values, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("PIC_GROUP_ID between", value1, value2, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PIC_GROUP_ID not between", value1, value2, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCommMainIsNull() {
            addCriterion("COMM_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andCommMainIsNotNull() {
            addCriterion("COMM_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCommMainEqualTo(String value) {
            addCriterion("COMM_MAIN =", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainNotEqualTo(String value) {
            addCriterion("COMM_MAIN <>", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainGreaterThan(String value) {
            addCriterion("COMM_MAIN >", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_MAIN >=", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainLessThan(String value) {
            addCriterion("COMM_MAIN <", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainLessThanOrEqualTo(String value) {
            addCriterion("COMM_MAIN <=", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainLike(String value) {
            addCriterion("COMM_MAIN like", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainNotLike(String value) {
            addCriterion("COMM_MAIN not like", value, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainIn(List<String> values) {
            addCriterion("COMM_MAIN in", values, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainNotIn(List<String> values) {
            addCriterion("COMM_MAIN not in", values, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainBetween(String value1, String value2) {
            addCriterion("COMM_MAIN between", value1, value2, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommMainNotBetween(String value1, String value2) {
            addCriterion("COMM_MAIN not between", value1, value2, "commMain");
            return (Criteria) this;
        }

        public Criteria andCommDateIsNull() {
            addCriterion("COMM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCommDateIsNotNull() {
            addCriterion("COMM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommDateEqualTo(String value) {
            addCriterion("COMM_DATE =", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotEqualTo(String value) {
            addCriterion("COMM_DATE <>", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateGreaterThan(String value) {
            addCriterion("COMM_DATE >", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_DATE >=", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLessThan(String value) {
            addCriterion("COMM_DATE <", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLessThanOrEqualTo(String value) {
            addCriterion("COMM_DATE <=", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateLike(String value) {
            addCriterion("COMM_DATE like", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotLike(String value) {
            addCriterion("COMM_DATE not like", value, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateIn(List<String> values) {
            addCriterion("COMM_DATE in", values, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotIn(List<String> values) {
            addCriterion("COMM_DATE not in", values, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateBetween(String value1, String value2) {
            addCriterion("COMM_DATE between", value1, value2, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommDateNotBetween(String value1, String value2) {
            addCriterion("COMM_DATE not between", value1, value2, "commDate");
            return (Criteria) this;
        }

        public Criteria andCommStateIsNull() {
            addCriterion("COMM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCommStateIsNotNull() {
            addCriterion("COMM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommStateEqualTo(String value) {
            addCriterion("COMM_STATE =", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotEqualTo(String value) {
            addCriterion("COMM_STATE <>", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateGreaterThan(String value) {
            addCriterion("COMM_STATE >", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_STATE >=", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateLessThan(String value) {
            addCriterion("COMM_STATE <", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateLessThanOrEqualTo(String value) {
            addCriterion("COMM_STATE <=", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateLike(String value) {
            addCriterion("COMM_STATE like", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotLike(String value) {
            addCriterion("COMM_STATE not like", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateIn(List<String> values) {
            addCriterion("COMM_STATE in", values, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotIn(List<String> values) {
            addCriterion("COMM_STATE not in", values, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateBetween(String value1, String value2) {
            addCriterion("COMM_STATE between", value1, value2, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotBetween(String value1, String value2) {
            addCriterion("COMM_STATE not between", value1, value2, "commState");
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