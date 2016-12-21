package org.liang.doamin;

/**
 * 用户对象
 * Created by La on 2016/12/21.
 */
public class User {

    /** 编号.*/
    private Long id;

    /** 姓名.*/
    private String name;

    /** 年龄.*/
    private Integer age;

    /** 获取编号.*/
    public Long getId() {
        return id;
    }

    /** 设置编号.
     * @param id 编号
     * */
    public void setId(Long id) {
        this.id = id;
    }

    /** 获取姓名.*/
    public String getName() {
        return name;
    }
    /** 设置姓名.
     * @param name 姓名
     * */
    public void setName(String name) {
        this.name = name;
    }

    /** 获取年龄.*/
    public Integer getAge() {
        return age;
    }

    /** 设置年龄.
     * @param age 年龄
     * */
    public void setAge(Integer age) {
        this.age = age;
    }
}
