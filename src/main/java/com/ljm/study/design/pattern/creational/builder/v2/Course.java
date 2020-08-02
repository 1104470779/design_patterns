package com.ljm.study.design.pattern.creational.builder.v2;

/**
 * @author liujiaming
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String video;
    private String article;

    //问答
    private String qa;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.qa = courseBuilder.qa;
    }


    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String video;
        private String article;
        private String qa;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildcoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildvideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder buildarticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder buildaq(String QA) {
            this.qa = QA;
            return this;
        }

        public Course makeCourse() {
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }
}
