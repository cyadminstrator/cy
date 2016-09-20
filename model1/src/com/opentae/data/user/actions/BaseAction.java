package com.opentae.data.user.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BaseAction {

	    protected String rows;
	    protected String page;
	    protected Integer functionId;
	    protected String pstring;
	    protected Long plong = Long.valueOf(0L);
	    protected Integer pinteger = Integer.valueOf(0);
	    protected JSONArray objArr;
	    protected JSONObject obj;
	    protected String errorMessage;
	    protected String errorString;
	    protected String webSite;

	    public BaseAction() {
	    }

	    protected void createPage(File f, String url) throws IOException {
	        Connection conn = Jsoup.connect(url);
	        conn.timeout('썐');
	        Document dom = conn.get();
	        FileOutputStream fos = new FileOutputStream(f);
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
	        osw.write(dom.html());
	        osw.flush();
	        osw.close();
	        fos.close();
	    }

	    public JSONArray getObjArr() {
	        return this.objArr;
	    }

	    public void setObjArr(JSONArray objArr) {
	        this.objArr = objArr;
	    }

	    public JSONObject getObj() {
	        return this.obj;
	    }

	    public void setObj(JSONObject obj) {
	        this.obj = obj;
	    }

	    public Integer getFunctionId() {
	        return this.functionId;
	    }

	    public void setFunctionId(Integer functionId) {
	        this.functionId = functionId;
	    }

	    public String getRows() {
	        return this.rows;
	    }

	    public void setRows(String rows) {
	        this.rows = rows;
	    }

	    public String getPage() {
	        return this.page;
	    }

	    public void setPage(String page) {
	        this.page = page;
	    }

	    public String getPstring() {
	        return this.pstring;
	    }

	    public void setPstring(String pstring) {
	        this.pstring = pstring;
	    }

	    public Long getPlong() {
	        return this.plong;
	    }

	    public void setPlong(Long plong) {
	        this.plong = plong;
	    }

	    public Integer getPinteger() {
	        return this.pinteger;
	    }

	    public void setPinteger(Integer pinteger) {
	        this.pinteger = pinteger;
	    }

	    public String getErrorMessage() {
	        return this.errorMessage;
	    }

	    public void setErrorMessage(String errorMessage) {
	        this.errorMessage = errorMessage;
	    }

	    public String getWebSite() {
	        return this.webSite;
	    }

	    public void setWebSite(String webSite) {
	        this.webSite = webSite;
	    }

	    public String getErrorString() {
	        return this.errorString;
	    }

	    public void setErrorString(String errorString) {
	        this.errorString = errorString;
	    }

	    public String init() {
	        this.setFunctionId(this.functionId);
	        this.setPstring(this.pstring);
	        this.setPlong(this.plong);
	        this.setPinteger(this.pinteger);
	        return "init";
	    }

}