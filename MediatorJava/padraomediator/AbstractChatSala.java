package padraomediator;

//Classe abstrata responsável pela mediação
public abstract class AbstractChatSala
{
	public abstract void Registro(Participante participante);
	public abstract void Enviar(String de, String para, String message);
}