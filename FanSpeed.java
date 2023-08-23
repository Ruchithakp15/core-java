class FanSpeed {
static boolean isConnected;
static int minSpeed;
static int maxSpeed=16;
static int currentSpeed;
public static boolean onOrOff()
{
System.out.println("Inside OnOrOff");
if(isConnected==false)
{
isConnected=true;
System.out.println("The Fan turned on");
}
else if (isConnected==true)
{
isConnected =false;
System.out.println("The Fan is turned off");
}
System.out.println("end of OnOrOff");
return isConnected;
}
public static void increaseSpeed(){
 System.out.println("start of increaseSpeed");
 if(isConnected == true){
 if(currentSpeed < maxSpeed){
currentSpeed = currentSpeed +1;
System.out.println("The Current Speed is "+ currentSpeed);
}
else {
System.out.println("Max Speed is reached");
}
} 
else {
System.out.println("Increase the fan speed");
}
System.out.println("end of increaseSpeed");
 }
 public static void decreaseSpeed(){
 System.out.println("start of decreaseSpeed");
 if(isConnected == true){
 if(currentSpeed > minSpeed){
currentSpeed = currentSpeed -1;
System.out.println("The CurrentSpeed is "+ currentSpeed);
}else {
System.out.println("Max Speed is reached");
}
} 
else {
System.out.println("Decrease the fan speed");
}
System.out.println("end of decreaseSpeed");
}
}
