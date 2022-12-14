package hf.dp.proxy.virtual;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Buddha Bar", "https://voltaaosupremobr.files.wordpress.com/2013/02/28-r-artigo-buddha-e-o-culto-da-nc3a3o-violc3aancia-bg-1100-1.jpg?w=584");
        cds.put("Ima", "https://dx35vtwkllhj9.cloudfront.net/pathelive/ima/images/regions/fr/share.png");
        cds.put("Karma", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/300px-Rotating_earth_%28large%29.gif");
        cds.put("MCMXC A.D.", "https://i.scdn.co/image/ab67616d0000b273c7aed2bbf5698336b43ee46f");
        cds.put("Northern Exposure", "https://upload.wikimedia.org/wikipedia/en/c/c9/Northern_Exposure-Intertitle.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "https://upload.wikimedia.org/wikipedia/en/1/12/Selected_Ambient_Works_Volume_II_cover.jpg");

        URL initialURL = new URL(cds.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = cds.keys(); e.hasMoreElements(); ) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                frame.repaint();
            });
            menu.add(menuItem);
        }

        // set up frame and menus

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
