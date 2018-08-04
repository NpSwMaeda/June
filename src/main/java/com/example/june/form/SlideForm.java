package com.example.june.form;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SlideForm {

    @NotNull
    @Size(min = 1, max = 127)
    private String title;

    @NotNull
    @Size(min = 1, max = 127)
    private String body;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
