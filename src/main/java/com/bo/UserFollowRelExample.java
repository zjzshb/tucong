package com.bo;

import java.util.ArrayList;
import java.util.List;

public class UserFollowRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFollowRelExample() {
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

        public Criteria andUserFollowIdIsNull() {
            addCriterion("USER_FOLLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdIsNotNull() {
            addCriterion("USER_FOLLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdEqualTo(Integer value) {
            addCriterion("USER_FOLLOW_ID =", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdNotEqualTo(Integer value) {
            addCriterion("USER_FOLLOW_ID <>", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdGreaterThan(Integer value) {
            addCriterion("USER_FOLLOW_ID >", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_FOLLOW_ID >=", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdLessThan(Integer value) {
            addCriterion("USER_FOLLOW_ID <", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_FOLLOW_ID <=", value, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdIn(List<Integer> values) {
            addCriterion("USER_FOLLOW_ID in", values, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdNotIn(List<Integer> values) {
            addCriterion("USER_FOLLOW_ID not in", values, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_FOLLOW_ID between", value1, value2, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andUserFollowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_FOLLOW_ID not between", value1, value2, "userFollowId");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNull() {
            addCriterion("FOLLOW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNotNull() {
            addCriterion("FOLLOW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFollowDateEqualTo(String value) {
            addCriterion("FOLLOW_DATE =", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotEqualTo(String value) {
            addCriterion("FOLLOW_DATE <>", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThan(String value) {
            addCriterion("FOLLOW_DATE >", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_DATE >=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThan(String value) {
            addCriterion("FOLLOW_DATE <", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_DATE <=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLike(String value) {
            addCriterion("FOLLOW_DATE like", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotLike(String value) {
            addCriterion("FOLLOW_DATE not like", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateIn(List<String> values) {
            addCriterion("FOLLOW_DATE in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotIn(List<String> values) {
            addCriterion("FOLLOW_DATE not in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateBetween(String value1, String value2) {
            addCriterion("FOLLOW_DATE between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_DATE not between", value1, value2, "followDate");
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