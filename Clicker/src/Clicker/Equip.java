package Clicker;

import java.awt.Graphics;

public class Equip {
	Graphics g;
	int d=1;
	int sw=0;
	int sp=0;  
	
		Equip(Graphics G) 
	    {
	        g=G;
	    }
		void adddmg()
		{
			d=1+sw+sp;
		}

}
