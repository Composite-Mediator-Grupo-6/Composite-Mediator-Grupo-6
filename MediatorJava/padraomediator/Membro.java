package padraomediator;


public class Membro extends Participante
{
	// Construtor
	public Membro(String nome)
	{
		super(nome);
	}

	//Sobrescreve o método Receber
	@Override
	public void Receber(String de, String mensagem)
	{
		System.out.print("para Membro : ");
		super.Receber(de, mensagem);
	}
}