package chap06_array.obj;

public class Car {
	private String company;
	private String model;
	private String color;
	private int price;
	
	//기본 생성자
	public Car() {}
	
	//모든 멤버변수를 받는 생성자
	public Car(String company, String model, String color,
			int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	//생성된 차의 정보 출력하는 메소드
	public void carInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("----------------");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
