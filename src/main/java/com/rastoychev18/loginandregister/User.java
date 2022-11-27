package com.rastoychev18.loginandregister;

public class User {
    private String nname;
    private String passwd;
    private String fname;
    private String lname;
    private String role;
    private String team;

    @Override
    public String toString() {
        return "User{" +
                "nname='" + nname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                '}';
    }

    public String getNickname() {
        return nname;
    }

    public void setNickname(String nickname) {
        this.nname = nickname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}