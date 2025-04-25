import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, totalDays, activeAmount, totalSteps;
 public StepTracker(int goal){
   minSteps = goal;
   totalDays = 0;
   totalSteps = 0;
   activeAmount = 0;
 }
 public void addDailySteps(int steps){
   totalSteps+=steps;
   totalDays++;
   if(steps >= minSteps)
    activeAmount++;
 }
 public int activeDays(){
   return activeAmount;
 }
 public int averageSteps(){
  return (double) totalSteps/totalDays;
 }
} 
