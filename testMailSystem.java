
/**
 * Realiza una serie de test para verificar las funcionalidades de
 * las clases del proyecto.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testMailSystem
{
    // Simula un primer usuario de correo.
    private MailClient primerUsuario;
    // Simula un segundo usuario de correo.
    private MailClient segundoUsuario;
    // Simula nuestro servidor de correo.
    private MailServer grupoDServer;

    /**
     * Constructor for objects of class testMailSystem
     */
    public testMailSystem()
    {
        grupoDServer = new MailServer();
        primerUsuario = new MailClient(grupoDServer,"Agapito");
        segundoUsuario = new MailClient(grupoDServer,"Eutanasia");
    }

}
