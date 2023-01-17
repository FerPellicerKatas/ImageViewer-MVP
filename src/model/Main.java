package model;

import view.MainFrame;
import view.ImageDisplay;
import presenter.ImagePresenter;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        ImageLoader loader = new FileImageLoader(new File("images1"));        
        MainFrame mainFrame = new MainFrame();        
        ImageDisplay imageDisplay = mainFrame.imageDisplay();
        ImagePresenter.with(loader.load(), imageDisplay);        
        
        mainFrame.setVisible(true);
    }
    
}
