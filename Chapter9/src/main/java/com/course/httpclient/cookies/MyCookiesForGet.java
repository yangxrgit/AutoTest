package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForGet {
    //配置优化方法

    private String url;
    private ResourceBundle bundle;//用它可以轻松的读取配置文件
    private CookieStore store;//用来存储cookies信息的变量

    @BeforeTest
    public void beforeTest(){
        //读取resourse/applicaitio.properties文件
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);//读取配置文件，默认后缀为.properties，所以这里只写文件名即可
        url = bundle.getString("test.url");//读取配置文件中的test.url的值
    }

    @Test
    public void TestGetCookies() throws IOException {
        String result;

        //从测试文件中 拼接测试的url
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url+uri;

        //测试逻辑代码书写
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie:cookieList){
            String name = cookie.getName();
            String value =cookie.getValue();
            System.out.println("cookie name = "+name+"; cookie value = "+value);
        }
    }

    @Test(dependsOnMethods = {"TestGetCookies"})
    public void testGetWithCookies() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        String testUrl = this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        //设置cookies信息
        client.setCookieStore(this.store);

        HttpResponse response = client.execute(get);

        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode="+statusCode);

        if (statusCode == 200){
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }
    }

}
