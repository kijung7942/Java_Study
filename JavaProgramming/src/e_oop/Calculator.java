package e_oop;

public class Calculator {
	
	//5개의 메서드를 만든다. 
	//	더하기 빼기 곱하기 나누기 나머지
	
	double plus(double x, double y){
		return Math.round(x+y)*100.0/100.0;
	}
	double minus(double x, double y){
		return Math.round(x-y)*100.0/100.0;
	}
	double multi(double x, double y){
		return Math.round(x*y)*100.0/100.0;
	}
	double div(double x, double y){
		return Math.round(x/y)*100.0/100.0;
	}
	double remain(double x, double y){
		return Math.round(x%y)*100.0/100.0;
	}
	
	
}
