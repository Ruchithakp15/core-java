class TvSound {
static boolean isConnected;
static int minSound;
static int maxSound=13;
static int currentSound;
public static boolean onOrOff()
{
System.out.println("Inside OnOrOff");
if(isConnected==false)
{
isConnected=true;
System.out.println("The TV turned on");
}
else if (isConnected==true)
{
isConnected =false;
System.out.println("The TV is turned off");
}
System.out.println("end of OnOrOff");
return isConnected;
}
public static void increaseSound(){
 System.out.println("start of increaseSound");
 if(isConnected == true){
 if(currentSound < maxSound){
currentSound = currentSound +1;
System.out.println("The Current Sound is "+ currentSound);
}
else {
System.out.println("Max Sound is reached");
}
} 
else {
System.out.println("Radhe increase the Sound");
}
System.out.println("end of increaseSound");
 }
 public static void decreaseSound(){
 System.out.println("start of decreaseSound");
 if(isConnected == true){
 if(currentSound > minSound){
currentSound = currentSound -1;
System.out.println("The CurrentSound is "+ currentSound);
}else {
System.out.println("Max Sound is reached");
}
} 
else {
System.out.println("Radhe decrease the Sound");
}
System.out.println("end of decreaseSound");
}
}
