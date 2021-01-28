package com.rafael.prueba.figuras;

public class Punto {
	
	    private Integer x;
	    private Integer y;
	    
	    Punto(Integer x,Integer y){
	        this.x = x;
	        this.y = y;
	    }
  
	    Punto(){
	        this.x = 0;
	        this.y = 0;
	    }
	     
	    public Integer getX() {
			return x;
		}

		public void setX(Integer x) {
			this.x = x;
		}

		public Integer getY() {
			return y;
		}

		public void setY(Integer y) {
			this.y = y;
		}

	    public boolean equals(Object punto){
	        if (punto instanceof Punto){
	            Punto p = (Punto) punto;
	            if (p.getX() == this.x && p.getY() == this.y) return true;
	        }
	        return false;
	    }
	    
	    public String toString(){
	        return "("+x+"," +y+")";
	    }

}
