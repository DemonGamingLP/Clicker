package Clicker;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Grafik implements MouseListener , MouseMotionListener
{
    JFrame F;
    Graphics G;
    Mob M;
    Money M2;
    Equip E;
    int hp;
    int Z=0;
    int T=0;
    
    Color Hintergrund = new Color(238,238,238);//Hintergrund
    Color Schwarz = new Color(0,0,0);//schwarz
    Font Normal = new Font("TimesRoman", Font.PLAIN, 11);//Normale Schrift
    Font Klein = new Font("TimesRoman", Font.PLAIN, 7);//Normale Schrift
   
    
    
    
      Grafik() 
      {
        F=new JFrame("Simple Clicker"); 
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setPreferredSize(new Dimension (1920,1036));
        F.pack();
        F.setVisible(true);
        F.addMouseListener(this);
        F.addMouseMotionListener(this);
        G=F.getGraphics();
        M=new Mob(G);
        M2=new Money(G);
        E=new Equip(G);
      }
    
      
      

      
      void GrafikZ()
      {
      	G.drawRect(100,100,100,100);   	
  		G.drawString("Enemy: "+String.valueOf(M.k),250,250);		
  		G.drawString("HP: "+String.valueOf(M.hp), 100,80);
  		G.drawString("Area: "+String.valueOf(M.l+1), 350,250);
  		G.drawString("Money: "+String.valueOf(M2.s),450,250);
  		
  		G.drawRect(600, 100, 150, 150);
  		G.drawString("Sword", 655, 180);
      }
       
     
        
	public void mouseDragged(MouseEvent e) 
	{
	
		
	}

	public void mouseMoved(MouseEvent e) 
	{

		
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		
	
	
	
		
			if(e.getX()>=100 && e.getY()>=100&& e.getX()<=200 && e.getY()<=200)
			{
				if(T==0)
				{
					F.setTitle("Good one!");
					T++;
				}
				
				if(T==1)
				{
					F.setTitle("Wow!");
					T++;
				}
				
				if(T==2)
				{
					F.setTitle("Awesome!");
					T++;
				}
				
				else if(T==3)
				{
					F.setTitle("Keep Going");
					T++;
				}
				
				else if(T==4)
				{
					F.setTitle("Unbelievable!");
					T++;
				}
				
				else if(T==5)
				{
					F.setTitle("Insane!");
					T++;
				}
				
				else if(T==6)
				{
					F.setTitle("Great!");
					T++;
				}
				
				else if(T==7)
				{
					F.setTitle("Unstoppable");
					T++;
				}
				
				else if(T==8)
				{
					F.setTitle("You got this!");
					T++;
				}
				
				else if(T==9)
				{
					F.setTitle("Have fun!");
					T++;
				}
				
				else if(T==10)
				{
					F.setTitle("No more Titels");
					T++;
				}
				
				
				else if(T==11)
				{
					F.setTitle("Simple Clicker");
					T++;
				}
				
				
				if(M.hp>0)
				{
					G.setColor(Hintergrund);
					G.drawString("HP: "+String.valueOf(M.hp), 100,80);
					M.hp=M.hp-E.d;
					G.setColor(Schwarz);
					G.drawString("HP: "+String.valueOf(M.hp), 100,80);
					if (M.hp<=0)
					{
						G.setColor(Hintergrund);
						G.drawString("Enemy: "+String.valueOf(M.k),250,250);
						G.drawString("HP: "+String.valueOf(M.hp), 100,80);
						G.drawString("Area: "+String.valueOf(M.l+1), 350,250);
						G.drawString("Money: "+String.valueOf(M2.s),450,250);

						
						M.k=M.k+1;
						M2.add(M.mobMoney());
						
						if(M.k>10)
						{
							M.k=0;
							M.l=M.l+1;
						}
						
						M.mobHP();
						G.setColor(Schwarz);
						G.drawString("Enemy: "+String.valueOf(M.k),250,250);
						G.drawString("HP: "+String.valueOf(M.hp), 100,80);
						G.drawString("Area: "+String.valueOf(M.l+1), 350,250);
						G.drawString("Money: "+String.valueOf(M2.s),450,250);
					}
					
				}
				
			}
			if(e.getX()>=600 && e.getY()>=100&& e.getX()<=750 && e.getY()<=250)
			{
				if(M2.s>=5)
				{
					G.setColor(Hintergrund);
					G.drawString("Money: "+String.valueOf(M2.s),450,250);
					M2.s=M2.s-5;
					E.sw=E.sw+1;
					E.adddmg();
					G.setColor(Schwarz);
					G.drawString("Money: "+String.valueOf(M2.s),450,250);
				}
			}
			
		}
		
		
	

	public void mousePressed(MouseEvent e) 
	
	{
		if(e.getX()>=100 && e.getY()>=100&& e.getX()<=200 && e.getY()<=200)
		{
		G.setColor(Hintergrund);
		G.drawRect(100,100,100,100);  
		G.setColor(Schwarz);
		G.drawRect(110,110,80,80);
		}
		
		if(e.getX()>=600 && e.getY()>=100&& e.getX()<=750 && e.getY()<=250)
		{
		G.setColor(Hintergrund);
		G.drawRect(600, 100, 150, 150);  
		G.drawString("Sword", 655, 180);
		G.setColor(Schwarz);
		G.drawRect(610, 110, 130, 130);
		G.drawString("Sword", 660, 185);
		}
		
	}

	public void mouseReleased(MouseEvent e) 
	{
		if(e.getX()>=100 && e.getY()>=100&& e.getX()<=200 && e.getY()<=200)
		{
		G.setColor(Hintergrund);
		G.drawRect(110,110,80,80);  
		G.setColor(Schwarz);
		G.drawRect(100,100,100,100);
		}
		if(e.getX()>=600 && e.getY()>=100&& e.getX()<=750 && e.getY()<=250)
		{
		G.setColor(Hintergrund);
		G.drawRect(610, 110, 130, 130);  
		G.drawString("Sword", 660, 185);
		G.setColor(Schwarz);
		G.drawRect(600, 100, 150, 150);
		G.drawString("Sword", 655, 180);
		}
	}
	
	public void mouseEntered(MouseEvent e) 
	{
		
	}
	public void mouseExited(MouseEvent e) 
	{
	
	}

}
