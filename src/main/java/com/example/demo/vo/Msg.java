package com.example.demo.vo;

/**
 * Created by Administrator on 2017/6/8.
 */
public class Msg {

    private String title;
    private String content;
    private String info;

    public Msg() {
        super();
    }

    public Msg(String title, String content, String info) {
        this.title = title;
        this.content = content;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
