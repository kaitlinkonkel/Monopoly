public class spaces
	{
	//hello
		private int price;
		private String name;
		private int location;
		private String color;
		public spaces(int p, String n, int l, String c)
			{
			price = p;
			name = n;
			location = l;
			color = c;
			}	
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		//price
		public int getPrice()
			{
			return price;
			}
		public void setPrice(int price)
			{
			this.price = price;
			}
		//location
		public int getLocation()
			{
			return location;
			}
		public void setLocation(int location)
			{
			this.location = location;
			}
		//name
		public String getName()
			{
			return name;
			}

		public void setName(String name)
			{
			this.name = name;
			}


		}
	
