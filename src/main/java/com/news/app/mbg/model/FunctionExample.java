package com.news.app.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionExample() {
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionUriIsNull() {
            addCriterion("function_uri is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUriIsNotNull() {
            addCriterion("function_uri is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUriEqualTo(String value) {
            addCriterion("function_uri =", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriNotEqualTo(String value) {
            addCriterion("function_uri <>", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriGreaterThan(String value) {
            addCriterion("function_uri >", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriGreaterThanOrEqualTo(String value) {
            addCriterion("function_uri >=", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriLessThan(String value) {
            addCriterion("function_uri <", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriLessThanOrEqualTo(String value) {
            addCriterion("function_uri <=", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriLike(String value) {
            addCriterion("function_uri like", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriNotLike(String value) {
            addCriterion("function_uri not like", value, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriIn(List<String> values) {
            addCriterion("function_uri in", values, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriNotIn(List<String> values) {
            addCriterion("function_uri not in", values, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriBetween(String value1, String value2) {
            addCriterion("function_uri between", value1, value2, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionUriNotBetween(String value1, String value2) {
            addCriterion("function_uri not between", value1, value2, "functionUri");
            return (Criteria) this;
        }

        public Criteria andFunctionDescIsNull() {
            addCriterion("function_desc is null");
            return (Criteria) this;
        }

        public Criteria andFunctionDescIsNotNull() {
            addCriterion("function_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionDescEqualTo(String value) {
            addCriterion("function_desc =", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescNotEqualTo(String value) {
            addCriterion("function_desc <>", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescGreaterThan(String value) {
            addCriterion("function_desc >", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescGreaterThanOrEqualTo(String value) {
            addCriterion("function_desc >=", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescLessThan(String value) {
            addCriterion("function_desc <", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescLessThanOrEqualTo(String value) {
            addCriterion("function_desc <=", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescLike(String value) {
            addCriterion("function_desc like", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescNotLike(String value) {
            addCriterion("function_desc not like", value, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescIn(List<String> values) {
            addCriterion("function_desc in", values, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescNotIn(List<String> values) {
            addCriterion("function_desc not in", values, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescBetween(String value1, String value2) {
            addCriterion("function_desc between", value1, value2, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionDescNotBetween(String value1, String value2) {
            addCriterion("function_desc not between", value1, value2, "functionDesc");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateIsNull() {
            addCriterion("function_mod_date is null");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateIsNotNull() {
            addCriterion("function_mod_date is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateEqualTo(Date value) {
            addCriterion("function_mod_date =", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateNotEqualTo(Date value) {
            addCriterion("function_mod_date <>", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateGreaterThan(Date value) {
            addCriterion("function_mod_date >", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateGreaterThanOrEqualTo(Date value) {
            addCriterion("function_mod_date >=", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateLessThan(Date value) {
            addCriterion("function_mod_date <", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateLessThanOrEqualTo(Date value) {
            addCriterion("function_mod_date <=", value, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateIn(List<Date> values) {
            addCriterion("function_mod_date in", values, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateNotIn(List<Date> values) {
            addCriterion("function_mod_date not in", values, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateBetween(Date value1, Date value2) {
            addCriterion("function_mod_date between", value1, value2, "functionModDate");
            return (Criteria) this;
        }

        public Criteria andFunctionModDateNotBetween(Date value1, Date value2) {
            addCriterion("function_mod_date not between", value1, value2, "functionModDate");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
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