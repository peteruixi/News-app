package com.news.app.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmIsNull() {
            addCriterion("news_userdm is null");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmIsNotNull() {
            addCriterion("news_userdm is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmEqualTo(String value) {
            addCriterion("news_userdm =", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmNotEqualTo(String value) {
            addCriterion("news_userdm <>", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmGreaterThan(String value) {
            addCriterion("news_userdm >", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmGreaterThanOrEqualTo(String value) {
            addCriterion("news_userdm >=", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmLessThan(String value) {
            addCriterion("news_userdm <", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmLessThanOrEqualTo(String value) {
            addCriterion("news_userdm <=", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmLike(String value) {
            addCriterion("news_userdm like", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmNotLike(String value) {
            addCriterion("news_userdm not like", value, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmIn(List<String> values) {
            addCriterion("news_userdm in", values, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmNotIn(List<String> values) {
            addCriterion("news_userdm not in", values, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmBetween(String value1, String value2) {
            addCriterion("news_userdm between", value1, value2, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsUserdmNotBetween(String value1, String value2) {
            addCriterion("news_userdm not between", value1, value2, "newsUserdm");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateIsNull() {
            addCriterion("news_pub_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateIsNotNull() {
            addCriterion("news_pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateEqualTo(Date value) {
            addCriterion("news_pub_date =", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateNotEqualTo(Date value) {
            addCriterion("news_pub_date <>", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateGreaterThan(Date value) {
            addCriterion("news_pub_date >", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_pub_date >=", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateLessThan(Date value) {
            addCriterion("news_pub_date <", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateLessThanOrEqualTo(Date value) {
            addCriterion("news_pub_date <=", value, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateIn(List<Date> values) {
            addCriterion("news_pub_date in", values, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateNotIn(List<Date> values) {
            addCriterion("news_pub_date not in", values, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateBetween(Date value1, Date value2) {
            addCriterion("news_pub_date between", value1, value2, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsPubDateNotBetween(Date value1, Date value2) {
            addCriterion("news_pub_date not between", value1, value2, "newsPubDate");
            return (Criteria) this;
        }

        public Criteria andNewsReadIsNull() {
            addCriterion("news_read is null");
            return (Criteria) this;
        }

        public Criteria andNewsReadIsNotNull() {
            addCriterion("news_read is not null");
            return (Criteria) this;
        }

        public Criteria andNewsReadEqualTo(Integer value) {
            addCriterion("news_read =", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotEqualTo(Integer value) {
            addCriterion("news_read <>", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadGreaterThan(Integer value) {
            addCriterion("news_read >", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_read >=", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadLessThan(Integer value) {
            addCriterion("news_read <", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadLessThanOrEqualTo(Integer value) {
            addCriterion("news_read <=", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadIn(List<Integer> values) {
            addCriterion("news_read in", values, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotIn(List<Integer> values) {
            addCriterion("news_read not in", values, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadBetween(Integer value1, Integer value2) {
            addCriterion("news_read between", value1, value2, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("news_read not between", value1, value2, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateIsNull() {
            addCriterion("news_update_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateIsNotNull() {
            addCriterion("news_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateEqualTo(Date value) {
            addCriterion("news_update_date =", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateNotEqualTo(Date value) {
            addCriterion("news_update_date <>", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateGreaterThan(Date value) {
            addCriterion("news_update_date >", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_update_date >=", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateLessThan(Date value) {
            addCriterion("news_update_date <", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("news_update_date <=", value, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateIn(List<Date> values) {
            addCriterion("news_update_date in", values, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateNotIn(List<Date> values) {
            addCriterion("news_update_date not in", values, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateBetween(Date value1, Date value2) {
            addCriterion("news_update_date between", value1, value2, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("news_update_date not between", value1, value2, "newsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmIsNull() {
            addCriterion("news_columndm is null");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmIsNotNull() {
            addCriterion("news_columndm is not null");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmEqualTo(Integer value) {
            addCriterion("news_columndm =", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmNotEqualTo(Integer value) {
            addCriterion("news_columndm <>", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmGreaterThan(Integer value) {
            addCriterion("news_columndm >", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_columndm >=", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmLessThan(Integer value) {
            addCriterion("news_columndm <", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmLessThanOrEqualTo(Integer value) {
            addCriterion("news_columndm <=", value, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmIn(List<Integer> values) {
            addCriterion("news_columndm in", values, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmNotIn(List<Integer> values) {
            addCriterion("news_columndm not in", values, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmBetween(Integer value1, Integer value2) {
            addCriterion("news_columndm between", value1, value2, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andNewsColumndmNotBetween(Integer value1, Integer value2) {
            addCriterion("news_columndm not between", value1, value2, "newsColumndm");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
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