package shirts;

//"Timestamp","Username","Name","Shirt Size","What Stuff?"

class Order {
	public boolean tShirt = false;
	public boolean longSleeve = false;
	public boolean sweatshirt = false;
	public int size; //0=S, 1=M, 2=L, 3=XL, 4=2XL
	public String name;
	public String email;
	Order (String input){
		input.replaceAll("\"", "");
		String[] parsed = input.split(",");
		email = parsed[1];
		name = parsed[2];
		switch (parsed[3].toLowerCase()){
			case "\"s\"":
				size = 0;
				break;
			case "\"m\"":
				size = 1;
				break;
			case "\"l\"":
				size = 2;
				break;
			case "\"xl\"":
				size = 3;
				break;
			case "\"2xl\"":
				size = 4;
				break;
			default:
				size = -1;
		}
		String[] goods = parsed[4].split(";");
		for (String good : goods){
			switch (good){
				case "T-Shirt ($12-15)":
					tShirt = true;
					break;
				case "Long Sleeve ($15-18)":
					longSleeve = true;
					break;
				case "Sweatshirt ($25-30)":
					sweatshirt = true;
					break;
				default:
			}
		}
	}
}