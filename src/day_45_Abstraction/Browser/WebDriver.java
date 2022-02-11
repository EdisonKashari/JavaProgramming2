package day_45_Abstraction.Browser;

public interface WebDriver extends SearchContext {

    abstract void get(String url);

    abstract void close();

    abstract void quit();

    abstract void getTitle();

}
/*
Browsers Task:
	1. Create an interface named SearchContext
				Abstract methods:
					findElement(String locator);
					findElements(String locator);

	2. Create a child interface of SearchContext named WebDriver
				Abstract methods (return-type is void):
					get(String url);
					close();
					quit();
					getTitle();

	3. Create an interface named TakeScreenShot:
				Abstract methods:
					takeScreenShot();

	4. Creat an interface named JavaScriptExecuter
				Abstract methods:
					executeScript(String script);
 */