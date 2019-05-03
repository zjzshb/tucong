package com.bo;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUAddressIsNull() {
            addCriterion("U_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("U_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("U_ADDRESS =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("U_ADDRESS <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("U_ADDRESS >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("U_ADDRESS >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("U_ADDRESS <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("U_ADDRESS <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("U_ADDRESS like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("U_ADDRESS not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("U_ADDRESS in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("U_ADDRESS not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("U_ADDRESS between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("U_ADDRESS not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUDisIsNull() {
            addCriterion("U_DIS is null");
            return (Criteria) this;
        }

        public Criteria andUDisIsNotNull() {
            addCriterion("U_DIS is not null");
            return (Criteria) this;
        }

        public Criteria andUDisEqualTo(String value) {
            addCriterion("U_DIS =", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisNotEqualTo(String value) {
            addCriterion("U_DIS <>", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisGreaterThan(String value) {
            addCriterion("U_DIS >", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisGreaterThanOrEqualTo(String value) {
            addCriterion("U_DIS >=", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisLessThan(String value) {
            addCriterion("U_DIS <", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisLessThanOrEqualTo(String value) {
            addCriterion("U_DIS <=", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisLike(String value) {
            addCriterion("U_DIS like", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisNotLike(String value) {
            addCriterion("U_DIS not like", value, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisIn(List<String> values) {
            addCriterion("U_DIS in", values, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisNotIn(List<String> values) {
            addCriterion("U_DIS not in", values, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisBetween(String value1, String value2) {
            addCriterion("U_DIS between", value1, value2, "uDis");
            return (Criteria) this;
        }

        public Criteria andUDisNotBetween(String value1, String value2) {
            addCriterion("U_DIS not between", value1, value2, "uDis");
            return (Criteria) this;
        }

        public Criteria andUBgIsNull() {
            addCriterion("U_BG is null");
            return (Criteria) this;
        }

        public Criteria andUBgIsNotNull() {
            addCriterion("U_BG is not null");
            return (Criteria) this;
        }

        public Criteria andUBgEqualTo(String value) {
            addCriterion("U_BG =", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgNotEqualTo(String value) {
            addCriterion("U_BG <>", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgGreaterThan(String value) {
            addCriterion("U_BG >", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgGreaterThanOrEqualTo(String value) {
            addCriterion("U_BG >=", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgLessThan(String value) {
            addCriterion("U_BG <", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgLessThanOrEqualTo(String value) {
            addCriterion("U_BG <=", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgLike(String value) {
            addCriterion("U_BG like", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgNotLike(String value) {
            addCriterion("U_BG not like", value, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgIn(List<String> values) {
            addCriterion("U_BG in", values, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgNotIn(List<String> values) {
            addCriterion("U_BG not in", values, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgBetween(String value1, String value2) {
            addCriterion("U_BG between", value1, value2, "uBg");
            return (Criteria) this;
        }

        public Criteria andUBgNotBetween(String value1, String value2) {
            addCriterion("U_BG not between", value1, value2, "uBg");
            return (Criteria) this;
        }

        public Criteria andUTxIsNull() {
            addCriterion("U_TX is null");
            return (Criteria) this;
        }

        public Criteria andUTxIsNotNull() {
            addCriterion("U_TX is not null");
            return (Criteria) this;
        }

        public Criteria andUTxEqualTo(String value) {
            addCriterion("U_TX =", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxNotEqualTo(String value) {
            addCriterion("U_TX <>", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxGreaterThan(String value) {
            addCriterion("U_TX >", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxGreaterThanOrEqualTo(String value) {
            addCriterion("U_TX >=", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxLessThan(String value) {
            addCriterion("U_TX <", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxLessThanOrEqualTo(String value) {
            addCriterion("U_TX <=", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxLike(String value) {
            addCriterion("U_TX like", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxNotLike(String value) {
            addCriterion("U_TX not like", value, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxIn(List<String> values) {
            addCriterion("U_TX in", values, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxNotIn(List<String> values) {
            addCriterion("U_TX not in", values, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxBetween(String value1, String value2) {
            addCriterion("U_TX between", value1, value2, "uTx");
            return (Criteria) this;
        }

        public Criteria andUTxNotBetween(String value1, String value2) {
            addCriterion("U_TX not between", value1, value2, "uTx");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("U_SEX like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("U_SEX not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("U_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("U_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("U_NICKNAME =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("U_NICKNAME <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("U_NICKNAME >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("U_NICKNAME <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("U_NICKNAME like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("U_NICKNAME not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("U_NICKNAME in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("U_NICKNAME not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("U_NICKNAME between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("U_NICKNAME not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIsNull() {
            addCriterion("U_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIsNotNull() {
            addCriterion("U_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeEqualTo(String value) {
            addCriterion("U_CREATETIME =", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotEqualTo(String value) {
            addCriterion("U_CREATETIME <>", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeGreaterThan(String value) {
            addCriterion("U_CREATETIME >", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("U_CREATETIME >=", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeLessThan(String value) {
            addCriterion("U_CREATETIME <", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("U_CREATETIME <=", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeLike(String value) {
            addCriterion("U_CREATETIME like", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotLike(String value) {
            addCriterion("U_CREATETIME not like", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIn(List<String> values) {
            addCriterion("U_CREATETIME in", values, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotIn(List<String> values) {
            addCriterion("U_CREATETIME not in", values, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeBetween(String value1, String value2) {
            addCriterion("U_CREATETIME between", value1, value2, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotBetween(String value1, String value2) {
            addCriterion("U_CREATETIME not between", value1, value2, "uCreatetime");
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