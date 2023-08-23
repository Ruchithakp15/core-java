class AcTempture {
static boolean isConnected;
static int minTempture;
static int maxTempture=28;
static int currentTempture;
public static boolean onOrOff()
{
System.out.println("Inside OnOrOff");
if(isConnected==false)
{
isConnected=true;
System.out.println("The Ac turned on");
}
else if (isConnected==true)
{
isConnected =false;
System.out.println("The Ac is turned off");
}
System.out.println("end of OnOrOff");
return isConnected;
}
public static void increaseTempture(){
 System.out.println("start of increaseTempture");
 if(isConnected == true){
 if(currentTempture < maxTempture){
currentTempture = currentTempture +1;
System.out.println("The Current Tempture is "+ currentTempture);
}
else {
System.out.println("Max Tempture is reached");
}
} 
else {
System.out.println("Kushal....first Ac on the");
}
System.out.println("end of increaseTempture");
 }
 public static void decreaseTempture(){
 System.out.println("start of decreaseTempture");
 if(isConnected == true){
 if(currentTempture > minTempture){
currentTempture = currentTempture -1;
System.out.println("The Current Tempture is "+ currentTempture);
}else {
System.out.println("Max Tempture is reached");
}
} 
else {
System.out.println("Kushal....first Ac on the");
}
System.out.println("end of decreaseTempture");
}
}
