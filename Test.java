
package test;

public class Test {
    
    public static void main(String[] args) {
        // TODO code application logic here
    try{
            oneTime obj = new oneTime();
            //try{Thread.sleep(1500);}
            //  catch(InterruptedException e){}
            if (obj.check()) {
            /* Frame f[]=Frame.getFrames();
             System.out.println(f[0]);*/
            } else {
            obj.setVisible(true);
            /* Frame f[]=Frame.getFrames();
            System.out.println(f[0]);*/
            }
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }
    
}
