package 多态;

import java.util.Objects;

public class Doctor implements Person {
    private String name;
    private String room;//科室
    private String jobType;//专业类型

    public Doctor(){

    }

    public Doctor(String name, String room, String jobType) {
        this.name = name;
        this.room = room;
        this.jobType = jobType;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) &&
                Objects.equals(room, doctor.room) &&
                Objects.equals(jobType, doctor.jobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, room, jobType);
    }


}
