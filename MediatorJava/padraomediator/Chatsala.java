package padraomediator;

import java.util.*;


public class Chatsala extends AbstractChatSala
{
	private HashMap<String, Participante> _participantes = new HashMap<String, Participante>();

	@Override
	public void Registro(Participante _participante)
	{
		if (!_participantes.containsValue(_participante))
		{
			_participantes.put(_participante.getNome(), _participante);
		}

		_participante.setChatsala(this);
	}

	@Override
	public void Enviar(String de, String para, String mensagem)
	{
		Participante _participante = _participantes.get(para);
		if (_participante != null)
		{
			_participante.Receber(de, mensagem);
		}
	}
}