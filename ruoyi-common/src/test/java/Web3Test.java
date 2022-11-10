import org.tron.trident.core.ApiWrapper;
import org.tron.trident.proto.Response;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;

/**
 * @author xuweixuan
 * @version 1.0
 * @date 2022/11/10 15:38
 */
public class Web3Test {
    public static void main(String[] args) throws IOException  {
        Web3j web3j = Web3j.build(new HttpService("https://bsc-dataseed.binance.org/"));

        // String web3ClientVersion = web3j.web3ClientVersion().send().getWeb3ClientVersion();

        BigInteger integer = web3j.ethGetBalance("0x1C697f76a917E8995b93B0cD5b7F7BfF35daB93B", DefaultBlockParameterName.LATEST).send().getBalance();
        System.out.println(integer);
        // System.out.println("version=" + web3ClientVersion);
        web3j.shutdown();
    }

    // public static void main(String[] args) throws IOException  {
    //     // , "fe65d452-9775-421e-ad99-4cc0c67620c7"
    //     ApiWrapper wrapper = ApiWrapper.ofNile("cacff90e3ea73305899e81d4dc69bd8da9df47b4e812b3b60e60977812eed7b0");
    //     Response.AccountResourceMessage account = wrapper.getAccountResource("TYJeWHtNYDZfFaeH1diXs6HuWoGm5LPJqv");
    //     System.out.println(account);
    // }
}
