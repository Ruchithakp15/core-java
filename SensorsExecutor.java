class SensorsExecutor {
	
	public static void main(String ses[]) {
		Sensors sensors = new Sensors();
		sensors.sensorsActuarors=200;
		sensors.sensorsVoltage =50;
		sensors.sensorsType = "Temperature Sensor";
		sensors.sensorsPrice = 2310;
		sensors.sensorsAccuracy =569;
		
		System.out.println("SensorssensorsActuarors is " + sensors.sensorsActuarors);
		System.out.println("SensorssensorsVoltage  is " + sensors.sensorsVoltage );
		System.out.println("SensorssensorsType is " + sensors.sensorsType);
		System.out.println("SensorssensorsPrice is " + sensors.sensorsPrice );
		System.out.println("SensorssensorsAccuracy is " + sensors.sensorsAccuracy);
	    sensors.automations();
		
		Sensors sensors1 = new Sensors();
		sensors1.sensorsActuarors=560;
		sensors1.sensorsVoltage =80;
		sensors1.sensorsType = "Proximity Sensor";
		sensors1.sensorsPrice = 5630;
		sensors1.sensorsAccuracy =896;
		
		System.out.println("SensorssensorsActuarors is " + sensors1.sensorsActuarors);
		System.out.println("SensorssensorsVoltage  is " + sensors1.sensorsVoltage );
		System.out.println("SensorssensorsType is " + sensors1.sensorsType);
		System.out.println("SensorssensorsPrice is " + sensors1.sensorsPrice );
		System.out.println("SensorssensorsAccuracy is " + sensors1.sensorsAccuracy);
	    sensors1.automations();
		
		
		Sensors sensors2 = new Sensors();
		sensors2.sensorsActuarors=569;
		sensors2.sensorsVoltage =20;
		sensors2.sensorsType = "Accelerometer";
		sensors2.sensorsPrice = 9631;
		sensors2.sensorsAccuracy =456;
		
		System.out.println("SensorssensorsActuarors is " + sensors2.sensorsActuarors);
		System.out.println("SensorssensorsVoltage  is " + sensors2.sensorsVoltage );
		System.out.println("SensorssensorsType is " + sensors2.sensorsType);
		System.out.println("SensorssensorsPrice is " + sensors2.sensorsPrice );
		System.out.println("SensorssensorsAccuracy is " + sensors2.sensorsAccuracy);
	    sensors2.automations();


        Sensors sensors3 = new Sensors();
		sensors3.sensorsActuarors=852;
		sensors3.sensorsVoltage =50;
		sensors3.sensorsType = "Touch Sensor";
		sensors3.sensorsPrice = 8956;
		sensors3.sensorsAccuracy =123;
		
		
		
		System.out.println("SensorssensorsActuarors is " + sensors3.sensorsActuarors);
		System.out.println("SensorssensorsVoltage  is " + sensors3.sensorsVoltage );
		System.out.println("SensorssensorsType is " + sensors3.sensorsType);
		System.out.println("SensorssensorsPrice is " + sensors3.sensorsPrice );
		System.out.println("SensorssensorsAccuracy is " + sensors3.sensorsAccuracy);
	    sensors3.automations();
		
		
		
		
        Sensors sensors4 = new Sensors();
		sensors4.sensorsActuarors=963;
		sensors4.sensorsVoltage =70;
		sensors4.sensorsType = "Humidity Sensor";
		sensors4.sensorsPrice = 5743;
		sensors4.sensorsAccuracy =741;
		
		
		
		System.out.println("SensorssensorsActuarors is " + sensors4.sensorsActuarors);
		System.out.println("SensorssensorsVoltage  is " + sensors4.sensorsVoltage );
		System.out.println("SensorssensorsType is " + sensors4.sensorsType);
		System.out.println("SensorssensorsPrice is " + sensors4.sensorsPrice );
		System.out.println("SensorssensorsAccuracy is " + sensors4.sensorsAccuracy);
	    sensors4.automations();
		
	}
	
}