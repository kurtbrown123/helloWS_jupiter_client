package cli;

/**
 * Created by kurtb on 3/2/14.
 */
public class helloWS_client_jup_main
{
    // copied
    public static void main(String[] argv)
    {
        try
        {
            HelloWorldLocator locator = new HelloWorldLocator();
            HelloWorldPortType service = locator.getHelloWorldHttpSoap12Endpoint();
            // If authorization is required
            //((HelloWorldSoapBindingStub)service).setUsername("user3");
            //((HelloWorldSoapBindingStub)service).setPassword("pass3");
            // invoke business method
            String response = service.sayHelloWorldFrom("Kurt");
            System.out.println(response);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
