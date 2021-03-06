package com.meidusa.demo.web.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.meidusa.demo.dal.model.InstallEmployee;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InstallEmployeeAction extends BaseUploadAction<InstallEmployee, Cookie> implements
Preparable, ModelDriven<InstallEmployee> {

	private static final long serialVersionUID = 1L;
	
	private static final int BUFFER_SIZE = 16 * 1024 ;
	
	private InstallEmployee model;

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new InstallEmployee(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (InstallEmployee)result.getDefaultModel();
		}		
	}

	@Override
	public InstallEmployee getModel() {
		return model;
	}
	
	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}

	public String uploadPicture() {
		log.info("enter ExpertAction.uploadPicture");
		String imageFileName = this.requestId
				+ getExtention(this.getFileName());
		log.info("imageFileName:"+imageFileName );
		model.setPicture(imageFileName);
		Result result = this.ao.doSave(getModel(), getForeignKey());
		log.info("save result:"+result );
		if (!(result.isSuccess())) {
			log.info("save fail:"+result.getResultCode() );
			ResultCode resultCode = result.getResultCode();
			addActionError(resultCode.getMessage().getMessage());
			return "error";
		}
		File imageFile = new File(ServletActionContext.getServletContext()
				.getRealPath("/UploadImages")
				+ "/" + imageFileName);
		imageFile.deleteOnExit();
		imageFile.setWritable(true);
		log.info("copy file begin,path:"+ServletActionContext.getServletContext()
				.getRealPath("/UploadImages")
				+ "/" + imageFileName );
		copy(this.getFile(), imageFile);
		log.info("copy file end:"+imageFile );
		this.requestId = ((String)result.getModels().get("requestId"));
		log.info("prepare to dispath requestId:"+requestId );
		return Constants.VIEW;
	}
	
	private static void copy(File src, File dst)  {
        try  {
           InputStream in = null ;
           OutputStream out = null ;
            try  {                
               in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
               out = new BufferedOutputStream( new FileOutputStream(dst), BUFFER_SIZE);
                byte [] buffer = new byte [BUFFER_SIZE];
                while (in.read(buffer) > 0 )  {
                   out.write(buffer);
               } 
            } finally  {
                if ( null != in)  {
                   in.close();
               } 
                 if ( null != out)  {
                   out.close();
               } 
           } 
        } catch (Exception e)  {
           e.printStackTrace();
       } 
   } 
   
    private static String getExtention(String fileName)  {
        int pos = fileName.lastIndexOf(".");
        return fileName.substring(pos);
   } 
	
}
