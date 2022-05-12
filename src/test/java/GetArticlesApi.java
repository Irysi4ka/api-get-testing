import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GetArticlesApi {
    private static String url = "https://api.reverb.com/api/articles";

    @Test
    public void testGetUrl() throws IOException {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();

        System.out.println("Status code: " + response.getStatusLine().getStatusCode());
        System.out.println("Body:\n" + EntityUtils.toString(entity));

    }

}
