import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String content=getHttp("https://api.sdccx.cn");
        System.out.println(content);
    }

    public static String getHttp(String get_url) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL(get_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5 * 1000);//链接超时
            urlConnection.setReadTimeout(5 * 1000);//返回数据超时
            //getResponseCode (1.200请求成功 2.404请求失败)
            if (urlConnection.getResponseCode() == 200) {
                //获得读取流写入
                InputStream inputStream = urlConnection.getInputStream();
                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(bytes)) != -1) {
                    stringBuffer.append(new String(bytes, 0, len));
                }
            }
            return stringBuffer.toString();
        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
