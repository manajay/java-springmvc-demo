package com.lj.spring.bean;


/**
 * @author 段连洁 [manajay.dlj@gmail.com]
 * @since  02/08/2017 4:42 PM
 */
public class User {
    /**
     * 用户索引
     */
    private int id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户年龄
     */
    private int age;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户简洁
     */
    private String detail;

    private Sex sex;

    public User() {
    }

    public User(String name, int age, String password, String detail, Sex sex) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.detail = detail;
        this.sex = sex;
    }

    public User(int id, String name, int age, String password, String detail, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.detail = detail;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", detail='" + detail + '\'' +
                ", sex=" + sex +
                '}';
    }
}
