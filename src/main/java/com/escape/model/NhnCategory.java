package com.escape.model;

import java.util.Date;

public class NhnCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nhn_category.CID
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nhn_category.CNAME
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nhn_category.INS_DATE
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    private Date insDate = new Date();

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nhn_category.CID
     *
     * @return the value of nhn_category.CID
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nhn_category.CID
     *
     * @param cid the value for nhn_category.CID
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nhn_category.CNAME
     *
     * @return the value of nhn_category.CNAME
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nhn_category.CNAME
     *
     * @param cname the value for nhn_category.CNAME
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nhn_category.INS_DATE
     *
     * @return the value of nhn_category.INS_DATE
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public Date getInsDate() {
        return insDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nhn_category.INS_DATE
     *
     * @param insDate the value for nhn_category.INS_DATE
     *
     * @mbggenerated Fri Jun 28 11:03:55 KST 2019
     */
    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }
}