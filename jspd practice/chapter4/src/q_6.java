public class q_6 {
    public static void main(String[] args) {
        double angle1 = Math.random()*360;
        double angle2 = Math.random()*360;
        double angle3 = Math.random()*360;
        angle1 = Math.toRadians(angle1);
        angle2 = Math.toRadians(angle2);
        angle3 = Math.toRadians(angle3);
        int radius = 40;
        double x1 = (int)(radius*Math.cos(angle1)*100)/100.0;
        double y1 = (int)(radius*Math.sin(angle1)*100)/100.0;
        double x2 = (int)(radius*Math.cos(angle2)*100)/100.0;
        double y2 = (int)(radius*Math.sin(angle2)*100)/100.0;
        double x3 = (int)(radius*Math.cos(angle3)*100)/100.0;
        double y3 = (int)(radius*Math.sin(angle3)*100)/100.0;
        System.out.println("The three points are : " +
                " (" + x1 + ", " + y1 + ")" + ","+
                " (" + x2 + ", " + y2 + ")" + ","+
                " (" + x3 + ", " + y3 + ")");
    }
}
