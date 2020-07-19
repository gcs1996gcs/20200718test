package lis;

public class User {

	private String name11;
	private int age;
	private double chengji;

    private double 爱好1;
    private double 爱好2;
   

   private double 爱好3;
	
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
		 name= "2020071910216";
		System.out.println("大家好，我是"+name+"，今年"+age+"岁,"+"我英语是 "+chengji+"分。");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
        		user.addmain("张三1", 21, 22.78);
       	                user.addmain("张三2", 21, 22.78);
        		user.addmain("张三3", 21, 22.78);
        		user.addmain("张三4", 21, 22.78);
user.addmain("张三5", 21, 22.78);
	}

}

