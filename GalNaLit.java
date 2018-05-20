// Prevod galonu na litry 

// Java is weird, name of class must be same like name of program :)
class GalNaLit {

 public static void main(String args[]) { //argumenty nepotrebujeme, ale stejne je musime psat, trapas

  double gallons, litres;
  int limit, everyTen;

  gallons = 1;
  everyTen = 0; 
  litres = 3.7854; //tolik litru je v jednom galonu - super zit v americe kdyz za galon zaplatis skoro jako u nas za litr:)

  for(limit = 0; limit <= 99; limit++) {
     System.out.println("In " + gallons + " gallons is a " + gallons * litres + " litres");
     gallons++;
     everyTen++;

     if (everyTen == 10) {
	 System.out.println(); 
	 everyTen = 0;  
     }

  } 


  }

}
