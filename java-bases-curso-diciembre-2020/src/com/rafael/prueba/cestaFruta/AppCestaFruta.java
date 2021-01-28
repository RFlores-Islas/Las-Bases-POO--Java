package com.rafael.prueba.cestaFruta;

public class AppCestaFruta {
	
	 public static void main(String args[]){
	     
         // Creamos los objetos
         CestaFruta cManzanas = new CestaFruta("Manzana", 3, 235);
         CestaFruta cPeras = new CestaFruta("Pera", 4, 172);
         CestaFruta cNaranjas = new CestaFruta("Naranja", 2, 296);
    
         System.out.print("La de mayor peso es: ");

         // Hay diversas formas de calcular cuál es la cesta de mayor peso
         // Utilizamos ésta para ver el ejemplo de uso de <a class="autolink" title="if-else" href="http://www.elbosquedexana.com/moodle/mod/page/view.php?id=702">if-else</a>
         if (cManzanas.pesoCesta() > cPeras.pesoCesta()
              && cManzanas.pesoCesta() > cNaranjas.pesoCesta())
                   System.out.println(cManzanas);
         else if (cPeras.pesoCesta() > cNaranjas.pesoCesta())
                   System.out.println(cPeras);
         else System.out.println(cNaranjas);
          
    }

}
