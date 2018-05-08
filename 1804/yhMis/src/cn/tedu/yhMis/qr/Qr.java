package cn.tedu.yhMis.qr;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class Qr {

	@Test
	public void createQR(){
		int width = 150;					//宽度
		int height = 150;					//高度
		String url = "http://www.tedu.cn";	//二维码内容
		//url = "http://192.168.43.64:8080/jt-store/OrderServlet";	 
		//url = "http://www.dianping.com/shop/18273606";	 
		//String fileName = "F:\\JAVA\\yh\\WebContent\\img\\wss.png";//"D:\\wss.png";
		String fileName = "./WebContent/img/qr.png";//二维码生成图片存放地址
		create(width, height, url, fileName);
		System.out.println("二维码创建成功");
	}
	
	private void create(Integer width, Integer height, String url, String fileName) {
		HashMap<EncodeHintType, Comparable> hm = 
				new HashMap<EncodeHintType, Comparable>();
		//存放键值(EncodeHintType.CHARACTER_SET, "UTF-8")
		hm.put(EncodeHintType.CHARACTER_SET, "UTF-8");	
		//存放键值(EncodeHintType.MARGIN, 2)
		hm.put(EncodeHintType.MARGIN, 2);	
		//存放键值(EncodeHintType.ERROR_CORRECTION,	ErrorCorrectionLevel.M)
		hm.put(EncodeHintType.ERROR_CORRECTION,	ErrorCorrectionLevel.M);
		
		try {
			BitMatrix bm =  new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, width, height, hm);
			Path file = new File(fileName).toPath();
			MatrixToImageWriter.writeToPath(bm, "png", file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String readZxing(String fileName) throws IOException, NotFoundException {
		MultiFormatReader read = new MultiFormatReader();
		File file = new File(fileName);
		
		BufferedImage image = ImageIO.read(file);
		Binarizer binarizer = new HybridBinarizer(new BufferedImageLuminanceSource(image));
		BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
		Result res = read.decode(binaryBitmap);

		return res.toString();
	}


}
