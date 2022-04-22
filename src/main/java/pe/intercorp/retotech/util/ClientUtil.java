package pe.intercorp.retotech.util;

import java.util.List;

import pe.intercorp.retotech.entity.ClientEntity;

public class ClientUtil {

	public static Integer getAverage(List<ClientEntity> list) {
		
		return list.stream().mapToInt(x -> x.getAge()).sum() / list.size();
	}

	public static double getStandardDeviation(List<ClientEntity> list) {

		double[] input = list.stream().mapToDouble(d -> d.getAge()).toArray();
		double n = input.length, sum = 0, mean;
		 
		sum=list.stream().mapToInt(x -> x.getAge()).sum();
		mean = sum / n; 
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.pow((input[i] - mean), 2);

		}
		mean = sum / (n - 1);
		
		return round(Math.sqrt(mean));  
	}
	
	 
	
	public static double round(double value) {
	      return Math.round(value*100.0)/100.0; 
	}
}
