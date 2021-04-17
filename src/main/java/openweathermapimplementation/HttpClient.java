package openweathermapimplementation;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpClient {

	public Response getRequest(String apiBase, String queryString) throws IOException {
		String url = apiBase + queryString;
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder().url(url).method("GET", null)
				.addHeader("Content-Type", "application/json").build();
		return client.newCall(request).execute();

	}

}