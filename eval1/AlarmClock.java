package com.masai;

public class AlarmClock {
	
	
	void alarmClock(int x,boolean y) {
		if((x==0||x==6)&&y==true) {
			
			System.out.println("off");
		}
		else if((x==1||x==2||x==3||x==4||x==5)&&y==true) {
			System.out.println("10:00");
		}
		else if((x==1||x==2||x==3||x==4||x==5)&&y==false) {
			System.out.println("7:00");
		}
		else if((x==0||x==6)&&y==false) {
			
			System.out.println("10:00");
		}
		else {
			System.out.println("error");
		}
	}
	
   public static void main(String[] args) {
	   AlarmClock d1=new AlarmClock();
	d1.alarmClock(1,true);
	d1.alarmClock(0,false);
	d1.alarmClock(9,true);
}
}
