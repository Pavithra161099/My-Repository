package Utils;

import org.testng.annotations.DataProvider;

public class DataUtils {

//	@DataProvider(name = "login", indices = {0,1,3})
	@DataProvider(indices = { 0, 1, 2 }, parallel = true) // if we did not give the data provider name, we can use the method name for
	// accessing it.
	public String[][] getData() {
		String[][] data = new String[4][2];
		// 1st row
		data[0][0] = "preethi161099@gmail.com";
		data[0][1] = "PaVi@161099";

		// 2nd row
		data[1][0] = "koushik1@letcode.in";
		data[1][1] = "Pass123$";

		// 3rd row
		data[2][0] = "koushik350@gmail.com";
		data[2][1] = "Pass123$";

		// 4th row
		data[3][0] = "lastdata@gmail.com";
		data[3][1] = "Pass123$";

		return data;

	}
}
