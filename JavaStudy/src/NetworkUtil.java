import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkUtil {
	public String get(String address) {
		StringBuffer result = new StringBuffer();
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();

			InputStream is = con.getInputStream(); // 한글자씩 아스키코드값으로 뽑아옴
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); //위와 아래가 서로 호환이안됨 그래서 얘 사용
			BufferedReader reader = new BufferedReader(isr); // 한줄 통째로 뽑아오기 위해 사용

			String separator = "";
			
			while (true) {
				String data = reader.readLine(); // 꺼내둔값
				if (data == null) {
					break;
				}
				result.append(separator + data); //꺼내둔값 data를 result에 넣어줌
				separator = "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}