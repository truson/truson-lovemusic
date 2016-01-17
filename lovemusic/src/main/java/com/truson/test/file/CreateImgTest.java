package com.truson.test.file;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * java生成图片
 * Created by lezi on 2015/12/27.
 */
public class CreateImgTest {

    public static void main(String[] args){

        int width = 100;
        int height = 100;
        String content = "超超";
        File file = new File("C:/Users/lezi/ImgTest.jpg");

        Font font = new Font("Serif", Font.BOLD, 10);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        graphics2D.setBackground(Color.white);
        graphics2D.clearRect(0, 0, width, height);
        graphics2D.setPaint(Color.RED);

        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
        Rectangle2D rectangle2D = font.getStringBounds(content, fontRenderContext);
        double x = (width - rectangle2D.getWidth()) / 2;
        double y = (height - rectangle2D.getHeight()) / 2;
        double ascent = -rectangle2D.getY();
        double baseY = y + ascent;
        graphics2D.drawString(content, (int)x, (int)baseY);

        try {
            ImageIO.write(bufferedImage, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
