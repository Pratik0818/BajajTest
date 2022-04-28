package api.pojo;

import org.springframework.stereotype.Component;

@Component
public class Response
{
	private boolean status;
	private int user_id;
	private String email_id;
	private int college_roll_number;
	private String[] numbers;
	private String[] alphabate;
	
	
   public Response(boolean status, int user_id, String email_id, int college_roll_number, String[] numbers,
			String[] alphabate) {
	   this.status = status;
		this.user_id = user_id;
		this.email_id = email_id;
		this.college_roll_number = college_roll_number;
		this.numbers = numbers;
		this.alphabate = alphabate;
	}


	public Response() {
	  
	}
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getCollege_roll_number() {
		return college_roll_number;
	}
	public void setCollege_roll_number(int college_roll_number) {
		this.college_roll_number = college_roll_number;
	}


	public String[] getNumbers() {
		return numbers;
	}


	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}


	public String[] getAlphabate() {
		return alphabate;
	}


	public void setAlphabate(String[] alphabate) {
		this.alphabate = alphabate;
	}


}
