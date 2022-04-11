package com.masai;

public class DayOfWeek {
   
	public static void main(String[] args) {
		//Assume these could have any value:
		int dayOfTheWeek = 7;
		boolean holiday = true;
		
		if(dayOfTheWeek>0&&dayOfTheWeek<6&&!holiday) {
			System.out.println("Wake up at 7:00");
		}
		if((dayOfTheWeek==6||dayOfTheWeek==7)&&holiday) {
			System.out.println("Sleep in!");
		}

	}
}
