package Clicker;

import java.awt.Graphics;

public class Mob 
{

	
    Graphics g;
    
	Mob(Graphics G)
    {
        g=G;
        
    }
	
	int hp=5;
	int k=0;
	int l=0;
	int mn;
	
	void mobHP()
	{
		if(l>0) 
		{
			hp=5+(int) Math.pow(5,00.1*l);
		}
		else 
		{
			hp=5;
		}
		
	}
	int mobMoney()
	{
		if(l>0) 
		{
			mn=(int) Math.pow(2,00.1*l);
		}
		else 
		{
			mn=1;
		}
		return mn;
	}
}
