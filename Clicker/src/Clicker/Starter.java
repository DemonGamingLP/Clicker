package Clicker;

import javax.swing.SwingUtilities;

public class Starter 
{

	public static void main(String[] args)
	{
		
		
			 
			 Grafik G = new Grafik();
			 
			  {
			    SwingUtilities.invokeLater(new Runnable()
			    {
			      public void run()
			      {
			        G.GrafikZ();
			      }
			    }
			    );
			  }

	}   
	
}
      
