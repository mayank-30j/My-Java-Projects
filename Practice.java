class Practice 
{
	static int id;
	static String name;

	void Print_info()
	{
		System.out.println(id);
		System.out.println(name);
	}
      
    Practice()
    {
    	
    }  

	Practice(int i,String n)
	{
      id = i;
      name = n;
	}

	static public void main(String s[])
	{
        Practice p = new Practice();
        p.Print_info();

	}
}