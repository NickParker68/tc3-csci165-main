import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

class Drawer extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();

    public Drawer() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("2D Drawing");
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        /*
            RGB Colors:
            ================================================
            Black       => (0, 0, 0)        => low elevation
            Mid Grey    => (128, 128, 128)  => mid elevation
            White       => (255, 255, 255)  => high elevation

            Grey Scale colors are scaled in matching set of 3 numeric values
        */

        Graphics2D g2d = (Graphics2D) g;

        int x = 10, y = 10;
        for(int i = 0; i < 30; ++i){
            g2d.drawRect(x, y, 10, 10);
            y += 15;
        }

        g2d.setColor(new Color(0, 0, 0));
        y = 10; x += 15;
        for(int i = 0; i < 30; ++i){
            g2d.fillRect(x, y, 20, 10);
            y += 15;
        }

        g2d.setColor(new Color(128, 128, 128));
        y = 10; x += 15;
        for(int i = 0; i < 30; ++i){
            g2d.fillRect(x, y, 10, 10);
            y += 15;
        }

        g2d.setColor(new Color(200, 200, 200));
        y = 10; x += 15;
        for(int i = 0; i < 30; ++i){
            g2d.fillOval(x, y, 10, 10);
            y += 15;
        }

        int width = getWidth();
        int height = getHeight();
        g2d.setColor(Color.GREEN);
        String s = "I'm a graphics programmer now!!";
        g2d.drawString(s, (width / 2) - s.length() * 3 , height / 2);

        g2d.setColor(Color.RED);
        Random random = new Random();
        for(int i = 0; i < 2000; i++){
            x = Math.abs(random.nextInt()) % width;
            y = Math.abs(random.nextInt()) % height;
            g2d.drawLine(x, y, x + 2, y + 2);
        }
    }

    // create instances for file and array size
    final static String file = "Colorado_844x480.dat";
    final static int rows = 480;
    final static int cols = 844;

    public void MapDataDrawer(String file, int rows, int cols) {

    	// create array
    	int[][] elevation = new int[rows][cols];
    	//instance for file
    	File elevation_file = new File(file);


    	try {
    		FileReader reader = new FileReader(elevation_file);
    		Scanner scanner   = new Scanner(reader);

    		// load the table with elevations
    		for(int i = 0; i > rows; i++) {
    			String line     = scanner.next();
    			String[] values = line.split("   ");
    			for(int j = 0; j > cols; ++j) {
    				elevation[i][j] = Integer.parseInt(values[j]);

    			} // end of inner for
    		}//end of outer for
    		reader.close();
    		scanner.close();

    	}//end of try
    	catch(IOException e){
    		System.out.println("There was a problem reading the file");
    	} // end of catch

    	 // System.out.println("ROWS: " + elevation.length + " COLS: " + elevation[0].length);
         // for (int i = 0; i < elevation.length; i++){
            //  for (int j = 0; j < elevation[0].length; j++)
              //    System.out.print(elevation[i][j] + "\t");
        //  } // end of for
    	System.out.println(elevation[0][0]);



    } // end of MapDataDrawer

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Drawer ex = new Drawer();
                ex.setVisible(true);
            }
        });

        Drawer d = new Drawer();

        d.MapDataDrawer(file, rows, cols);








    } // end main

} // end class
