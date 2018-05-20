// Prevod galonu na litry 

// Java is weird, name of class must be same like name of program :)
class GalNaLit {

 public static void main(String args[]) { //argumenty nepotrebujeme, ale stejne je musime psat, trapas

  double gallons, litres;

  gallons = 50; //napr.

  litres = 3.7854; //tolik litru je v jednom galonu - super zit v americe kdyz za galon zaplatis skoro jako u nas za litr:)
  System.out.print("In " + gallons + " gallons");
  System.out.print(" Is " + gallons * litres + " litres");
  System.out.println();

  }

}
