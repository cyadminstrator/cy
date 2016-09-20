package com.opentae.data.user.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class VerificationCode extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private final int TYPE_NUMBER = 0;
    private final int TYPE_LETTER = 1;
    private final int TYPE_MULTIPLE = 2;
    private int width;
    private int height;
    private int count;
    private int type;
    private String validate_code;
    private Random random;
    private Font font;
    private int line;

    public VerificationCode() {
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.width = 56;
        this.height = 22;
        this.count = 4;
        this.type = 0;
        this.random = new Random();
        this.line = 200;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        response.setContentType("image.jpeg");
        String reqCount = request.getParameter("count");
        String reqWidth = request.getParameter("width");
        String reqHeight = request.getParameter("height");
        String reqType = request.getParameter("type");
        if(reqCount != null && reqCount != "") {
            this.count = Integer.parseInt(reqCount);
        }

        if(reqWidth != null && reqWidth != "") {
            this.width = Integer.parseInt(reqWidth);
        }

        if(reqHeight != null && reqHeight != "") {
            this.height = Integer.parseInt(reqHeight);
        }

        if(reqType != null && reqType != "") {
            this.type = Integer.parseInt(reqType);
        }

        this.font = new Font("Courier New", 1, this.width / this.count);
        BufferedImage image = new BufferedImage(this.width, this.height, 1);
        Graphics g = image.getGraphics();
        g.setColor(this.getRandColor(200, 250));
        g.fillRect(0, 0, this.width, this.height);
        g.setColor(this.getRandColor(160, 200));

        int i;
        int x;
        int y;
        for(i = 0; i < this.line; ++i) {
            x = this.random.nextInt(this.width);
            y = this.random.nextInt(this.height);
            int xl = this.random.nextInt(12);
            int yl = this.random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }

        g.setFont(this.font);
        this.validate_code = this.getValidateCode(this.count, this.type);
        request.getSession().setAttribute("validate_code", this.validate_code);

        for(i = 0; i < this.count; ++i) {
            g.setColor(new Color(20 + this.random.nextInt(110), 20 + this.random.nextInt(110), 20 + this.random.nextInt(110)));
            x = this.width / this.count * i;
            y = (this.height + this.font.getSize()) / 2 - 5;
            g.drawString(String.valueOf(this.validate_code.charAt(i)), x, y);
        }

        g.dispose();
        ImageIO.write(image, "JPEG", response.getOutputStream());
    }

    public void getpic() throws IOException {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        response.setContentType("image.jpeg");
        String reqCount = request.getParameter("count");
        String reqWidth = request.getParameter("width");
        String reqHeight = request.getParameter("height");
        String reqType = request.getParameter("type");
        this.width = 56;
        this.height = 22;
        this.count = 4;
        this.type = 0;
        this.random = new Random();
        this.line = 200;
        if(reqCount != null && reqCount != "") {
            this.count = Integer.parseInt(reqCount);
        }

        if(reqWidth != null && reqWidth != "") {
            this.width = Integer.parseInt(reqWidth);
        }

        if(reqHeight != null && reqHeight != "") {
            this.height = Integer.parseInt(reqHeight);
        }

        if(reqType != null && reqType != "") {
            this.type = Integer.parseInt(reqType);
        }

        this.font = new Font("Courier New", 1, this.width / this.count);
        BufferedImage image = new BufferedImage(this.width, this.height, 1);
        Graphics g = image.getGraphics();
        g.setColor(this.getRandColor(200, 250));
        g.fillRect(0, 0, this.width, this.height);
        g.setColor(this.getRandColor(160, 200));

        int i;
        int x;
        int y;
        for(i = 0; i < this.line; ++i) {
            x = this.random.nextInt(this.width);
            y = this.random.nextInt(this.height);
            int xl = this.random.nextInt(12);
            int yl = this.random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }

        g.setFont(this.font);
        this.validate_code = this.getValidateCode(this.count, this.type);
        String pageTo = request.getHeader("referer");
        if(pageTo.indexOf("register")!=-1){
        	request.getSession().setAttribute("register_code", this.validate_code);
        }else{
        	request.getSession().setAttribute("login_code", this.validate_code);
        }

        for(i = 0; i < this.count; ++i) {
            g.setColor(new Color(20 + this.random.nextInt(110), 20 + this.random.nextInt(110), 20 + this.random.nextInt(110)));
            x = this.width / this.count * i;
            y = (this.height + this.font.getSize()) / 2 - 5;
            g.drawString(String.valueOf(this.validate_code.charAt(i)), x, y);
        }

        g.dispose();
        ImageIO.write(image, "JPEG", response.getOutputStream());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    private Color getRandColor(int from, int to) {
        Random random = new Random();
        if(to > 255) {
            from = 255;
        }

        if(to > 255) {
            to = 255;
        }

        int rang = Math.abs(to - from);
        int r = from + random.nextInt(rang);
        int g = from + random.nextInt(rang);
        int b = from + random.nextInt(rang);
        return new Color(r, g, b);
    }

    private String getValidateCode(int size, int type) {
        StringBuffer validate_code = new StringBuffer();

        for(int i = 0; i < size; ++i) {
            validate_code.append(this.getOneChar(type));
        }

        return validate_code.toString();
    }

    private String getOneChar(int type) {
        String result = null;
        switch(type) {
        case 0:
            result = String.valueOf(this.random.nextInt(10));
            break;
        case 1:
            result = String.valueOf((char)(this.random.nextInt(26) + 65));
            break;
        case 2:
            if(this.random.nextBoolean()) {
                result = String.valueOf(this.random.nextInt(10));
            } else {
                result = String.valueOf((char)(this.random.nextInt(26) + 65));
            }
            break;
        default:
            result = null;
        }

        if(result == null) {
            throw new NullPointerException("获取验证码出错");
        } else {
            return result;
        }
    }
}
