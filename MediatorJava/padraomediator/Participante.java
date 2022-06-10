package padraomediator;

public abstract class Participante
{

	private Chatsala _chatsala;
	private String _nome;

	// Construtor
	public Participante(String nome)
	{
		this._nome = nome;
	}

	// Pega o nome do participante
	public final String getNome()
	{
		return _nome;
	}

	// Pega a sala de chat
	public final Chatsala getChatsala()
	{
		return _chatsala;
	}
	public final void setChatsala(Chatsala value)
	{
		_chatsala = value;
	}

	// Envia mensagem para um participante
	public final void Enviar(String para, String mensagem)
	{
		_chatsala.Enviar(_nome, para, mensagem);
	}

	// Recebe mensagem de um participante
	public void Receber(String de, String mensagem)
	{
		System.out.printf("%1$s para %2$s: '%3$s'" + "\r\n", de, getNome(), mensagem);
	}

}