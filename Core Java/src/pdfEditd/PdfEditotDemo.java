package pdfEditd;

import java.io.File;
import java.io.IOException;
import java.io.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

public class PdfEditotDemo {

	public static final String SRC = "C:/Downloads/Dnyaneshwari.pdf";
	public static final String DEST = "C:/Downloads/";
	
	public static void main (String [] args) throws IOException, DocumentException  {
		File file = new File(DEST);
	    file.getParentFile().mkdirs();
	    new PdfEditotDemo().manipulatePdf(SRC, DEST);
	}
	public void manipulatePdf(String src, String dest) throws IOException, DocumentException {
	    PdfReader reader = new PdfReader(src);
	    PdfDictionary dict = reader.getPageN(1);
	    PdfObject object = dict.getDirectObject(PdfName.CONTENTS);
	    PdfArray refs = null;
	    if (dict.get(PdfName.CONTENTS).isArray()) {
	        refs = dict.getAsArray(PdfName.CONTENTS);
	    } else if (dict.get(PdfName.CONTENTS).isIndirect()) {
	        refs = new PdfArray(dict.get(PdfName.CONTENTS));
	    }
	    for (int i = 0; i < refs.getArrayList().size(); i++) {
	        PRStream stream = (PRStream) refs.getDirectObject(i);
	        byte[] data = PdfReader.getStreamBytes(stream);
	        stream.setData(new String(data).replace("NULA", "Nulo").getBytes());
	    }
	    PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
	    stamper.close();
	    reader.close();
	}
}
