public class q11 {
    public static void main(String[] args) {
        int totalTime = 365*24*60*60;
        int birthCount = totalTime/7;
        int deathCount = totalTime/13;
        int immigrantCount = totalTime/45;
        int currentPopulation = 312032486;
        int newcurrentPopulation = birthCount+immigrantCount-deathCount;
        System.out.print("year1 = ");
        System.out.println(currentPopulation+1*newcurrentPopulation);
        System.out.print("year2 = ");
        System.out.println(currentPopulation+2*newcurrentPopulation);
        System.out.print("year3 = ");
        System.out.println(currentPopulation+3*newcurrentPopulation);
        System.out.print("year4 = ");
        System.out.println(currentPopulation+4*newcurrentPopulation);
        System.out.print("year5 = ");
        System.out.println(currentPopulation+5*newcurrentPopulation);
    }
