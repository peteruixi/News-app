package com.news.app.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNull() {
            addCriterion("userinfo_name is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNotNull() {
            addCriterion("userinfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameEqualTo(String value) {
            addCriterion("userinfo_name =", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotEqualTo(String value) {
            addCriterion("userinfo_name <>", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThan(String value) {
            addCriterion("userinfo_name >", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_name >=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThan(String value) {
            addCriterion("userinfo_name <", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThanOrEqualTo(String value) {
            addCriterion("userinfo_name <=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLike(String value) {
            addCriterion("userinfo_name like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotLike(String value) {
            addCriterion("userinfo_name not like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIn(List<String> values) {
            addCriterion("userinfo_name in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotIn(List<String> values) {
            addCriterion("userinfo_name not in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameBetween(String value1, String value2) {
            addCriterion("userinfo_name between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotBetween(String value1, String value2) {
            addCriterion("userinfo_name not between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNull() {
            addCriterion("userinfo_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNotNull() {
            addCriterion("userinfo_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexEqualTo(String value) {
            addCriterion("userinfo_sex =", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotEqualTo(String value) {
            addCriterion("userinfo_sex <>", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThan(String value) {
            addCriterion("userinfo_sex >", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_sex >=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThan(String value) {
            addCriterion("userinfo_sex <", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThanOrEqualTo(String value) {
            addCriterion("userinfo_sex <=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLike(String value) {
            addCriterion("userinfo_sex like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotLike(String value) {
            addCriterion("userinfo_sex not like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIn(List<String> values) {
            addCriterion("userinfo_sex in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotIn(List<String> values) {
            addCriterion("userinfo_sex not in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexBetween(String value1, String value2) {
            addCriterion("userinfo_sex between", value1, value2, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotBetween(String value1, String value2) {
            addCriterion("userinfo_sex not between", value1, value2, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayIsNull() {
            addCriterion("userinfo_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayIsNotNull() {
            addCriterion("userinfo_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("userinfo_birthday =", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("userinfo_birthday <>", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("userinfo_birthday >", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userinfo_birthday >=", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("userinfo_birthday <", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userinfo_birthday <=", value, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("userinfo_birthday in", values, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("userinfo_birthday not in", values, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userinfo_birthday between", value1, value2, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userinfo_birthday not between", value1, value2, "userinfoBirthday");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNull() {
            addCriterion("userinfo_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIsNotNull() {
            addCriterion("userinfo_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneEqualTo(String value) {
            addCriterion("userinfo_phone =", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotEqualTo(String value) {
            addCriterion("userinfo_phone <>", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThan(String value) {
            addCriterion("userinfo_phone >", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_phone >=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThan(String value) {
            addCriterion("userinfo_phone <", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLessThanOrEqualTo(String value) {
            addCriterion("userinfo_phone <=", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneLike(String value) {
            addCriterion("userinfo_phone like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotLike(String value) {
            addCriterion("userinfo_phone not like", value, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneIn(List<String> values) {
            addCriterion("userinfo_phone in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotIn(List<String> values) {
            addCriterion("userinfo_phone not in", values, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneBetween(String value1, String value2) {
            addCriterion("userinfo_phone between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoPhoneNotBetween(String value1, String value2) {
            addCriterion("userinfo_phone not between", value1, value2, "userinfoPhone");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailIsNull() {
            addCriterion("userinfo_email is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailIsNotNull() {
            addCriterion("userinfo_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailEqualTo(String value) {
            addCriterion("userinfo_email =", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailNotEqualTo(String value) {
            addCriterion("userinfo_email <>", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailGreaterThan(String value) {
            addCriterion("userinfo_email >", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_email >=", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailLessThan(String value) {
            addCriterion("userinfo_email <", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailLessThanOrEqualTo(String value) {
            addCriterion("userinfo_email <=", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailLike(String value) {
            addCriterion("userinfo_email like", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailNotLike(String value) {
            addCriterion("userinfo_email not like", value, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailIn(List<String> values) {
            addCriterion("userinfo_email in", values, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailNotIn(List<String> values) {
            addCriterion("userinfo_email not in", values, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailBetween(String value1, String value2) {
            addCriterion("userinfo_email between", value1, value2, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoEmailNotBetween(String value1, String value2) {
            addCriterion("userinfo_email not between", value1, value2, "userinfoEmail");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescIsNull() {
            addCriterion("userinfo_desc is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescIsNotNull() {
            addCriterion("userinfo_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescEqualTo(String value) {
            addCriterion("userinfo_desc =", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescNotEqualTo(String value) {
            addCriterion("userinfo_desc <>", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescGreaterThan(String value) {
            addCriterion("userinfo_desc >", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_desc >=", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescLessThan(String value) {
            addCriterion("userinfo_desc <", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescLessThanOrEqualTo(String value) {
            addCriterion("userinfo_desc <=", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescLike(String value) {
            addCriterion("userinfo_desc like", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescNotLike(String value) {
            addCriterion("userinfo_desc not like", value, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescIn(List<String> values) {
            addCriterion("userinfo_desc in", values, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescNotIn(List<String> values) {
            addCriterion("userinfo_desc not in", values, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescBetween(String value1, String value2) {
            addCriterion("userinfo_desc between", value1, value2, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUserinfoDescNotBetween(String value1, String value2) {
            addCriterion("userinfo_desc not between", value1, value2, "userinfoDesc");
            return (Criteria) this;
        }

        public Criteria andUseridDmIsNull() {
            addCriterion("userid_dm is null");
            return (Criteria) this;
        }

        public Criteria andUseridDmIsNotNull() {
            addCriterion("userid_dm is not null");
            return (Criteria) this;
        }

        public Criteria andUseridDmEqualTo(String value) {
            addCriterion("userid_dm =", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmNotEqualTo(String value) {
            addCriterion("userid_dm <>", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmGreaterThan(String value) {
            addCriterion("userid_dm >", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmGreaterThanOrEqualTo(String value) {
            addCriterion("userid_dm >=", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmLessThan(String value) {
            addCriterion("userid_dm <", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmLessThanOrEqualTo(String value) {
            addCriterion("userid_dm <=", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmLike(String value) {
            addCriterion("userid_dm like", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmNotLike(String value) {
            addCriterion("userid_dm not like", value, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmIn(List<String> values) {
            addCriterion("userid_dm in", values, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmNotIn(List<String> values) {
            addCriterion("userid_dm not in", values, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmBetween(String value1, String value2) {
            addCriterion("userid_dm between", value1, value2, "useridDm");
            return (Criteria) this;
        }

        public Criteria andUseridDmNotBetween(String value1, String value2) {
            addCriterion("userid_dm not between", value1, value2, "useridDm");
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