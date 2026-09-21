package de.tum.cit.fop ;

public class BuddyPair {
    private String seniorName;
    private String juniorName;
    private String sharedGoal;
    private int meetingCount;

    protected BuddyPair(String seniorName, String juniorName, String sharedGoal){
        this.seniorName = seniorName;
        this.juniorName = juniorName;
        this.sharedGoal = sharedGoal;
        this.meetingCount = 0;
    }

    // GETS

    public String getSeniorName() {
        return seniorName;
    }

    public String getJuniorName() {
        return juniorName;
    }

    public String getGoalName() {
        return sharedGoal;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    // SETS

    public void setSeniorName(String seniorName) {
        this.seniorName = seniorName;
    }

    public void setJuniorName(String juniorName) {
        this.juniorName = juniorName;
    }

    public void setGoalName(String sharedGoal) {
        this.sharedGoal = sharedGoal;
    }

    public void setMeetingCount(){
        this.meetingCount++;
    }

    // METHODS

    public String Greet(){
        return "Hello " + juniorName + " my name is " + seniorName + " and I am your buddy pair!";
    }

    public String toString(){
        return "Senior Name: " + seniorName + "\nJunior Name: " + juniorName + "\nShared Goal: " + sharedGoal + "\nMeeting Count: " + meetingCount;
    }

    public void addMeeting(){
        this.meetingCount++;
    }
}