/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MailItem
{
    // The sender of the item.
    private String from;
    // The intended recipient.
    private String to;
    // The text of the message.
    private String message;
    // The subject of the message.
    private String subject;

    /**
     * Create a mail item from sender to the given recipient,
     * containing the given message.
     * @param from The sender of this item.
     * @param to The intended recipient of this item.
     * @param subject The subject of the message to be sent.
     * @param message The text of the message to be sent.
     */
    public MailItem(String from, String to, String subject, String message)
    {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    /**
     * @return The sender of this message.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * @return The intended recipient of this message.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * @return The text of the message.
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     *  Devuelve un valor true si en el mensaje aparece una cadena inválida.
     *  En caso contrario, devuelve false
     */
    public boolean comprobarSpam()
    {
        boolean esSpam = false;
        if (getMessage().toLowerCase().indexOf("viagra") > 0)
        {
            esSpam = true;
        }
        if (getMessage().toLowerCase().indexOf("regalo") > 0)
        {
            esSpam = true;
        }
        return esSpam;
    }
    /**
     * Print this mail message to the text terminal.
     */
    public void print()
    {   
        if(comprobarSpam())
        {
            System.out.println("Se ha recibido Spam");
        }
        else
        {
            System.out.println("From: " + from);
            System.out.println("To: " + to);
            System.out.println("subject: " + subject);
            System.out.println("Message: " + message);
        }
    }
}
