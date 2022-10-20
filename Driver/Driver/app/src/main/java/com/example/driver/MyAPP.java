package com.example.driver;

public class MyAPP {
    static String TextGuidance;
    static String HomeG;
    static String HomeV;
    static String HomeSeet;
    static String HomeLogout;
    static String selected_language;
    static String language;
    static String Modif_pass;
    static String reset;
    static String enterP;
    static String Yes;
    static String No;
    static String PRS;
    static String PRF;

    public MyAPP(String TextGuidance ,String HomeG ,String HomeV ,String HomeSeet , String HomeLogout ,String selected_language ,
                 String language,String Modif_pass , String reset ,String enterP ,String Yes , String No , String PRS , String PRF ) {
        this.TextGuidance = TextGuidance;
        this.HomeG = HomeG;
        this.HomeV = HomeV;
        this.HomeSeet = HomeSeet;
        this.HomeLogout = HomeLogout;
        this.selected_language = selected_language;
        this.language = language;
        this.Modif_pass=Modif_pass;
        this.reset=reset;
        this.enterP=enterP;
        this.Yes=Yes;
        this.No=No;
        this.PRS=PRS;
        this.PRF=PRF;
    }

    public static String getPRF() {
        return PRF;
    }

    public static void setPRF(String PRF) {
        MyAPP.PRF = PRF;
    }

    public static String getPRS() {
        return PRS;
    }

    public static void setPRS(String PRS) {
        MyAPP.PRS = PRS;
    }

    public static String getNo() {
        return No;
    }

    public static void setNo(String no) {
        No = no;
    }

    public static String getYes() {
        return Yes;
    }

    public static void setYes(String yes) {
        Yes = yes;
    }

    public static String getEnterP() {
        return enterP;
    }

    public static void setEnterP(String enterP) {
        MyAPP.enterP = enterP;
    }

    public static String getReset() {
        return reset;
    }

    public static void setReset(String reset) {
        MyAPP.reset = reset;
    }

    public static String getModif_pass() {
        return Modif_pass;
    }

    public static void setModif_pass(String modif_pass) {
        Modif_pass = modif_pass;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        MyAPP.language = language;
    }

    public static String getSelected_language() {
        return selected_language;
    }

    public static void setSelected_language(String selected_language) {
        MyAPP.selected_language = selected_language;
    }

    public static String getTextGuidance() {
        return TextGuidance;
    }

    public static void setTextGuidance(String textGuidance) {
        TextGuidance = textGuidance;
    }

    public static String getHomeG() {
        return HomeG;
    }

    public static void setHomeG(String homeG) {
        HomeG = homeG;
    }

    public static String getHomeV() {
        return HomeV;
    }

    public static void setHomeV(String homeV) {
        HomeV = homeV;
    }

    public static String getHomeSeet() {
        return HomeSeet;
    }

    public static void setHomeSeet(String homeSeet) {
        HomeSeet = homeSeet;
    }

    public static String getHomeLogout() {
        return HomeLogout;
    }

    public static void setHomeLogout(String homeLogout) {
        HomeLogout = homeLogout;
    }
}
