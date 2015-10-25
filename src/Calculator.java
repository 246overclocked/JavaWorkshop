import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getStringFromUser() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
    }

	public int getIntFromUser() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
    }

}
