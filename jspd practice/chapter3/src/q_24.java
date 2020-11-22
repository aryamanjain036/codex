public class q_24 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*13 + 1);
        switch (number){
            case 1:
                System.out.print("The card you picked is Ace");break;
            case 2:
                System.out.print("The card you picked is 2");break;
            case 3:
                System.out.print("The card you picked is 3");break;
            case 4:
                System.out.print("The card you picked is 4");break;
            case 5:
                System.out.print("The card you picked is 5");break;
            case 6:
                System.out.print("The card you picked is 6");break;
            case 7:
                System.out.print("The card you picked is 7");break;
            case 8:
                System.out.print("The card you picked is 8");break;
            case 9:
                System.out.print("The card you picked is 9");break;
            case 10:
                System.out.print("The card you picked is 10");break;
            case 11:
                System.out.print("The card you picked is Jack");break;
            case 12:
                System.out.print("The card you picked is Queen");break;
            case 13:
                System.out.print("The card you picked is King");break;
        }
        System.out.print(" of ");
        int type = (int)(Math.random()*4);
        switch (type){
            case 0:
                System.out.println("Clubs");break;
            case 1:
                System.out.println("Diamonds");break;
            case 2:
                System.out.println("Hearts");break;
            case 3:
                System.out.println("Spades");break;
        }
    }
}
