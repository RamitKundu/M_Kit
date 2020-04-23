package com.erev.Survey19.WebAppInitializer;

/*import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.request.RequestContextListener;*/
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.erev.Survey19.WebConfig.WebConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{WebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"/"};
	}
/*///MultiPart.....
	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB
	@Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		logger.debug("Starting of the metnod customizeRegistration");
		//String path = "resources/img/";
		String path = "D://Collaboration";
        File uploadDirectory = new File(path);

        // register a MultipartConfigElement
        MultipartConfigElement multipartConfigElement =
                new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
                        maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

        registration.setMultipartConfig(multipartConfigElement);
        logger.debug("Ending of the metnod customizeRegistration");
    }

//	//To use request scope without Spring MVC, you should declare RequestContextListener in web.xml 
//	public void onStartup(ServletContext servletContext) throws ServletException {
//        //add listener
//        servletContext.addListener(new RequestContextListener());
//	}
//	
*/	
	
	
	
}
