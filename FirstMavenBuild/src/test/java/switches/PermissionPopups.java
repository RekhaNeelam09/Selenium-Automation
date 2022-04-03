package switches;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopups 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		HashMap<String, Integer> contentSetting = new HashMap<String,Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		// https://chromium.googlesource.com/chromium/src/+7e762c1f17514a29834506860961ba2f24e7e6e5/components/content_settings/core/common/pref_names.cc
		// plugins , Images , javascripts , cookies , popups
		contentSetting.put("geolocation", 2);
		// contentSetting.put("media_stream", 0); // For Ex , if we want for media_streams
		// contentSetting.put("notifications", 1); // For Ex , if we want for notifications
		
		profile.put("managed_default_content_settings", contentSetting);
		prefs.put("profile", prefs);
		option.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://whatmylocation.com/");

	}

}
