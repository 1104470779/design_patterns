package com.ljm.study.design.pattern.creational.simplefactory;

/**
 * @author liujiaming
 */
public class VideoFactory {

    //根据类型
    public Video getVideo(Class videoClass){
        Video video = null;
        try {
            video = (Video) Class.forName(videoClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;

    }

    //根据名称
    public Video getVideo(String videoName){
        if("java".equals(videoName)){
            return new JavaVedio();
        }else if("python".equals(videoName)){
            return new PythonVideo();
        }else{
            return null;
        }
    }
}
