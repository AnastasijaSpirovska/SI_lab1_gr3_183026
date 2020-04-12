class Item {
	int id;
	String name;
	double price;


	//TODO add variable.
	char ddv;

	//TODO constructor
	public Item(int id, String name, double price, char ddv){
		this.id=id;
		this.name=name;
		this.price=price;
		this.ddv=ddv;
	}

	//TODO setters and getters


	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDdv(char ddv) {
		this.ddv = ddv;
	}


	public int getId(){
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public char getDdv() {
		return this.ddv;
	}

	double taxReturn () {
		//TODO
		return (price*ddv)*0.15;
	}
}