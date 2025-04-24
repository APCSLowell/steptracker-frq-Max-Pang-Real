import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, totalDays, activeTotal, totalSteps;
 public StepTracker(int goal){
   minSteps = goal;
   totalDays = 0;
   totalSteps = 0;
   activeTotal = 0;
 }
 public void addDailySteps(int steps){
   totalSteps+=steps;
   totalDays++;
   if(steps >= minSteps)
    activeTotal++;
 }
 public int activeDays(){
   return activeTotal;
 }
 public int averageSteps(){
  return (double)totalSteps/totalDays;
 }
} 
