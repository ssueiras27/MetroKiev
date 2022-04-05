package source;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Mapa extends JPanel{
	Metro metro;
	ArrayList<Estacion> camino;
	Mapa(){
	}
	
	public void setCamino(ArrayList<Estacion> c) {
		camino=c;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		if(camino!=null) {
			paintPath((Graphics2D) g, camino);
		}
		
	}
	
	public void setOrigen(Graphics2D g2, int x , int y) {
		g2.setColor(Color.yellow);
		g2.fillRect(x-10, y-10 ,20, 20);
	}
	
	public void setDestino(Graphics2D g2, int x , int y) {
		g2.setColor(Color.yellow);
		g2.fillRect(x-10, y-10 ,20, 20);
	}
	private void paintPath(Graphics2D g2, ArrayList<Estacion> camino) {
		g2.setColor(Color.ORANGE);
		Estacion curr = camino.get(0);
		g2.fillRect(curr.getX()-10, curr.getY()-10 ,20, 20);
		Estacion next = camino.get(1);
		int x1,y1,x2,y2,x3,y3,i;
		for(i = 2; i<camino.size(); i++) {
			x1 = curr.getX();
			y1 = curr.getY();
			x2 = next.getX();
			y2 = next.getY();
			x3 = -1;
			y3 = -1;
			if(curr.getNum()==118 && next.getNum()==119 || curr.getNum()==119 && next.getNum()==118) {
				x3 = 477;
				y3 = 380;
			}else if(curr.getNum()==119 && next.getNum()==120 || curr.getNum()==120 && next.getNum()==119) {
				x3 = 533;
				y3 = 326;
			}else if(curr.getNum()==314 && next.getNum()==315 || curr.getNum()==315 && next.getNum()==314) {
				x3 = 535;
				y3 = 382;
			}else if(curr.getNum()==315 && next.getNum()==316 || curr.getNum()==316 && next.getNum()==315) {
				x3 = 645;
				y3 = 382;
			}
			paintBetweenStations(g2,x1,y1,x2,y2,x3,y3);
			curr = next;
			next = camino.get(i);
		}
		x1 = curr.getX();
		y1 = curr.getY();
		x2 = next.getX();
		y2 = next.getY();
		x3 = -1;
		y3 = -1;
		if(curr.getNum()==118 && next.getNum()==119 || curr.getNum()==119 && next.getNum()==118) {
			x3 = 477;
			y3 = 380;
		}else if(curr.getNum()==119 && next.getNum()==120 || curr.getNum()==120 && next.getNum()==119) {
			x3 = 533;
			y3 = 326;
		}else if(curr.getNum()==314 && next.getNum()==315 || curr.getNum()==315 && next.getNum()==314) {
			x3 = 535;
			y3 = 382;
		}else if(curr.getNum()==315 && next.getNum()==316 || curr.getNum()==316 && next.getNum()==315) {
			x3 = 645;
			y3 = 382;
		}
		paintBetweenStations(g2,x1,y1,x2,y2,x3,y3);
		g2.fillRect(next.getX()-10, next.getY()-10 ,20, 20);
		
	}

	private void paintBetweenStations(Graphics2D g2,int x1, int y1, int x2, int y2, int x3, int y3) {
		BasicStroke bs= new BasicStroke(8,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		g2.setStroke(bs);
		if(x3 > 0 && y3 > 3) {
			g2.drawLine(x1, y1, x3, y3);
			
			g2.drawLine(x3, y3, x2, y2);
		}else {
			g2.drawLine(x1, y1, x2, y2);
		}
	}
}
