package qr;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadQR {
	public static void main(String[] args) throws NotFoundException, IOException {
		String fileName = "D:/qr.png";
		System.out.println(readZxing(fileName));
	}

	//解析二维码的内容
	private static String readZxing(String fileName) throws IOException, NotFoundException {
		MultiFormatReader read = new MultiFormatReader();
		File file = new File(fileName);
		
		BufferedImage image = ImageIO.read(file);
		Binarizer binarizer = new HybridBinarizer(new BufferedImageLuminanceSource(image));
		BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
		Result res = read.decode(binaryBitmap);
		
		//System.out.println(res.getBarcodeFormat());
		//System.out.println(res.getText());

		return res.toString();
	}
}
