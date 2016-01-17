package com.truson.lovemusic.practice.util.file;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 图片处理相关工具类
 * Created by lezi on 2016/1/17.
 */
public class ImgUtils {

    private static final int DEFAULT_VERIFY_CODE_WIDTH = 70;
    private static final int DEFAULT_VERIFY_CODE_HEIGHT = 70;

    /**
     * 制作验证码图片
     * @param width
     * @param height
     */
    public static void createVerifyCodeImg(int width, int height){
        if(width == 0 || height == 0){
            width = DEFAULT_VERIFY_CODE_WIDTH;
            height = DEFAULT_VERIFY_CODE_HEIGHT;
        }
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        createBackground(g, width, height);
        createCharacter(g);
    }

    /**
     * 获取随机颜色
     * @param fc
     * @param bc
     * @return
     */
    public static Color getRandColor(int fc,int bc) {
        int f = fc;
        int b = bc;
        Random random=new Random();
        if(f>255) {
            f=255;
        }
        if(b>255) {
            b=255;
        }
        //todo f+random.nextInt(b-f) 为什么获取随机数要用这种形式？
        return new Color(f+random.nextInt(b-f),f+random.nextInt(b-f),f+random.nextInt(b-f));
    }

    /**
     * 给验证码图片填充背景
     * @param g
     * @param width
     * @param height
     */
    public static void createBackground(Graphics g, int width, int height){
        // 填充背景
        g.setColor(getRandColor(220,250));
        g.fillRect(0, 0, width, height);
        // 加入干扰线条
        for (int i = 0; i < 8; i++) {
            g.setColor(getRandColor(40,150));
            Random random = new Random();
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            g.drawLine(x, y, x1, y1);
        }
    }

    /**
     * 生成随机字符串
     * @param g
     * @return
     */
    public static String createCharacter(Graphics g) {
        char[] codeSeq = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J',
                'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z', '2', '3', '4', '5', '6', '7', '8', '9' };
        String[] fontTypes = {"Arial","Arial Black","AvantGarde Bk BT","Calibri"};
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String r = String.valueOf(codeSeq[random.nextInt(codeSeq.length)]);
            g.setColor(new Color(50 + random.nextInt(100), 50 + random.nextInt(100), 50 + random.nextInt(100)));
            g.setFont(new Font(fontTypes[random.nextInt(fontTypes.length)],Font.BOLD,26));
            g.drawString(r, 15 * i + 5, 19 + random.nextInt(8));
            s.append(r);
        }
        return s.toString();
    }

}
