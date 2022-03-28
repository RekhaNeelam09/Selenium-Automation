package testngListeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer
{
	public void transform(ITestAnnotation iTestAnnotation, Class arg0, Constructor arg1, Method arg2)
	{
		IRetryAnalyzer retry = iTestAnnotation.getRetryAnalyzer(); 
		
		if(retry == null)
		{
			iTestAnnotation.setRetryAnalyzer(Retry.class);
		}
		
	}

}
