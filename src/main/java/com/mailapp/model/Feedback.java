package com.mailapp.model;

import org.springframework.lang.NonNull;


public class Feedback {
    @NonNull
    private String name;
    @NonNull
    private String emaiil;
    @NonNull
    private String feedback;


    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getEmaiil() {
        return emaiil;
    }

    public void setEmaiil(@NonNull String emaiil) {
        this.emaiil = emaiil;
    }

    @NonNull
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(@NonNull String feedback) {
        this.feedback = feedback;
    }
}
