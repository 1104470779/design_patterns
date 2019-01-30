package com.wt.study.design.pattern.creational.builder;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.builder
 * @Description: 抽象建造者
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/16 11:22 PM
 * @Version: v1.0
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String video;
    private String article;
    private String QA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getQA() {
        return QA;
    }

    public void setQA(String QA) {
        this.QA = QA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", QA='" + QA + '\'' +
                '}';
    }
}
