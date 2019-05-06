package com.bo;

import java.util.ArrayList;
import java.util.List;

public class PicLabelInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicLabelInfoExample() {
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

        public Criteria andPicLabelIdIsNull() {
            addCriterion("PIC_LABEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdIsNotNull() {
            addCriterion("PIC_LABEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdEqualTo(Integer value) {
            addCriterion("PIC_LABEL_ID =", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdNotEqualTo(Integer value) {
            addCriterion("PIC_LABEL_ID <>", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdGreaterThan(Integer value) {
            addCriterion("PIC_LABEL_ID >", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIC_LABEL_ID >=", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdLessThan(Integer value) {
            addCriterion("PIC_LABEL_ID <", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("PIC_LABEL_ID <=", value, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdIn(List<Integer> values) {
            addCriterion("PIC_LABEL_ID in", values, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdNotIn(List<Integer> values) {
            addCriterion("PIC_LABEL_ID not in", values, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("PIC_LABEL_ID between", value1, value2, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PIC_LABEL_ID not between", value1, value2, "picLabelId");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameIsNull() {
            addCriterion("PIC_LABEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameIsNotNull() {
            addCriterion("PIC_LABEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameEqualTo(String value) {
            addCriterion("PIC_LABEL_NAME =", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameNotEqualTo(String value) {
            addCriterion("PIC_LABEL_NAME <>", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameGreaterThan(String value) {
            addCriterion("PIC_LABEL_NAME >", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_LABEL_NAME >=", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameLessThan(String value) {
            addCriterion("PIC_LABEL_NAME <", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameLessThanOrEqualTo(String value) {
            addCriterion("PIC_LABEL_NAME <=", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameLike(String value) {
            addCriterion("PIC_LABEL_NAME like", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameNotLike(String value) {
            addCriterion("PIC_LABEL_NAME not like", value, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameIn(List<String> values) {
            addCriterion("PIC_LABEL_NAME in", values, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameNotIn(List<String> values) {
            addCriterion("PIC_LABEL_NAME not in", values, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameBetween(String value1, String value2) {
            addCriterion("PIC_LABEL_NAME between", value1, value2, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andPicLabelNameNotBetween(String value1, String value2) {
            addCriterion("PIC_LABEL_NAME not between", value1, value2, "picLabelName");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("CREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("CREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(String value) {
            addCriterion("CREAT_DATE =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(String value) {
            addCriterion("CREAT_DATE <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(String value) {
            addCriterion("CREAT_DATE >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_DATE >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(String value) {
            addCriterion("CREAT_DATE <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(String value) {
            addCriterion("CREAT_DATE <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLike(String value) {
            addCriterion("CREAT_DATE like", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotLike(String value) {
            addCriterion("CREAT_DATE not like", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<String> values) {
            addCriterion("CREAT_DATE in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<String> values) {
            addCriterion("CREAT_DATE not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(String value1, String value2) {
            addCriterion("CREAT_DATE between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(String value1, String value2) {
            addCriterion("CREAT_DATE not between", value1, value2, "creatDate");
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