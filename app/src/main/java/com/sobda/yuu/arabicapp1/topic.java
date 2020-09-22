package com.sobda.yuu.arabicapp1;

public class topic {
    private String title;
    private  String contan;
    private  int imsge;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContan() {
        return contan;
    }

    public void setContan(String contan) {
        this.contan = contan;
    }

    public int getImsge() {
        return imsge;
    }

    public void setImsge(int imsge) {
        this.imsge = imsge;
    }

    public topic(String title, String contan, int imsge) {

        this.title = title;
        this.contan = contan;
        this.imsge = imsge;
    }
}
