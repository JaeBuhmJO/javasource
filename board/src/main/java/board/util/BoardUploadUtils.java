package board.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class BoardUploadUtils {
	public Map<String, String> uploadFile(HttpServletRequest request) {
		Map<String, String> formData = new HashMap<>();

		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart) {
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				// Parse the request
				List<FileItem> items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				String name = null, value = null;
				while (iter.hasNext()) {
					FileItem item = iter.next();

					// 필드명 가져오기
					name = item.getFieldName();

					// 일반요소 - writeForm에서 name, password, content, title
					if (item.isFormField()) {
						value = item.getString("utf-8");
						formData.put(name, value);
					} else { // 파일요소
						value = item.getName();
						if (!name.isEmpty() && item.getSize() > 0) {

							// 파일 저장
							String path = "c:\\upload";

							// 고유값 생성 : 중복 파일명 저장 위한 접두어
							UUID uuid = UUID.randomUUID();
							File f = new File(path + "\\" + uuid.toString() + "_" + value); // c:\\upload\\test.html

							formData.put(name, f.getName());

							item.write(f); // 파일저장
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return formData;
	}
}
