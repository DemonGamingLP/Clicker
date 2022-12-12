package Clicker;

import java.awt.Graphics;

public class Money {

Graphics g;
int s=0;
    
	Money(Graphics G) 
    {
        g=G;
        
    }
	void add(int mn)
	{
		s=s+mn;
	}
	
}
