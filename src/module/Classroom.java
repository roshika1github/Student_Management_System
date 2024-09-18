package module;

public class Classroom {
    public int classroomID;
    public String classroomName;
    public int classroomCapacity;
    public String tv;
    public int roomNo;
    public String ac;
    public int capacity;

    public Classroom(int classroomID, String classroomName, int classroomCapacity, String tv, int roomNo, String ac, int capacity) {
        this.classroomID = classroomID;
        this.classroomName = classroomName;
        this.classroomCapacity = classroomCapacity;
        this.tv = tv;
        this.roomNo = roomNo;
        this.ac = ac;
        this.capacity = capacity;

    }

    public int getClassroomID() {
        return classroomID;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public int getClassroomCapacity() {
        return classroomCapacity;
    }

    public String getTv() {
        return tv;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public void setClassroomCapacity(int classroomCapacity) {
        this.classroomCapacity = classroomCapacity;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}