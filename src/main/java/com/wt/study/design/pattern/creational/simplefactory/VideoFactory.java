package com.wt.study.design.pattern.creational.simplefactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.simplefactory
 * @Description: 简单工厂
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/13 8:27 PM
 * @Version: v1.0
 */
public class VideoFactory {
    /**
     * 根据类型
     * @param videoClass
     * @return
     */
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

    /**
     * 根据名称
     * @param videoName
     * @return
     */
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
