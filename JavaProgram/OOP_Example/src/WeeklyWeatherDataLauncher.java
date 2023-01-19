
public class WeeklyWeatherDataLauncher {

	public static void main(String[] args) {
		double[] rain = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
		double[] pressure = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };
//send and receive Array
		
		WeeklyWeatherData wd = new WeeklyWeatherData();//สร้าง object to use method in Class ต้นแบบ
		wd.setData(rain, pressure);
		wd.calculateStats();
		
		System.out.println("Maximum RainFall: "+wd.getMaxRain());
		//System.out.println("Average RainFall: "+wd.getAvgRain());
	    System.out.printf("Average RainFall: %.3f" , wd.getAvgRain()); // See at print(f)(OoO)!!!
	}

}
