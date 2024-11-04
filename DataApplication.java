package com.coderscampus.assignment6;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DataApplication {
	public static void main(String[] args) {
		String m3 = "src/com/coderscampus/assignment6/model3.csv";
		String mS= 	"src/com/coderscampus/assignment6/modelS.csv";
		String mX= "src/com/coderscampus/assignment6/modelX.csv";
		
		List<CarData> model3 = FileService.readFile(m3);
		List<CarData> modelS = FileService.readFile(mS);
		List<CarData> modelX = FileService.readFile(mX);
		
		
//***********************************  Model 3 *************************************
		List<CarData> carDataListM3 = FileService.readFile(m3);
		Optional<CarData> maxCarSales3 = carDataListM3.stream()
													 .max(Comparator.comparingInt(carData-> carData.getSales()));
		Optional<CarData> minCarSales3 = carDataListM3.stream()
													  .min(Comparator.comparingInt(carData -> carData.getSales()));
		int totalSales2017 = model3.stream()
								   .filter(s->s.getDate().getYear()==2017)
								   .mapToInt(CarData::getSales)
								   .sum();
		int totalSales2018 = model3.stream()
				   .filter(s->s.getDate().getYear()==2018)
				   .mapToInt(CarData::getSales)
				   .sum();
		int totalSales2019 = model3.stream()
				   .filter(s->s.getDate().getYear()==2019)
				   .mapToInt(CarData::getSales)
				   .sum();
		
		
		if (maxCarSales3.isPresent()) {
			CarData maxData = maxCarSales3.get();
			
			System.out.println("Model 3 Yearly Sales Report");
			System.out.println("-------------------");
			System.out.println("2017 -> " + totalSales2017);
			System.out.println("2018 -> " + totalSales2018);
			System.out.println("2019 -> " + totalSales2019);
			
			System.out.println("The best month for Model 3 was: " + maxData.getDate());
			CarData minData = minCarSales3.get();
			System.out.println("The worst month for Model 3 was: " + minData.getDate());
			System.out.println("");
		}
		
//************************************* Model S****************************************		
		List<CarData> carDataListMS = FileService.readFile(mS);
		Optional<CarData> maxCarSalesS = carDataListMS.stream()
													 .max(Comparator.comparingInt(carData-> carData.getSales()));
		Optional<CarData> minCarSalesS = carDataListMS.stream()
													  .min(Comparator.comparingInt(carData -> carData.getSales()));
		int mSTotalSales2017 = modelS.stream()
								   .filter(s->s.getDate().getYear()==2017)
								   .mapToInt(CarData::getSales)
								   .sum();
		int mSTotalSales2018 = modelS.stream()
				   .filter(s->s.getDate().getYear()==2018)
				   .mapToInt(CarData::getSales)
				   .sum();
		int mSTotalSales2019 = modelS.stream()
				   .filter(s->s.getDate().getYear()==2019)
				   .mapToInt(CarData::getSales)
				   .sum();
		
		
		if (maxCarSalesS.isPresent()) {
			CarData maxData = maxCarSalesS.get();
			
			System.out.println("Model S Yearly Sales Report");
			System.out.println("-------------------");
			System.out.println("2017 -> " + mSTotalSales2017);
			System.out.println("2018 -> " + mSTotalSales2018);
			System.out.println("2019 -> " + mSTotalSales2019);
			
			System.out.println("The best month for Model S was: " + maxData.getDate());
			CarData minData = minCarSalesS.get();
			System.out.println("The worst month for Model S was: " + minData.getDate());
			System.out.println("");
		}
	//***************************************** Model X*******************************************
		List<CarData> carDataListMX = FileService.readFile(mX);
		Optional<CarData> maxCarSalesX = carDataListMX.stream()
													 .max(Comparator.comparingInt(carData-> carData.getSales()));
		Optional<CarData> minCarSalesX = carDataListMX.stream()
													  .min(Comparator.comparingInt(carData -> carData.getSales()));
		int mXTotalSales2017 = modelX.stream()
								   .filter(s->s.getDate().getYear()==2017)
								   .mapToInt(CarData::getSales)
								   .sum();
		int mXTotalSales2018 = modelX.stream()
				   .filter(s->s.getDate().getYear()==2018)
				   .mapToInt(CarData::getSales)
				   .sum();
		int mXTotalSales2019 = modelX.stream()
				   .filter(s->s.getDate().getYear()==2019)
				   .mapToInt(CarData::getSales)
				   .sum();
		
		
		if (maxCarSalesS.isPresent()) {
			CarData maxData = maxCarSalesX.get();
			
			System.out.println("Model X Yearly Sales Report");
			System.out.println("-------------------");
			System.out.println("2017 -> " + mXTotalSales2017);
			System.out.println("2018 -> " + mXTotalSales2018);
			System.out.println("2019 -> " + mXTotalSales2019);
			
			System.out.println("The best month for Model X was: " + maxData.getDate());
			CarData minData = minCarSalesX.get();
			System.out.println("The worst month for Model X was: " + minData.getDate());
		}
		
												   	
		 
		}
		
	}

