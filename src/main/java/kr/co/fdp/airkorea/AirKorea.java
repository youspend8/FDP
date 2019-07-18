package kr.co.fdp.airkorea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import kr.co.fdp.Global;
import kr.co.fdp.airkorea.model.AirKoreaVO;

public class AirKorea {
	
	public static String fetch(AirKoreaVO query, String serviceName, String operationName) throws IOException {
		String reqUrl = new StringBuilder("http://openapi.airkorea.or.kr/openapi/services/rest/")
					.append(serviceName + "/")
					.append(operationName)
					.append("?_returnType=json")
					.append("&ServiceKey=" + Global.get("airkorea.serviceKey").toString()).toString();
		
		Iterator<Entry<String, Object>> iter = query.getContainer().entrySet().iterator();
		
		while (iter.hasNext()) {
			Entry<String, Object> params = iter.next();
			String appendQuery = "&" + params.getKey() + "=" + params.getValue();
			reqUrl += appendQuery;
		}
		
		HttpURLConnection conn = (HttpURLConnection) new URL(reqUrl).openConnection();

		if (conn.getResponseCode() == 400) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
			
		} else if (conn.getResponseCode() == 404) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			
		} else if (conn.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

			String line = "";
			String result = "";
			
			while ((line = br.readLine()) != null) {
				result += line;
			}

			return result;
		}

		return conn.getResponseMessage();
	}
}
