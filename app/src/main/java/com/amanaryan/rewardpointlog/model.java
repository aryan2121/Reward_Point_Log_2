package com.amanaryan.rewardpointlog;

public class model {



    private String School_id;
    private String Giver_id;
    private String Points;
    private String Color_code;
    private String Activity;
    private String Sub_activity;
    private String Student_name;
    private String Student_prn;
    private String Member_id;
    private String id;
    private String place;

        public model(String School_id, String Giver_id,
                     String Points,
                     String Color_code,
                     String Activity,String Sub_activity,
                     String Student_name,String Student_prn,
                     String Member_id,String id,
                     String place) {
            this.School_id = School_id;
            this.Giver_id = Giver_id;
            this.Points= Points;
            this.Color_code = Color_code;
            this.Activity = Activity;
            this.Sub_activity = Sub_activity;
            this.Student_name = Student_name;
            this.Student_prn = Student_prn;
            this.Member_id = Member_id;
            this.id = id;
            this.place = place;
        }


    public void setSchool_id(String school_id) {
        School_id = school_id;
    }

    public void setGiver_id(String giver_id) {
        Giver_id = giver_id;
    }

    public void setPoints(String points) {
        Points = points;
    }

    public void setColor_code(String color_code) {
        Color_code = color_code;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    public void setSub_activity(String sub_activity) {
        Sub_activity = sub_activity;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public void setStudent_prn(String student_prn) {
        Student_prn = student_prn;
    }

    public void setMember_id(String member_id) {
        Member_id = member_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    }
