import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class RegistrarCuenta extends UnicastRemoteObject implements GestionCuentas {
    private Map<String, String> cuentas = new HashMap<>();

    public RegistrarCuenta() throws RemoteException {
        super();
    }

    @Override
    public boolean registrarCuenta(String username, String password) throws RemoteException {
        if (!cuentas.containsKey(username)) {
            cuentas.put(username, password);
            System.out.println("Cuenta registrada: " + username);
            return true; // Registro exitoso
        } else {
            System.out.println("El usuario ya existe: " + username);
            return false; // El usuario ya existe
        }
    }

    @Override
    public boolean iniciarSesion(String username, String password) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarSesion'");
    }

    @Override
    public boolean cerrarSesion(String username) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cerrarSesion'");
    }

    @Override
    public boolean actualizarInformacion(String username, String nuevaInfo) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarInformacion'");
    }
}
