import com.google.gson.Gson;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.*;
import java.net.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static String getString() {
        return "Java-Hello";
    }
    public static String convertToHexString(String errorCode) {
        if (errorCode.startsWith("0x")) {
            return errorCode;
        }

        int parseInt = Integer.parseInt(errorCode);
        StringBuilder hexCode = new StringBuilder(Integer.toHexString(parseInt));
        if (hexCode.length() < 8) {
            int count = 8 - hexCode.length();
            for (int i = 0; i < count; i++) {
                hexCode.insert(0, "0");
            }
        }
        return MessageFormat.format("{0}{1}", "0x", hexCode.toString());
    }

    /**
     * 将url参数转换成map
     *
     * @param param aa=11&bb=22&cc=33
     * @return
     */
    public static Map<String, Object> getUrlParams(String param) {
        Map<String, Object> map = new HashMap<String, Object>(0);
        if (param==null || param.isEmpty()) {
            return map;
        }
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            String[] p = params[i].split("=");
            if (p.length == 2) {
                map.put(p[0], p[1]);
            }
        }
        return map;
    }
    public static void main(String[] args) throws Exception {
//        System.out.println(convertToHexString("26214480"));
//        System.out.println(getUrlParams("?port=80"));


//        Class<?> main= java.lang.Class.forName("Main").getMethod("getString").invoke(null);
//        System.out.println(main.getMethod("getString").invoke(null));

//        ScriptEngineManager sem = new ScriptEngineManager();
//        ScriptEngine engine = sem.getEngineByName("javascript");
//        //定义变量,存储到引擎上下文中，通过java和脚本均可获取
//        engine.put("msg", "gaoqi is a good man!");
//        String str = "var user = {name:'gaoqi',age:18,schools:['清华大学','北京大学']};";
//        str += "print(user.name);";
//
//        //执行脚本
//        engine.eval(str);
//        engine.eval("msg = 'sxt is a good school';");
//        System.out.println(engine.get("msg"));
//        System.out.println("###########################");
//
//
//        String jsCode = "var list=java.util.Arrays.asList([\"清华大学\",\"北京大学\"]);";
//        engine.eval(jsCode);
//
//
//        String javaCode = "var java=java.lang.Class.forName(\"Main\");" +
//                "var java1=java.getMethod(\"getString\").invoke(null);" +
//                "var java2=java.getMethod(\"getNowTime\").invoke(null);" +
//                "var java3=getNowTime();";
//
//        engine.eval(javaCode);
//        System.out.println(engine.get("java1"));
//        //uuid
//
//
////        String javaName = "";
////        engine.eval(javaName);
//        System.out.println(engine.get("java3"));
//        String 重庆IP="14.104.83.46";
//        String 西藏IP="211.139.74.234";
//        String 台湾="114.44.227.87";
//        for (int i = 0; i < 500; i++) {
//            System.out.println(getHttp("http://36.133.97.102:7802/farm/farmproductbatch/getBatchInfo?batchId=19&id=18&type=2"));
//        }



//        String content = getHttp("https://");
//        System.out.println(content);
//        createFile();
//        try {
//            Document document = Jsoup.connect("http://wsjkw.cq.gov.cn/zwgk_242/zxgk/").get();
//            Elements elements = document.getElementsByClass("gl-list2");
//            for (int i = 0; i < elements.size(); i++) {
//                Elements elements1 = elements.get(i).getElementsByTag("li");
//                for (int j = 0; j < elements1.size(); j++) {
//                    String href=elements1.get(j).selectFirst("a").attr("href");
//                    String title=elements1.get(j).selectFirst("a").text();
//                    String time=elements1.get(j).selectFirst("span").text();
//                    System.out.println(title+"   ---   "+time+"   -->   "+href);
//                }
//            }
//        } catch (Exception e) {
//
//        }
        if (true) {
            return;
        }

        try {
//            Document document = Jsoup.connect("https://mp.weixin.qq.com/s/m0pOXHLco-2IJa8xPWYDxw").get();
//            String wxStr=document.getElementById("page-content").html();
//            System.out.println(wxStr);
        } catch (Exception e) {

        }
        String json = "{\"msg\":\"操作成功\",\"code\":200,\"data\":[{\"children\":[{\"children\":[],\"chooseId\":2006,\"comments\":\"\",\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583915221275.png\",\"id\":2006,\"image\":\"\",\"isDefault\":2,\"name\":\"党建动态\",\"parentId\":2000,\"resource\":\"/info/25?title=党建动态\",\"sort\":1,\"type\":\"4\"},{\"children\":[],\"chooseId\":2007,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583914613549.png\",\"id\":2007,\"isDefault\":2,\"name\":\"党员信息\",\"parentId\":2000,\"resource\":\"/party/org\",\"sort\":2,\"type\":\"4\"},{\"children\":[],\"chooseId\":2008,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583918332874.png\",\"id\":2008,\"isDefault\":2,\"name\":\"主题党日\",\"parentId\":2000,\"resource\":\"305\",\"sort\":3,\"type\":\"2\"},{\"children\":[],\"chooseId\":2009,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583915279693.png\",\"id\":2009,\"isDefault\":2,\"name\":\"组织生活会\",\"parentId\":2000,\"resource\":\"265\",\"sort\":4,\"type\":\"2\"},{\"children\":[],\"chooseId\":2010,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583915314004.png\",\"id\":2010,\"isDefault\":2,\"name\":\"先锋模范\",\"parentId\":2000,\"resource\":\"191\",\"sort\":5,\"type\":\"2\"},{\"children\":[],\"chooseId\":2011,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583915620792.png\",\"id\":2011,\"isDefault\":2,\"name\":\"三会一课\",\"parentId\":2000,\"resource\":\"/meeting\",\"sort\":6,\"type\":\"4\"},{\"children\":[],\"chooseId\":2012,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583915688892.png\",\"id\":2012,\"isDefault\":2,\"name\":\"在线学习\",\"parentId\":2000,\"resource\":\"/party/study\",\"sort\":7,\"type\":\"4\"}],\"chooseId\":2000,\"deptId\":\"1\",\"id\":2000,\"isDefault\":2,\"name\":\"党建引领\",\"parentId\":0,\"sort\":1},{\"children\":[{\"children\":[],\"chooseId\":2022,\"comments\":\"jiankong\",\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583918067226.png\",\"id\":2022,\"isDefault\":2,\"name\":\"在线监控\",\"parentId\":2004,\"sort\":1,\"type\":\"1\"},{\"children\":[],\"chooseId\":2023,\"comments\":\"all_lb\",\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917817665.png\",\"id\":2023,\"image\":\"http://36.7.190.229:8801/icon/module/logo1.png\",\"isDefault\":2,\"name\":\"天翼大喇叭\",\"parentId\":2004,\"resource\":\"https://api.sdccx.cn/app/download.html?name=pro/%E6%9D%91%E6%9D%91%E4%BA%AB.apk\",\"sort\":2,\"type\":\"1\"},{\"children\":[],\"chooseId\":2024,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/images/202005/1588933721185.png\",\"id\":2024,\"isDefault\":2,\"name\":\"村务公开\",\"parentId\":2004,\"resource\":\"28\",\"sort\":3,\"type\":\"2\"},{\"children\":[],\"chooseId\":2029,\"comments\":\"\",\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/images/202006/1592987576620.png\",\"id\":2029,\"image\":\"\",\"isDefault\":2,\"name\":\"便民服务\",\"parentId\":2004,\"resource\":\"/convenient/services/index\",\"sort\":4,\"type\":\"4\"}],\"chooseId\":2004,\"comments\":\"\",\"deptId\":\"1\",\"icon\":\"\",\"id\":2004,\"image\":\"\",\"isDefault\":2,\"name\":\"治理有效\",\"parentId\":0,\"resource\":\"\",\"sort\":2,\"type\":\"\"},{\"children\":[{\"children\":[],\"chooseId\":2017,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917764874.png\",\"id\":2017,\"isDefault\":2,\"name\":\"随手拍\",\"parentId\":2002,\"resource\":\"/convenient/follow\",\"sort\":1,\"type\":\"4\"}],\"chooseId\":2002,\"deptId\":\"1\",\"id\":2002,\"isDefault\":2,\"name\":\"生态宜居\",\"parentId\":0,\"sort\":3},{\"children\":[{\"children\":[],\"chooseId\":2018,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917789112.png\",\"id\":2018,\"isDefault\":2,\"name\":\"村容村貌\",\"parentId\":2003,\"resource\":\"461\",\"sort\":1,\"type\":\"2\"},{\"children\":[],\"chooseId\":2019,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917842459.png\",\"id\":2019,\"isDefault\":2,\"name\":\"志愿者活动\",\"parentId\":2003,\"resource\":\"/convenient/activity\",\"sort\":2,\"type\":\"4\"},{\"children\":[],\"chooseId\":2020,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917867741.png\",\"id\":2020,\"isDefault\":2,\"name\":\"文艺活动\",\"parentId\":2003,\"resource\":\"608\",\"sort\":3,\"type\":\"2\"},{\"children\":[],\"chooseId\":2021,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583918020236.png\",\"id\":2021,\"isDefault\":2,\"name\":\"积分银行\",\"parentId\":2003,\"resource\":\"/convenient/exchange?changeType=user\",\"sort\":4,\"type\":\"4\"}],\"chooseId\":2003,\"deptId\":\"1\",\"id\":2003,\"isDefault\":2,\"name\":\"乡风文明\",\"parentId\":0,\"sort\":4},{\"children\":[{\"children\":[],\"chooseId\":2013,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917420592.png\",\"id\":2013,\"isDefault\":2,\"name\":\"就业信息\",\"parentId\":2001,\"resource\":\"/convenient/recruitment\",\"sort\":1,\"type\":\"4\"},{\"children\":[],\"chooseId\":2014,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917464876.png\",\"id\":2014,\"isDefault\":2,\"name\":\"产业介绍\",\"parentId\":2001,\"resource\":\"635\",\"sort\":2,\"type\":\"2\"},{\"children\":[],\"chooseId\":2015,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917511273.png\",\"id\":2015,\"isDefault\":2,\"name\":\"一村一品\",\"parentId\":2001,\"resource\":\"/business\",\"sort\":3,\"type\":\"4\"},{\"children\":[],\"chooseId\":2016,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/icon/module/1583917567522.png\",\"id\":2016,\"isDefault\":2,\"name\":\"乡镇旅游\",\"parentId\":2001,\"resource\":\"/travel\",\"sort\":4,\"type\":\"4\"}],\"chooseId\":2001,\"comments\":\"\",\"deptId\":\"1\",\"icon\":\"\",\"id\":2001,\"image\":\"\",\"isDefault\":2,\"name\":\"产业兴旺\",\"parentId\":0,\"resource\":\"\",\"sort\":5,\"type\":\"\"},{\"children\":[{\"children\":[],\"chooseId\":2027,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/images/202006/1591161816435.png\",\"id\":2027,\"isDefault\":2,\"name\":\"扶贫成果\",\"parentId\":2005,\"resource\":\"576\",\"sort\":1,\"type\":\"2\"},{\"children\":[],\"chooseId\":2028,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/images/202006/1591161839522.png\",\"id\":2028,\"isDefault\":2,\"name\":\"富裕之路\",\"parentId\":2005,\"resource\":\"638\",\"sort\":2,\"type\":\"2\"}],\"chooseId\":2005,\"deptId\":\"1\",\"id\":2005,\"isDefault\":2,\"name\":\"生活富裕\",\"parentId\":0,\"sort\":6},{\"children\":[{\"children\":[],\"chooseId\":2031,\"deptId\":\"1\",\"icon\":\"https://api.sdccx.cn/images/202007/1593758990404.png\",\"id\":2031,\"isDefault\":2,\"name\":\"返乡报备\",\"parentId\":2030,\"resource\":\"/ReportedSzxc\",\"sort\":1,\"type\":\"4\"}],\"chooseId\":2030,\"deptId\":\"1\",\"id\":2030,\"isDefault\":2,\"name\":\"疫情防护\",\"parentId\":0,\"sort\":8}]}";
        ModuleEntity moduleEntity = new Gson().fromJson(json, ModuleEntity.class);
        for (int i = 0; i < moduleEntity.getData().size(); i++) {
            List<ModuleEntity.DataDTO.ChildrenDTO> list = moduleEntity.getData().get(i).getChildren();
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getType().equals("2")) {
                    ModuleEntity.DataDTO.ChildrenDTO childrenDTO = list.get(j);
                    updateUrl(childrenDTO.getIsDefault() + "", childrenDTO.getComments(), childrenDTO.getImage(), childrenDTO.getId() + "", childrenDTO.getSort() + "", URLEncoder.encode(childrenDTO.getName()), URLEncoder.encode(childrenDTO.getIcon()), URLEncoder.encode("/info/" + childrenDTO.getResource() + "?title=" + childrenDTO.getName()), childrenDTO.getParentId() + "");
                }
                System.out.println(list.get(j).getName());
            }


        }
        //https://gxlb.sdccx.cn:8807/fun/module/update?isDefault=2
        // &id=2006
        // &name=%E5%85%9A%E5%BB%BA%E5%8A%A8%E6%80%81
        // &icon=https%3A%2F%2Fapi.sdccx.cn%2Ficon%2Fmodule%2F1583915221275.png
        // &deptId=1
        // &type=4
        // &resource=/info/25?title=党建动态
        // &image=
        // &comments=&sort=1
        // &roleId=
        // &parentId=2000
//        String aa=LoginByPost("https://gxlb.sdccx.cn:8807/fun/module/update?isDefault=2&id=2006&name=%E5%85%9A%E5%BB%BA%E5%8A%A8%E6%80%81&icon=https%3A%2F%2Fapi.sdccx.cn%2Ficon%2Fmodule%2F1583915221275.png&deptId=1&type=4&resource="+URLEncoder.encode("/info/25?title=党建动态")+"&image=&comments=&sort=1&roleId=&parentId=2000");
//
//        System.out.println(aa);
    }


    static void updateUrl(String isDefault, String comments, String image, String id, String sort, String name, String icon, String resource, String parentId) {
        String url = "https://gxlb.sdccx.cn:8807/fun/module/update?isDefault=" + isDefault + "&image=" + image + "&comments=" + comments + "&sort=" + sort + "&roleId=&type=4&deptId=1&id=" + id + "&name=" + name + "&icon=" + icon + "&resource=" + resource + "&parentId=" + parentId;
        System.out.println("aaa:" + url);

//        LoginByPost(url);
    }


    public static String LoginByPost(String url) {
        System.out.println(url);
        String msg = "";
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            //设置请求方式,请求超时信息
            conn.setRequestMethod("POST");
            conn.setReadTimeout(50000);
            conn.setConnectTimeout(50000);
            //设置运行输入,输出:
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //Post方式不能缓存,需手动设置为false
            conn.setUseCaches(false);
            conn.addRequestProperty("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyZWFsTmFtZSI6IuS7mOixqiIsInBob25lIjoiYWRtaW4iLCJsYXN0SXAiOiIxNC4xMDQuODcuOSIsInBhcnR5TWVtYmVySWQiOiIwIiwicm9sZUlkIjoiMSIsIm5pY2tOYW1lIjoi6LaF57qn566h55CG5ZGYIiwicm9sZU5hbWUiOiJhZG1pbiIsImRlcHRJZCI6IjEiLCJleHAiOjE2NTMxMTU2MjMsInVzZXJJZCI6IjEifQ.8TFRWrslLKIpIHPxHgPomnu_-8Mg_CB5p9K385sJyJs");
            //我们请求的数据:
//            String data = "passwd="+ URLEncoder.encode(passwd, "UTF-8")+
//                    "&number="+ URLEncoder.encode(number, "UTF-8");
            //这里可以写一些请求头的东东...
            //获取输出流
//            OutputStream out = conn.getOutputStream();
//            out.write(data.getBytes());
//            out.flush();

            if (conn.getResponseCode() == 200) {
                // 获取响应的输入流对象
                InputStream is = conn.getInputStream();
                // 创建字节输出流对象
                ByteArrayOutputStream message = new ByteArrayOutputStream();
                // 定义读取的长度
                int len = 0;
                // 定义缓冲区
                byte buffer[] = new byte[1024];
                // 按照缓冲区的大小，循环读取
                while ((len = is.read(buffer)) != -1) {
                    // 根据读取的长度写入到os对象中
                    message.write(buffer, 0, len);
                }
                // 释放资源
                is.close();
                message.close();
                // 返回字符串
                msg = new String(message.toByteArray());
                System.out.println("aaaaaaaa");
                return msg;
            } else {
                System.out.println("bbbbbb:" + conn.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }


    public static String getHttp(String get_url) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL(get_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5 * 1000);//链接超时
            urlConnection.setReadTimeout(5 * 1000);//返回数据超时
            //getResponseCode (1.200请求成功 2.404请求失败)
            String ip = "14.104.83.46";
            ip="114.44.227.87";
            ip="211.139.74.234";
            ip="203.186.145.250";
            ip="113.52.111.109";
            ip="1.189.13.41";
            ip="117.68.116.112";
            urlConnection.addRequestProperty("x-forwarded-for", ip);
            urlConnection.addRequestProperty("x-remote-IP", ip);
            urlConnection.addRequestProperty("x-remote-ip", ip);
            urlConnection.addRequestProperty("x-client-ip", ip);
            urlConnection.addRequestProperty("x-client-IP", ip);
            urlConnection.addRequestProperty("X-Real-IP", ip);
            urlConnection.addRequestProperty("client-IP", ip);
            urlConnection.addRequestProperty("x-originating-IP", ip);
            urlConnection.addRequestProperty("x-remote-addr", ip);
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

    static void createFile() {
        File file2 = new File("./src/file/");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            File file = new File("./src/file/" + getNowTime() + ".txt");
            if (file.createNewFile())
                System.out.println("文件创建成功！");
            else
                System.out.println("出错了，该文件已经存在。");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static String getNowTime() {
        java.text.SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd.HH-mm-ss");
        return format.format(new Date());
    }
}
