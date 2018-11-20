import java.awt.*;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Arrays;

public class Drawing extends Canvas {
    String[] rolls = {"circle","square"};
    String[] result;
    
    public void logic(){
       result = Runner.run(3, rolls);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        
        Canvas canvas = new Drawing();
        canvas.setSize(1900,1060);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        logic();
        Font font = new Font("Verdana", Font.BOLD, 50);
        g.setFont(font);
        
        if (Runner.won(result)){
            g.drawString("Won", 100, 100);
        }else{
            g.drawString("You are a Failure", 100, 100);
        }
        
        int xDisplace = 0;
        
        for(String s: result){
            if (s.equals("circle")){
                g.fillOval(100+xDisplace, 100, 200, 200);
            }else{
                g.fillRect(100+xDisplace, 100, 200, 200);
            }
            
            xDisplace += 220;
        }
    }
    
    
}