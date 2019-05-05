package com.bo;

import java.util.ArrayList;
import java.util.List;

public class PicGroupInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicGroupInfoExample() {
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

        public Criteria andPicDescribeIsNull() {
            addCriterion("PIC_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andPicDescribeIsNotNull() {
            addCriterion("PIC_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andPicDescribeEqualTo(String value) {
            addCriterion("PIC_DESCRIBE =", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotEqualTo(String value) {
            addCriterion("PIC_DESCRIBE <>", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeGreaterThan(String value) {
            addCriterion("PIC_DESCRIBE >", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_DESCRIBE >=", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLessThan(String value) {
            addCriterion("PIC_DESCRIBE <", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLessThanOrEqualTo(String value) {
            addCriterion("PIC_DESCRIBE <=", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLike(String value) {
            addCriterion("PIC_DESCRIBE like", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotLike(String value) {
            addCriterion("PIC_DESCRIBE not like", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeIn(List<String> values) {
            addCriterion("PIC_DESCRIBE in", values, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotIn(List<String> values) {
            addCriterion("PIC_DESCRIBE not in", values, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeBetween(String value1, String value2) {
            addCriterion("PIC_DESCRIBE between", value1, value2, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotBetween(String value1, String value2) {
            addCriterion("PIC_DESCRIBE not between", value1, value2, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicUpDateIsNull() {
            addCriterion("PIC_UP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPicUpDateIsNotNull() {
            addCriterion("PIC_UP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPicUpDateEqualTo(String value) {
            addCriterion("PIC_UP_DATE =", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateNotEqualTo(String value) {
            addCriterion("PIC_UP_DATE <>", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateGreaterThan(String value) {
            addCriterion("PIC_UP_DATE >", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_UP_DATE >=", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateLessThan(String value) {
            addCriterion("PIC_UP_DATE <", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateLessThanOrEqualTo(String value) {
            addCriterion("PIC_UP_DATE <=", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateLike(String value) {
            addCriterion("PIC_UP_DATE like", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateNotLike(String value) {
            addCriterion("PIC_UP_DATE not like", value, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateIn(List<String> values) {
            addCriterion("PIC_UP_DATE in", values, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateNotIn(List<String> values) {
            addCriterion("PIC_UP_DATE not in", values, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateBetween(String value1, String value2) {
            addCriterion("PIC_UP_DATE between", value1, value2, "picUpDate");
            return (Criteria) this;
        }

        public Criteria andPicUpDateNotBetween(String value1, String value2) {
            addCriterion("PIC_UP_DATE not between", value1, value2, "picUpDate");
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

        public Criteria andPicGroupStateIsNull() {
            addCriterion("PIC_GROUP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateIsNotNull() {
            addCriterion("PIC_GROUP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateEqualTo(String value) {
            addCriterion("PIC_GROUP_STATE =", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateNotEqualTo(String value) {
            addCriterion("PIC_GROUP_STATE <>", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateGreaterThan(String value) {
            addCriterion("PIC_GROUP_STATE >", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_GROUP_STATE >=", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateLessThan(String value) {
            addCriterion("PIC_GROUP_STATE <", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateLessThanOrEqualTo(String value) {
            addCriterion("PIC_GROUP_STATE <=", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateLike(String value) {
            addCriterion("PIC_GROUP_STATE like", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateNotLike(String value) {
            addCriterion("PIC_GROUP_STATE not like", value, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateIn(List<String> values) {
            addCriterion("PIC_GROUP_STATE in", values, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateNotIn(List<String> values) {
            addCriterion("PIC_GROUP_STATE not in", values, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateBetween(String value1, String value2) {
            addCriterion("PIC_GROUP_STATE between", value1, value2, "picGroupState");
            return (Criteria) this;
        }

        public Criteria andPicGroupStateNotBetween(String value1, String value2) {
            addCriterion("PIC_GROUP_STATE not between", value1, value2, "picGroupState");
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