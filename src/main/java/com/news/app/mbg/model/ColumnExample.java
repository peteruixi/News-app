package com.news.app.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnExample() {
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

        public Criteria andColumnIdIsNull() {
            addCriterion("column_id is null");
            return (Criteria) this;
        }

        public Criteria andColumnIdIsNotNull() {
            addCriterion("column_id is not null");
            return (Criteria) this;
        }

        public Criteria andColumnIdEqualTo(Integer value) {
            addCriterion("column_id =", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotEqualTo(Integer value) {
            addCriterion("column_id <>", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThan(Integer value) {
            addCriterion("column_id >", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_id >=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThan(Integer value) {
            addCriterion("column_id <", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThanOrEqualTo(Integer value) {
            addCriterion("column_id <=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdIn(List<Integer> values) {
            addCriterion("column_id in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotIn(List<Integer> values) {
            addCriterion("column_id not in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdBetween(Integer value1, Integer value2) {
            addCriterion("column_id between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("column_id not between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnFidIsNull() {
            addCriterion("column_fid is null");
            return (Criteria) this;
        }

        public Criteria andColumnFidIsNotNull() {
            addCriterion("column_fid is not null");
            return (Criteria) this;
        }

        public Criteria andColumnFidEqualTo(Integer value) {
            addCriterion("column_fid =", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidNotEqualTo(Integer value) {
            addCriterion("column_fid <>", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidGreaterThan(Integer value) {
            addCriterion("column_fid >", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_fid >=", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidLessThan(Integer value) {
            addCriterion("column_fid <", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidLessThanOrEqualTo(Integer value) {
            addCriterion("column_fid <=", value, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidIn(List<Integer> values) {
            addCriterion("column_fid in", values, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidNotIn(List<Integer> values) {
            addCriterion("column_fid not in", values, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidBetween(Integer value1, Integer value2) {
            addCriterion("column_fid between", value1, value2, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnFidNotBetween(Integer value1, Integer value2) {
            addCriterion("column_fid not between", value1, value2, "columnFid");
            return (Criteria) this;
        }

        public Criteria andColumnDescIsNull() {
            addCriterion("column_desc is null");
            return (Criteria) this;
        }

        public Criteria andColumnDescIsNotNull() {
            addCriterion("column_desc is not null");
            return (Criteria) this;
        }

        public Criteria andColumnDescEqualTo(String value) {
            addCriterion("column_desc =", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotEqualTo(String value) {
            addCriterion("column_desc <>", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescGreaterThan(String value) {
            addCriterion("column_desc >", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescGreaterThanOrEqualTo(String value) {
            addCriterion("column_desc >=", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLessThan(String value) {
            addCriterion("column_desc <", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLessThanOrEqualTo(String value) {
            addCriterion("column_desc <=", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLike(String value) {
            addCriterion("column_desc like", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotLike(String value) {
            addCriterion("column_desc not like", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescIn(List<String> values) {
            addCriterion("column_desc in", values, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotIn(List<String> values) {
            addCriterion("column_desc not in", values, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescBetween(String value1, String value2) {
            addCriterion("column_desc between", value1, value2, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotBetween(String value1, String value2) {
            addCriterion("column_desc not between", value1, value2, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateIsNull() {
            addCriterion("column_update_date is null");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateIsNotNull() {
            addCriterion("column_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateEqualTo(Date value) {
            addCriterion("column_update_date =", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateNotEqualTo(Date value) {
            addCriterion("column_update_date <>", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateGreaterThan(Date value) {
            addCriterion("column_update_date >", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("column_update_date >=", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateLessThan(Date value) {
            addCriterion("column_update_date <", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("column_update_date <=", value, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateIn(List<Date> values) {
            addCriterion("column_update_date in", values, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateNotIn(List<Date> values) {
            addCriterion("column_update_date not in", values, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateBetween(Date value1, Date value2) {
            addCriterion("column_update_date between", value1, value2, "columnUpdateDate");
            return (Criteria) this;
        }

        public Criteria andColumnUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("column_update_date not between", value1, value2, "columnUpdateDate");
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