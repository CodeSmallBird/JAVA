package qr;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/*
 * 二维码又称二维条码，常见的二维码为QR Code，QR全称Quick Response，
 * 是一个近几年来移动设备上超流行的一种编码方式，
 * 它比传统的Bar Code条形码能存更多的信息，也能表示更多的数据类型。
 */
public class CreateQR {
	@Test
	public void createQR(){
		int width = 150;					//宽
		int height = 150;					//高
		String url = "http://www.tedu.cn";	//内容
		//url = "http://192.168.43.64:8080/jt-store/OrderServlet";	//内容
		url = "http://www.dianping.com/shop/18273606";	//内容
		String fileName = "D:\\qr.png";
		
		create(width, height, url, fileName);
		System.out.println("二维码创建成功！");
	}
	
	private void create(Integer width, Integer height, String url, String fileName) {
		HashMap<EncodeHintType, Comparable> hm = new HashMap<EncodeHintType, Comparable>();
		hm.put(EncodeHintType.CHARACTER_SET, "UTF-8");		//1设置编码格式
		hm.put(EncodeHintType.MARGIN, 2);					//2设置四周的边：0-7个等级
		hm.put(EncodeHintType.ERROR_CORRECTION,	ErrorCorrectionLevel.M);	//纠错等级（容错率）：Q、Ｍ、Ｌ、Ｈ
		
		//产生二维码
		try {
			BitMatrix bm =  new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, width, height, hm);
			Path file = new File(fileName).toPath();
			MatrixToImageWriter.writeToPath(bm, "png", file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
