package com.sun.resume;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
/**
 * Created by SDL on 2015/5/6.
 */
public class LoadOut extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String fileName = "导出的简历.doc";// 输出文件名
        String modelName = "out.xml";// 模板名称
        // 设置编码格式为utf8
        resp.setCharacterEncoding("utf-8");
        // 设置输出为word
        resp.setContentType("application/vnd.ms-word");
        // 给文件取名字并设置编码格式
        resp.setHeader("content-disposition", "attachment; filename="
                + new String(fileName.getBytes("GB2312"), "ISO-8859-1"));
        Configuration configuration = new Configuration();
        configuration.setDefaultEncoding("UTF-8");
        Template t = null;
        Writer out = null;
        Map<String, Object> dataMap = new HashMap<String, Object>();
        // 1.将参数放入集合中，打包数据
        dataMap.put("username", req.getParameter("user"));// 说明：模板文件中有${author}与之对应
        dataMap.put("sex", req.getParameter("sex"));
        dataMap.put("birthday", req.getParameter("birthday"));
        dataMap.put("address", req.getParameter("address"));
        dataMap.put("remark", req.getParameter("remark"));
        try {
            // 2.导入模板
            configuration.setClassForTemplateLoading(this.getClass(),
                    "/modelPath");
            t = configuration.getTemplate(modelName);
            // 3.导出文件，输出内容
            out = new BufferedWriter(new OutputStreamWriter(
                    resp.getOutputStream(), "utf-8"));
            t.process(dataMap, out);
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输出流
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
