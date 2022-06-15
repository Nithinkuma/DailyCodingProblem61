import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String number1 = br.readLine();
        String number2 = br.readLine();
        long x = Integer.parseInt(number1);
        int y = Integer.parseInt(number2);

        userDefinedPowerFunction(x,y);
    }

    private static void userDefinedPowerFunction(long x, int y) {
        long nn = y;
        if(nn<0)
            nn = -1*nn;

        double ans = 1;

        while(nn>=1){
            if(nn%2==0){
                x*=x;
                nn=nn/2;
            }
            else{
                ans*=x;
                nn=nn-1;
            }
        }
        if(y<0)
            ans = (double)(1.0)/(double)ans;

        System.out.println(ans);
    }
}
