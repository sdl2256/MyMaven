package com.sun.tcpip.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by SDL on 2015/4/13.
 */
/*
import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
*/
public class GetSample{

    /**
     * ���� get����
     */
    public static void get() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            // ����httpget.
            HttpGet httpget = new HttpGet("http://www.baidu.com/");
            System.out.println("executing request " + httpget.getURI());
            // ִ��get����.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
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
            } finally {
                response.close();
            }
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


    public static void main(String[] args) {
        get();
        /*
        //����HttpClient��ʵ��
        HttpClient httpClient = new HttpClient();
        //����GET������ʵ��
        GetMethod getMethod = new GetMethod("http://www.ibm.com");
        //ʹ��ϵͳ�ṩ��Ĭ�ϵĻָ�����
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler());
        try {
            //ִ��getMethod
            int statusCode = httpClient.executeMethod(getMethod);
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: "
                        + getMethod.getStatusLine());
            }
            //��ȡ����
            byte[] responseBody = getMethod.getResponseBody();
            //��������
            System.out.println(new String(responseBody));
        } catch (HttpException e) {
            //�����������쳣��������Э�鲻�Ի��߷��ص�����������
            System.out.println("Please check your provided http address!");
            e.printStackTrace();
        } catch (IOException e) {
            //���������쳣
            e.printStackTrace();
        } finally {
            //�ͷ�����
            getMethod.releaseConnection();
        }
        */
    }
}