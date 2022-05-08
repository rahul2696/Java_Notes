import java.rmi.*;
import java.util.*;

public interface MyRMIInterface extends Remote 
{
//declare functions here
public double calcDiscount(double purchamt) throws RemoteException;

public double getBalance(int acno) throws RemoteException;

public ArrayList getAccounts(String type) throws RemoteException;

} 