package com.bo;

import java.util.ArrayList;
import java.util.List;

public class PicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicInfoExample() {
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

        public Criteria andPicIdIsNull() {
            addCriterion("PIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("PIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Byte value) {
            addCriterion("PIC_ID =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Byte value) {
            addCriterion("PIC_ID <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Byte value) {
            addCriterion("PIC_ID >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("PIC_ID >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Byte value) {
            addCriterion("PIC_ID <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Byte value) {
            addCriterion("PIC_ID <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Byte> values) {
            addCriterion("PIC_ID in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Byte> values) {
            addCriterion("PIC_ID not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Byte value1, Byte value2) {
            addCriterion("PIC_ID between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Byte value1, Byte value2) {
            addCriterion("PIC_ID not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNull() {
            addCriterion("PIC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNotNull() {
            addCriterion("PIC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPicAddressEqualTo(String value) {
            addCriterion("PIC_ADDRESS =", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotEqualTo(String value) {
            addCriterion("PIC_ADDRESS <>", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThan(String value) {
            addCriterion("PIC_ADDRESS >", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_ADDRESS >=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThan(String value) {
            addCriterion("PIC_ADDRESS <", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThanOrEqualTo(String value) {
            addCriterion("PIC_ADDRESS <=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLike(String value) {
            addCriterion("PIC_ADDRESS like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotLike(String value) {
            addCriterion("PIC_ADDRESS not like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressIn(List<String> values) {
            addCriterion("PIC_ADDRESS in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotIn(List<String> values) {
            addCriterion("PIC_ADDRESS not in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressBetween(String value1, String value2) {
            addCriterion("PIC_ADDRESS between", value1, value2, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotBetween(String value1, String value2) {
            addCriterion("PIC_ADDRESS not between", value1, value2, "picAddress");
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

        public Criteria andPicGroupIdEqualTo(Byte value) {
            addCriterion("PIC_GROUP_ID =", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotEqualTo(Byte value) {
            addCriterion("PIC_GROUP_ID <>", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdGreaterThan(Byte value) {
            addCriterion("PIC_GROUP_ID >", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("PIC_GROUP_ID >=", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdLessThan(Byte value) {
            addCriterion("PIC_GROUP_ID <", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdLessThanOrEqualTo(Byte value) {
            addCriterion("PIC_GROUP_ID <=", value, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdIn(List<Byte> values) {
            addCriterion("PIC_GROUP_ID in", values, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotIn(List<Byte> values) {
            addCriterion("PIC_GROUP_ID not in", values, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdBetween(Byte value1, Byte value2) {
            addCriterion("PIC_GROUP_ID between", value1, value2, "picGroupId");
            return (Criteria) this;
        }

        public Criteria andPicGroupIdNotBetween(Byte value1, Byte value2) {
            addCriterion("PIC_GROUP_ID not between", value1, value2, "picGroupId");
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

        public Criteria andPicUpUserIsNull() {
            addCriterion("PIC_UP_USER is null");
            return (Criteria) this;
        }

        public Criteria andPicUpUserIsNotNull() {
            addCriterion("PIC_UP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPicUpUserEqualTo(Byte value) {
            addCriterion("PIC_UP_USER =", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserNotEqualTo(Byte value) {
            addCriterion("PIC_UP_USER <>", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserGreaterThan(Byte value) {
            addCriterion("PIC_UP_USER >", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserGreaterThanOrEqualTo(Byte value) {
            addCriterion("PIC_UP_USER >=", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserLessThan(Byte value) {
            addCriterion("PIC_UP_USER <", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserLessThanOrEqualTo(Byte value) {
            addCriterion("PIC_UP_USER <=", value, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserIn(List<Byte> values) {
            addCriterion("PIC_UP_USER in", values, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserNotIn(List<Byte> values) {
            addCriterion("PIC_UP_USER not in", values, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserBetween(Byte value1, Byte value2) {
            addCriterion("PIC_UP_USER between", value1, value2, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicUpUserNotBetween(Byte value1, Byte value2) {
            addCriterion("PIC_UP_USER not between", value1, value2, "picUpUser");
            return (Criteria) this;
        }

        public Criteria andPicStateIsNull() {
            addCriterion("PIC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPicStateIsNotNull() {
            addCriterion("PIC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPicStateEqualTo(String value) {
            addCriterion("PIC_STATE =", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateNotEqualTo(String value) {
            addCriterion("PIC_STATE <>", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateGreaterThan(String value) {
            addCriterion("PIC_STATE >", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_STATE >=", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateLessThan(String value) {
            addCriterion("PIC_STATE <", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateLessThanOrEqualTo(String value) {
            addCriterion("PIC_STATE <=", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateLike(String value) {
            addCriterion("PIC_STATE like", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateNotLike(String value) {
            addCriterion("PIC_STATE not like", value, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateIn(List<String> values) {
            addCriterion("PIC_STATE in", values, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateNotIn(List<String> values) {
            addCriterion("PIC_STATE not in", values, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateBetween(String value1, String value2) {
            addCriterion("PIC_STATE between", value1, value2, "picState");
            return (Criteria) this;
        }

        public Criteria andPicStateNotBetween(String value1, String value2) {
            addCriterion("PIC_STATE not between", value1, value2, "picState");
            return (Criteria) this;
        }

        public Criteria andPicSizeIsNull() {
            addCriterion("PIC_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPicSizeIsNotNull() {
            addCriterion("PIC_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPicSizeEqualTo(String value) {
            addCriterion("PIC_SIZE =", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotEqualTo(String value) {
            addCriterion("PIC_SIZE <>", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeGreaterThan(String value) {
            addCriterion("PIC_SIZE >", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_SIZE >=", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLessThan(String value) {
            addCriterion("PIC_SIZE <", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLessThanOrEqualTo(String value) {
            addCriterion("PIC_SIZE <=", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLike(String value) {
            addCriterion("PIC_SIZE like", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotLike(String value) {
            addCriterion("PIC_SIZE not like", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeIn(List<String> values) {
            addCriterion("PIC_SIZE in", values, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotIn(List<String> values) {
            addCriterion("PIC_SIZE not in", values, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeBetween(String value1, String value2) {
            addCriterion("PIC_SIZE between", value1, value2, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotBetween(String value1, String value2) {
            addCriterion("PIC_SIZE not between", value1, value2, "picSize");
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