package lis;

public class User {

	private String name;
	private int age;
	private double chengji;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getChengji() {
		return chengji;
	}


	public void setChengji(double chengji) {
		this.chengji = chengji;
	}


	public void addmain(String name,int age, double chengji){
		
		System.out.println("大家好，我是"+name+"，今年"+age+"岁,"+"我英语是 "+chengji+"分。");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
        user.addmain("张三", 21, 22.78);
	}

}

