package com.fzg.entity;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.id
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.name
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.password
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.age
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.id
     *
     * @return the value of t_account.id
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.id
     *
     * @param id the value for t_account.id
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.name
     *
     * @return the value of t_account.name
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.name
     *
     * @param name the value for t_account.name
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.password
     *
     * @return the value of t_account.password
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.password
     *
     * @param password the value for t_account.password
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.age
     *
     * @return the value of t_account.age
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.age
     *
     * @param age the value for t_account.age
     *
     * @mbg.generated Sat Jul 02 19:57:54 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}