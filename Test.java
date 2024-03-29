package com.horb.immp.common.tools.word;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.horb.immp.common.tools.word.entity.Person;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;

public class Test {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd");
	public static void main(String[] args) {
		try {
			 Map<String, Object> map = new HashMap<String, Object>();
		        map.put("department", "Easypoi");
		        map.put("time", format.format(new Date()));
		        Person person = new Person();
		        person.setName("JueYue");
		        map.put("p", person);
		        ImageEntity image = new ImageEntity();
		        image.setHeight(200);
		        image.setWidth(500);
		        image.setUrl("E:/word/testCode.jpg");
		        image.setType(ImageEntity.URL);
		        map.put("testCode", image);
		        XWPFDocument doc = WordExportUtil.exportWord07("E:/word/Image.docx", map);
		        FileOutputStream fos = new FileOutputStream("E:/words1/image2.docx");
		        doc.write(fos);
		        fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                