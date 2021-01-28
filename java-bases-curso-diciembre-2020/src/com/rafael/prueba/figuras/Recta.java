package com.rafael.prueba.figuras;

public class Recta {
	
	 private Punto punto1;
	 private Punto punto2;
	 private Double tangente;
	 
	  Recta(int x1, int y1, int x2, int y2){
          punto1 = new Punto(x1, y1);
          punto2 = new Punto(x2, y2);
          calculaTangente();
          // Otra forma de hacerlo sería llmar al otro constructor:
          // this(new Punto(x1, y1),new Punto(x2, y2));
	  }

	    Recta(){
	            punto1 = new Punto();
	            punto2 = new Punto();
	            calculaTangente();
	    }
	    
	    Recta(Punto p1, Punto p2){
	            punto1 = p1;
	            punto2 = p2;
	            calculaTangente();
	    }
	    
	    void setPunto1(Punto p){
	            punto1 = p;
	            calculaTangente();
	    }

	    void setPunto1(int x, int y){
	            this.setPunto1(new Punto(x,y));
	    }
	        
	    void setPunto2(Punto p){
	            punto2 = p;
	            calculaTangente();
	    }

	    void setPunto2(int x, int y){
	            this.setPunto2(new Punto(x,y));
	    }
	        
	    Punto getPunto1(){
	            return punto1;
	    }

	    Punto getPunto2(){
	            return punto2;
	    }

	    Double getTangente(){
	            return tangente;
	    }

	    private void calculaTangente(){
	            if ((punto2.getX()-punto1.getX()) == 0) tangente = null;
	            else {
	                 tangente = new Double((double)(punto2.getY()-punto1.getY())/
	                            (double)(punto2.getX()-punto1.getX()));
	            }
	    }

	    public String toString(){
	            return "["+punto1+","+punto2+"]";
	    }    
		
		public boolean equals(Object recta){
			if (recta instanceof Recta){
				Recta r = (Recta) recta;
				// Realmente, una recta puede tener distintos puntos de definicion y aun asi ser igual,
				// habria que comparar la tangente y un punto de coincidencia
				// pero para el ejemplo no vamos a entrar tanto en los conceptos espaciales
				return r.getPunto1().equals(this.getPunto1()) && r.getPunto2().equals(this.getPunto2());
			}
			return false;
		}
	}

