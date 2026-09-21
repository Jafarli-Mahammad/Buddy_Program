package de.tum.cit.fop;

public class FitnessActivity {
    private String activityName;
    private int activityTarget;
    private String activityUnit;
    private int currentProgress;
    private boolean isCompleted;

    protected FitnessActivity(String activityName, int activityTarget, String activityUnit) {
        this.activityName = activityName;
        this.activityTarget = activityTarget;
        this.activityUnit = activityUnit;
        this.currentProgress = 0;
        this.isCompleted = false;
    }

    // GETTERS

    public String getActivityName(){
        return activityName;
    }

    public int getActivityTarget(){
        return activityTarget;
    }

    public String getActivityUnit(){
        return activityUnit;
    }

    public int getCurrentProgress(){
        if(currentProgress >= activityTarget){
            this.isCompleted = true;
        }
        return currentProgress;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }

    // SETTERS

    public void setActivityName(String activityName){
        this.activityName = activityName;
    }

    public void setActivityTarget(int activityTarget){
        this.activityTarget = activityTarget;
    }

    public void setActivityUnit(String activityUnit){
        this.activityUnit = activityUnit;
    }

    public void setCurrentProgress(int currentProgress){
        if(currentProgress >= activityTarget){
            this.isCompleted = true;
        }
        this.currentProgress += currentProgress;
        CheckProgress();
    }

    public void setIsCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }

    // METHODS

    public String ToString(){
        return "Activity Name: " + activityName + "\n" +
                "Activity Target: " + activityTarget + "\n" +
                "Activity Unit: " + activityUnit + "\n" +
                "Current Progress: " + currentProgress + "\n" +
                "Is Completed: " + isCompleted;
    }

    public void AddProgress(int amount){
        setCurrentProgress(amount);
        CheckProgress();
    }

    public void CheckProgress(){
        if(currentProgress >= activityTarget){
            this.isCompleted = true;
            System.out.println("Congratulations! You have completed the activity!");
        } else {
            int remainingProgress = activityTarget - currentProgress;
            System.out.println("Keep going! You have " + remainingProgress + " more " + activityUnit + " to go!");
        }

        System.out.println("Your Progress is: " + currentProgress);
    }

    public String GetSummary(){
        return "Activity Name: " + activityName + "\n" +
                "Activity Target: " + activityTarget + "\n" +
                "Activity Unit: " + activityUnit + "\n" +
                "Current Progress: " + currentProgress + "\n" +
                "Is Completed: " + isCompleted;
    }

    public void ResetProgress(){
        this.currentProgress = 0;
    }
}
