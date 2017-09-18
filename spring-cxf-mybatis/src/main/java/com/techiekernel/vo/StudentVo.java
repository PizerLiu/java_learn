package com.techiekernel.vo;

public class StudentVo implements java.io.Serializable {

    private static final long serialVersionUID = 230942593500521241L;
    private Long ago;
    private Long sex;
    private String name;
    private Long account;

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Long getAgo() {
        return ago;
    }

    public void setAgo(Long ago) {
        this.ago = ago;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
