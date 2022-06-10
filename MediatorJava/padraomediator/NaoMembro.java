package padraomediator;

public class NaoMembro extends Participante
{
	// Construtor da clasee
	public NaoMembro(String nome)
	{
		super(nome);
	}
	//Sobrescreve o método de recebimento
	@Override
	public void Receber(String de, String mensagem)
	{
		System.out.print("Para NaoMembro : ");
		super.Receber(de, mensagem);
	}
}