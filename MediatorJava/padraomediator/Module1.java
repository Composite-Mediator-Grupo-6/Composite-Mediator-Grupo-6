package padraomediator;

public final class Module1
{

	public static void main(String[] args)
	{
		//Inicia um novo chat
		Chatsala chatsala = new Chatsala();

		//Cria os Participantes do chat
		Participante Samuel = new Membro("Samuel");
		Participante Rafaella = new Membro("Rafaella");
		Participante Lucas = new Membro("Lucas");
		Participante Kaique = new Membro("Kaique");
		Participante Tiago = new NaoMembro("Tiago");
		Participante Matheus = new NaoMembro("Matheus");

		//registra os participantes
		chatsala.Registro(Samuel);
		chatsala.Registro(Rafaella);
		chatsala.Registro(Lucas);
		chatsala.Registro(Kaique);
		chatsala.Registro(Tiago);
		chatsala.Registro(Matheus);

		// Inicia o chat 
		Rafaella.Enviar("Tiago", "Olá, Tiago!");
		Tiago.Enviar("Rafaella", "Como vai você?");
		Rafaella.Enviar("Tiago", "Tudo bem!");
		Tiago.Enviar("Lucas", "Como você esta ?");
		Lucas.Enviar("Tiago", "Tudo tranquilo...");
	}

}