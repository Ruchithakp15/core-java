class Microwave {
static boolean isConnected;
static int minTempture;
static int maxTempture=15;
static int currentTempture;
public static boolean onOrOff()
{
System.out.println("Inside OnOrOff");
if(isConnected==false)
{
isConnected=true;
System.out.println("The MicroWave turned on");
}
else if (isConnected==true)
{
isConnected =false;
System.out.println("The MicroWave is turned off");
}
System.out.println("end of OnOrOff");
return isConnected;
}
public static void increaseSpeed(){
 System.out.println("start of increaseTempture");
 if(isConnected == true){
 if(currentTempture < maxTempture){
currentTempture = currentTempture +1;
System.out.println("The Current Temp is "+ currentTempture);
}
else {
System.out.println("Max Speed is reached");
}
} 
else {
System.out.println("Anil Rise the Tempture");
}
System.out.println("end of increaseTempture");
 }
 public static void decreaseTempture(){
 System.out.println("start of decreaseTempture");
 if(isConnected == true){
 if(currentTempture > minTempture){
currentTempture = currentTempture -1;
System.out.println("The CurrentTempture is "+ currentTempture);
}else {
System.out.println("Max Tempture is reached");
}
} 
else {
System.out.println("Anil decrease the Tempture");
}
System.out.println("end of decreaseTempture");
}
}
