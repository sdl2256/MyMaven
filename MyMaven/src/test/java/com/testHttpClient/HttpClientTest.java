package com.testHttpClient;

/**
 * Created by SDL on 2015/4/13.
 */
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientTest {

    @Test
    public void jUnitTest() {
        get();
    }

    /**
     * post��ʽ�ύ����ģ���û���¼����
     */
    public void postForm() {
        // ����Ĭ�ϵ�httpClientʵ��.
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // ����httppost
        HttpPost httppost = new HttpPost("http://localhost:8080/myDemo/Ajax/serivceJ.action");
        // ������������
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("username", "admin"));
        formparams.add(new BasicNameValuePair("password", "123456"));
        UrlEncodedFormEntity uefEntity;
        try {
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(uefEntity);
            System.out.println("executing request " + httppost.getURI());
            HttpResponse response;
            response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                System.out.println("--------------------------------------");
                System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
                System.out.println("--------------------------------------");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ر�����,�ͷ���Դ
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ���� post������ʱ���Ӧ�ò����ݴ��ݲ�����ͬ���ز�ͬ���
     */
    public void post() {
        // ����Ĭ�ϵ�httpClientʵ��.
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // ����httppost
        HttpPost httppost = new HttpPost("http://localhost:8080/myDemo/Ajax/serivceJ.action");
        // ������������
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("type", "house"));
        UrlEncodedFormEntity uefEntity;
        try {
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(uefEntity);
            System.out.println("executing request " + httppost.getURI());
            HttpResponse response;
            response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                System.out.println("--------------------------------------");
                System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
                System.out.println("--------------------------------------");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ر�����,�ͷ���Դ
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ���� get����
     */
    public void get() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            // ����httpget.
            HttpGet httpget = new HttpGet("http://www.baidu.com/");
            System.out.println("executing request " + httpget.getURI());
            // ִ��get����.
            HttpResponse response = httpclient.execute(httpget);
            // ��ȡ��Ӧʵ��
            HttpEntity entity = response.getEntity();
            System.out.println("--------------------------------------");
            // ��ӡ��Ӧ״̬
            System.out.println(response.getStatusLine());
            if (entity != null) {
                // ��ӡ��Ӧ���ݳ���
                System.out.println("Response content length: " + entity.getContentLength());
                // ��ӡ��Ӧ����
                System.out.println("Response content: " + EntityUtils.toString(entity));
            }
            System.out.println("------------------------------------");
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ر�����,�ͷ���Դ
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * �ϴ��ļ�
     */
    public void upload() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost("http://localhost:8080/myDemo/Ajax/serivceFile.action");

            FileBody bin = new FileBody(new File("F:\\image\\sendpix0.jpg"));
            StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);

            HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("bin", bin).addPart("comment", comment).build();

            httppost.setEntity(reqEntity);

            System.out.println("executing request " + httppost.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httppost);
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                System.out.println("Response content length: " + resEntity.getContentLength());
            }
            EntityUtils.consume(resEntity);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
