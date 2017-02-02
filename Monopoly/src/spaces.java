public class spaces
	{
		private int price;
		private String name;
		private int location;
		public spaces(int p, String n, int l)
			{
			price = p;
			name = n;
			location = l;
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
	
