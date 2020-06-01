package com.news.app.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(String value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(String value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(String value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(String value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(String value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLike(String value) {
            addCriterion("img_id like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotLike(String value) {
            addCriterion("img_id not like", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<String> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<String> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(String value1, String value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(String value1, String value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNull() {
            addCriterion("img_name is null");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNotNull() {
            addCriterion("img_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameEqualTo(String value) {
            addCriterion("img_name =", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("img_name <>", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("img_name >", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_name >=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThan(String value) {
            addCriterion("img_name <", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("img_name <=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLike(String value) {
            addCriterion("img_name like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotLike(String value) {
            addCriterion("img_name not like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameIn(List<String> values) {
            addCriterion("img_name in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("img_name not in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("img_name between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("img_name not between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameIsNull() {
            addCriterion("img_display_name is null");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameIsNotNull() {
            addCriterion("img_display_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameEqualTo(String value) {
            addCriterion("img_display_name =", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameNotEqualTo(String value) {
            addCriterion("img_display_name <>", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameGreaterThan(String value) {
            addCriterion("img_display_name >", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_display_name >=", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameLessThan(String value) {
            addCriterion("img_display_name <", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("img_display_name <=", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameLike(String value) {
            addCriterion("img_display_name like", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameNotLike(String value) {
            addCriterion("img_display_name not like", value, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameIn(List<String> values) {
            addCriterion("img_display_name in", values, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameNotIn(List<String> values) {
            addCriterion("img_display_name not in", values, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameBetween(String value1, String value2) {
            addCriterion("img_display_name between", value1, value2, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgDisplayNameNotBetween(String value1, String value2) {
            addCriterion("img_display_name not between", value1, value2, "imgDisplayName");
            return (Criteria) this;
        }

        public Criteria andImgRelativeIsNull() {
            addCriterion("img_relative is null");
            return (Criteria) this;
        }

        public Criteria andImgRelativeIsNotNull() {
            addCriterion("img_relative is not null");
            return (Criteria) this;
        }

        public Criteria andImgRelativeEqualTo(String value) {
            addCriterion("img_relative =", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeNotEqualTo(String value) {
            addCriterion("img_relative <>", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeGreaterThan(String value) {
            addCriterion("img_relative >", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeGreaterThanOrEqualTo(String value) {
            addCriterion("img_relative >=", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeLessThan(String value) {
            addCriterion("img_relative <", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeLessThanOrEqualTo(String value) {
            addCriterion("img_relative <=", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeLike(String value) {
            addCriterion("img_relative like", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeNotLike(String value) {
            addCriterion("img_relative not like", value, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeIn(List<String> values) {
            addCriterion("img_relative in", values, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeNotIn(List<String> values) {
            addCriterion("img_relative not in", values, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeBetween(String value1, String value2) {
            addCriterion("img_relative between", value1, value2, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgRelativeNotBetween(String value1, String value2) {
            addCriterion("img_relative not between", value1, value2, "imgRelative");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteIsNull() {
            addCriterion("img_absolute is null");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteIsNotNull() {
            addCriterion("img_absolute is not null");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteEqualTo(String value) {
            addCriterion("img_absolute =", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteNotEqualTo(String value) {
            addCriterion("img_absolute <>", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteGreaterThan(String value) {
            addCriterion("img_absolute >", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteGreaterThanOrEqualTo(String value) {
            addCriterion("img_absolute >=", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteLessThan(String value) {
            addCriterion("img_absolute <", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteLessThanOrEqualTo(String value) {
            addCriterion("img_absolute <=", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteLike(String value) {
            addCriterion("img_absolute like", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteNotLike(String value) {
            addCriterion("img_absolute not like", value, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteIn(List<String> values) {
            addCriterion("img_absolute in", values, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteNotIn(List<String> values) {
            addCriterion("img_absolute not in", values, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteBetween(String value1, String value2) {
            addCriterion("img_absolute between", value1, value2, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgAbsoluteNotBetween(String value1, String value2) {
            addCriterion("img_absolute not between", value1, value2, "imgAbsolute");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmIsNull() {
            addCriterion("img_newsdm is null");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmIsNotNull() {
            addCriterion("img_newsdm is not null");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmEqualTo(String value) {
            addCriterion("img_newsdm =", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmNotEqualTo(String value) {
            addCriterion("img_newsdm <>", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmGreaterThan(String value) {
            addCriterion("img_newsdm >", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmGreaterThanOrEqualTo(String value) {
            addCriterion("img_newsdm >=", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmLessThan(String value) {
            addCriterion("img_newsdm <", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmLessThanOrEqualTo(String value) {
            addCriterion("img_newsdm <=", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmLike(String value) {
            addCriterion("img_newsdm like", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmNotLike(String value) {
            addCriterion("img_newsdm not like", value, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmIn(List<String> values) {
            addCriterion("img_newsdm in", values, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmNotIn(List<String> values) {
            addCriterion("img_newsdm not in", values, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmBetween(String value1, String value2) {
            addCriterion("img_newsdm between", value1, value2, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgNewsdmNotBetween(String value1, String value2) {
            addCriterion("img_newsdm not between", value1, value2, "imgNewsdm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmIsNull() {
            addCriterion("img_columndm is null");
            return (Criteria) this;
        }

        public Criteria andImgColumndmIsNotNull() {
            addCriterion("img_columndm is not null");
            return (Criteria) this;
        }

        public Criteria andImgColumndmEqualTo(Integer value) {
            addCriterion("img_columndm =", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmNotEqualTo(Integer value) {
            addCriterion("img_columndm <>", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmGreaterThan(Integer value) {
            addCriterion("img_columndm >", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_columndm >=", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmLessThan(Integer value) {
            addCriterion("img_columndm <", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmLessThanOrEqualTo(Integer value) {
            addCriterion("img_columndm <=", value, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmIn(List<Integer> values) {
            addCriterion("img_columndm in", values, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmNotIn(List<Integer> values) {
            addCriterion("img_columndm not in", values, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmBetween(Integer value1, Integer value2) {
            addCriterion("img_columndm between", value1, value2, "imgColumndm");
            return (Criteria) this;
        }

        public Criteria andImgColumndmNotBetween(Integer value1, Integer value2) {
            addCriterion("img_columndm not between", value1, value2, "imgColumndm");
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