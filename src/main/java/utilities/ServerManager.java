package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.time.Duration;

public class ServerManager {

private static ThreadLocal <AppiumDriverLocalService> server=new ThreadLocal<>();

private void setServer(AppiumDriverLocalService appiumDriverLocalService)
{
	server.set(appiumDriverLocalService);
}
public AppiumDriverLocalService getServer()
{
	return server.get();
}

public void initialiseServer() {
	setServer(new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).
			withIPAddress("127.0.0.1").usingAnyFreePort().
			withLogFile(new File("appium-server.log")).
			withTimeout(Duration.ofMinutes(2)).build());
}
public void startServer()
{
	getServer().start();
	getServer().clearOutPutStreams();
}

public void stopServer()
{
	getServer().stop();
}

}
